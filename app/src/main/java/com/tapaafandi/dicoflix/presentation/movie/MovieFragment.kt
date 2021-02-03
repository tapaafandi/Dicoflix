package com.tapaafandi.dicoflix.presentation.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.adapter.MovieAdapter
import com.tapaafandi.dicoflix.databinding.FragmentMovieBinding

class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel
    private lateinit var movieAdapter: MovieAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        if (activity != null) {
            viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
            requestMovie()
            recyclerViewSetup()
        }
    }

    private fun requestMovie() {
        val movies = viewModel.getMovies()
        movieAdapter = MovieAdapter()
        movieAdapter.setMovies(movies)
    }

    private fun recyclerViewSetup() {
        with(binding.rvMovies) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = movieAdapter
        }
    }

}