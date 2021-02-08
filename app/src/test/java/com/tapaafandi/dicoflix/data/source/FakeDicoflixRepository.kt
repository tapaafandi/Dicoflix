package com.tapaafandi.dicoflix.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.data.source.remote.RemoteDataSource
import com.tapaafandi.dicoflix.data.source.remote.response.MovieResponse
import com.tapaafandi.dicoflix.data.source.remote.response.TvShowResponse
import org.junit.Assert.*

class FakeDicoflixRepository(private val remoteDataSource: RemoteDataSource): DicoflixDataSource {

    override fun getAllMovies(): LiveData<List<MovieEntity>> {
        val movieResults = MutableLiveData<List<MovieEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in movieResponses) {
                    val movie = MovieEntity(
                        response.id,
                        response.title,
                        response.overview,
                        response.releaseDate,
                        response.posterPath,
                        response.genre,
                        response.director
                    )
                    movieList.add(movie)
                }
                movieResults.postValue(movieList)
            }
        })
        return movieResults
    }

    override fun getAllTvShows(): LiveData<List<TvShowEntity>> {
        val tvShowResults = MutableLiveData<List<TvShowEntity>>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvShowsResponses: List<TvShowResponse>) {
                val tvShowList = ArrayList<TvShowEntity>()
                for (response in tvShowsResponses) {
                    val tvShow = TvShowEntity(
                        response.id,
                        response.title,
                        response.overview,
                        response.releaseYear,
                        response.posterPath,
                        response.genre,
                        response.creatorName
                    )
                    tvShowList.add(tvShow)
                }
                tvShowResults.postValue(tvShowList)
            }
        })
        return tvShowResults
    }

    override fun getMovieDetail(movieId: Int): LiveData<MovieEntity> {
        val movieResult = MutableLiveData<MovieEntity>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback {
            override fun onAllMoviesReceived(movieResponses: List<MovieResponse>) {
                lateinit var movie: MovieEntity
                for (response in movieResponses) {
                    if (response.id == movieId) {
                        movie = MovieEntity(
                            response.id,
                            response.title,
                            response.overview,
                            response.releaseDate,
                            response.posterPath,
                            response.genre,
                            response.director
                        )
                    }
                }
                movieResult.postValue(movie)
            }
        })
        return movieResult
    }

    override fun getTvShowDetail(tvShowId: Int): LiveData<TvShowEntity> {
        val tvShowResult = MutableLiveData<TvShowEntity>()
        remoteDataSource.getAllTvShows(object : RemoteDataSource.LoadTvShowsCallback {
            override fun onAllTvShowsReceived(tvShowsResponses: List<TvShowResponse>) {
                lateinit var tvShow: TvShowEntity
                for (response in tvShowsResponses) {
                    if (response.id == tvShowId) {
                        tvShow = TvShowEntity(
                            response.id,
                            response.title,
                            response.overview,
                            response.releaseYear,
                            response.posterPath,
                            response.genre,
                            response.creatorName
                        )
                    }
                }
                tvShowResult.postValue(tvShow)
            }
        })
        return tvShowResult
    }
}