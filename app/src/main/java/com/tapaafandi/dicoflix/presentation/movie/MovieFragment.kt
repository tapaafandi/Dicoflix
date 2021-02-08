package com.tapaafandi.dicoflix.presentation.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.adapter.MovieAdapter
import com.tapaafandi.dicoflix.databinding.FragmentMovieBinding
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

            requestMovie()
            recyclerViewSetup()

        }
    }

    private fun requestMovie() {
        movieAdapter = MovieAdapter()
        viewModel.getMovies().observe(viewLifecycleOwner, { movies ->
            movieAdapter.setMovies(movies)
        })
    }

    private fun recyclerViewSetup() {
        with(binding.rvMovies) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

}