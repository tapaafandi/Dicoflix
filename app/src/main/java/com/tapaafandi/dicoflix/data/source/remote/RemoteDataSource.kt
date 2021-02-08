package com.tapaafandi.dicoflix.data.source.remote

import android.os.Handler
import android.os.Looper
import com.tapaafandi.dicoflix.data.source.remote.response.MovieResponse
import com.tapaafandi.dicoflix.data.source.remote.response.TvShowResponse
import com.tapaafandi.dicoflix.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper)
            }
    }

    fun getAllMovies(callback: LoadMoviesCallback) {
        handler.postDelayed({ callback.onAllMoviesReceived(jsonHelper.loadMovies()) }, SERVICE_LATENCY_IN_MILLIS)
    }

    fun getAllTvShows(callback: LoadTvShowsCallback) {
        handler.postDelayed({ callback.onAllTvShowsReceived(jsonHelper.loadTvShow()) }, SERVICE_LATENCY_IN_MILLIS)
    }
    interface LoadMoviesCallback {
        fun onAllMoviesReceived(movieResponses: List<MovieResponse>)
    }

    interface LoadTvShowsCallback {
        fun onAllTvShowsReceived(tvShowsResponses: List<TvShowResponse>)
    }
}