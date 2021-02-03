package com.tapaafandi.dicoflix.presentation.tv_show

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.adapter.MovieAdapter
import com.tapaafandi.dicoflix.adapter.TvShowAdapter
import com.tapaafandi.dicoflix.databinding.FragmentTvShowBinding
import com.tapaafandi.dicoflix.presentation.movie.MovieViewModel

class TvShowFragment : Fragment(R.layout.fragment_tv_show) {

    private lateinit var binding: FragmentTvShowBinding
    private lateinit var viewModel: TvShowViewModel
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTvShowBinding.bind(view)

        if (activity != null) {
            viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            requestMovie()
            recyclerViewSetup()
        }
    }

    private fun requestMovie() {
        val tvShow = viewModel.getTvShows()
        tvShowAdapter = TvShowAdapter()
        tvShowAdapter.setTvShow(tvShow)
    }

    private fun recyclerViewSetup() {
        with(binding.rvTvShow) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = tvShowAdapter
        }
    }

}