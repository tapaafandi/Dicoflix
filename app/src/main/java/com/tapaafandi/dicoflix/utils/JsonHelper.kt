package com.tapaafandi.dicoflix.utils

import android.content.Context
import com.tapaafandi.dicoflix.data.source.remote.response.MovieResponse
import com.tapaafandi.dicoflix.data.source.remote.response.TvShowResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val movieList = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponse.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)
                val id = movie.getString("id").toInt()
                val title = movie.getString("title")
                val overview = movie.getString("overview")
                val releaseDate = movie.getString("releaseDate")
                val posterPath = movie.getString("posterPath").toInt()
                val genre = movie.getString("genre")
                val director = movie.getString("director")

                val movieResponse = MovieResponse(id, title, overview, releaseDate, posterPath, genre, director)
                movieList.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return movieList
    }

    fun loadTvShow(): List<TvShowResponse> {
        val tvShowList = ArrayList<TvShowResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("TvShowResponse.json").toString())
            val listArray = responseObject.getJSONArray("tv_shows")
            for (i in 0 until listArray.length()) {
                val tvShow = listArray.getJSONObject(i)
                val id = tvShow.getString("id").toInt()
                val title = tvShow.getString("title")
                val overview = tvShow.getString("overview")
                val releaseYear = tvShow.getString("releaseYear")
                val posterPath = tvShow.getString("posterPath").toInt()
                val genre = tvShow.getString("genre")
                val director = tvShow.getString("director")

                val tvShowResponse = TvShowResponse(id, title, overview, releaseYear, posterPath, genre, director)
                tvShowList.add(tvShowResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return tvShowList
    }
}