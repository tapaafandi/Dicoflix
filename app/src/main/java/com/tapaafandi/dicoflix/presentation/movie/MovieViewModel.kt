package com.tapaafandi.dicoflix.presentation.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.utils.DataDummy

class MovieViewModel(private val dicoflixRepository: DicoflixRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntity>> = dicoflixRepository.getAllMovies()

}