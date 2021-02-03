package com.tapaafandi.dicoflix.presentation.detail

import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.domain.model.TvShow
import com.tapaafandi.dicoflix.utils.DataDummy

class DetailViewModel : ViewModel() {

    private var movieId: Int = 0
    private var tvShowId: Int = 0

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun getDetailMovie(): Movie {
        lateinit var movie: Movie
        val moviesEntities = DataDummy.generateDummyMovies()
        for (movieEntity in moviesEntities) {
            if (movieEntity.id == this.movieId) {
                movie = movieEntity
            }
        }
     return movie
    }

    fun setSelectedTvShow(tvShowId: Int) {
        this.tvShowId = tvShowId
    }

    fun getDetailTvShow(): TvShow {
        lateinit var tvShow: TvShow
        val tvShowEntities = DataDummy.generateTvShows()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.id == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}