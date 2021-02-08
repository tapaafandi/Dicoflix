package com.tapaafandi.dicoflix.presentation.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.domain.model.TvShow
import com.tapaafandi.dicoflix.utils.DataDummy

class DetailViewModel(private val dicoflixRepository: DicoflixRepository) : ViewModel() {

    private var movieId: Int = 0
    private var tvShowId: Int = 0

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun setSelectedTvShow(tvShowId: Int) {
        this.tvShowId = tvShowId
    }

    fun getMovie(): LiveData<MovieEntity> = dicoflixRepository.getMovieDetail(movieId)

    fun getTvShow(): LiveData<TvShowEntity> = dicoflixRepository.getTvShowDetail(tvShowId)
}