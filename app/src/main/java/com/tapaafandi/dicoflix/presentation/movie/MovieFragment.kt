package com.tapaafandi.dicoflix.presentation.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.adapter.MovieAdapter
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.databinding.FragmentMovieBinding
import com.tapaafandi.dicoflix.presentation.detail.DetailActivity
import com.tapaafandi.dicoflix.utils.Constants.MOVIE_TYPE
import com.tapaafandi.dicoflix.viewmodel.ViewModelFactory

class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel
    private lateinit var movieAdapter: MovieAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            binding.pbMovie.visibility = View.VISIBLE
            movieAdapter = MovieAdapter()
            viewModel.getMovies().observe(viewLifecycleOwner, { movies ->
                binding.pbMovie.visibility = View.GONE
                movieAdapter.setMovies(movies)
                movieAdapter.notifyDataSetChanged()
            })

            recyclerViewSetup()

        }
    }

    private fun recyclerViewSetup() {
        with(binding.rvMovies) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }

        movieAdapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
            override fun onItemClicked(data: MovieEntity) {
                Intent(requireContext(), DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL, data.id)
                    putExtra(DetailActivity.EXTRA_TYPE, MOVIE_TYPE)
                    startActivity(this)
                }
            }
        })
    }
}