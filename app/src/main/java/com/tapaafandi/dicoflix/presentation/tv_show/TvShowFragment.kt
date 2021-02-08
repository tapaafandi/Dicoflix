package com.tapaafandi.dicoflix.presentation.tv_show

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.adapter.TvShowAdapter
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.databinding.FragmentTvShowBinding
import com.tapaafandi.dicoflix.presentation.detail.DetailActivity
import com.tapaafandi.dicoflix.utils.Constants
import com.tapaafandi.dicoflix.viewmodel.ViewModelFactory

class TvShowFragment : Fragment(R.layout.fragment_tv_show) {

    private lateinit var binding: FragmentTvShowBinding
    private lateinit var viewModel: TvShowViewModel
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTvShowBinding.bind(view)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            binding.pbTvShow.visibility = View.VISIBLE
            tvShowAdapter = TvShowAdapter()
            viewModel.getTvShows().observe(viewLifecycleOwner, { tvShows ->
                binding.pbTvShow.visibility = View.GONE
                tvShowAdapter.setTvShow(tvShows)
                tvShowAdapter.notifyDataSetChanged()
            })

            recyclerViewSetup()
        }
    }

    private fun recyclerViewSetup() {
        with(binding.rvTvShow) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = tvShowAdapter
        }

        tvShowAdapter.setOnItemClickCallback(object : TvShowAdapter.OnItemClickCallback {
            override fun onItemClicked(data: TvShowEntity) {
                Intent(requireContext(), DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL, data.id)
                    putExtra(DetailActivity.EXTRA_TYPE, Constants.TV_SHOW_TYPE)
                    startActivity(this)
                }
            }
        })
    }
}