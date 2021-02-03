package com.tapaafandi.dicoflix.presentation.movie

import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<Movie> = DataDummy.generateDummyMovies()
}