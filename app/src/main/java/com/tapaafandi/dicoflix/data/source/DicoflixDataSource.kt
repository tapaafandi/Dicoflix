package com.tapaafandi.dicoflix.data.source

import androidx.lifecycle.LiveData
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity

interface DicoflixDataSource {

    fun getAllMovies(): LiveData<List<MovieEntity>>

    fun getMovieDetail(movieId: Int): LiveData<MovieEntity>

    fun getAllTvShows(): LiveData<List<TvShowEntity>>

    fun getTvShowDetail(tvShowId: Int): LiveData<TvShowEntity>

}