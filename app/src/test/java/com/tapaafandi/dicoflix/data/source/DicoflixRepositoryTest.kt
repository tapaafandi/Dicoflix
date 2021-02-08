package com.tapaafandi.dicoflix.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.tapaafandi.dicoflix.data.source.remote.RemoteDataSource
import com.tapaafandi.dicoflix.utils.DataDummy
import com.tapaafandi.dicoflix.utils.LiveDataTestUtil
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*

class DicoflixRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val dicoflixRepository = FakeDicoflixRepository(remote)

    private val movieResponse = DataDummy.generateRemoteDummyMovies()
    private val movieId = movieResponse[0].id

    private val tvShowResponse = DataDummy.generateRemoteDummyTvShows()
    private val tvShowId = tvShowResponse[0].id

    @Test
    fun getAllMovie() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movieResponse)
            null
        }.`when`(remote).getAllMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(dicoflixRepository.getAllMovies())
        verify(remote).getAllMovies(any())
        assertNotNull(movieEntities)
        assertEquals(movieResponse.size.toLong(), movieEntities.size.toLong())
    }

    @Test
    fun getAllTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShowResponse)
        }.`when`(remote).getAllTvShows(any())
        val tvShowEntities = LiveDataTestUtil.getValue(dicoflixRepository.getAllTvShows())
        verify(remote).getAllTvShows(any())
        assertNotNull(tvShowEntities)
        assertEquals(tvShowResponse.size.toLong(), tvShowEntities.size.toLong())
    }

    @Test
    fun getMovieDetail() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(movieResponse)
            null
        }.`when`(remote).getAllMovies(any())

        val movieEntities = LiveDataTestUtil.getValue(dicoflixRepository.getMovieDetail(movieId))

        verify(remote).getAllMovies(any())

        assertNotNull(movieEntities)
        assertNotNull(movieEntities.title)
        assertEquals(movieResponse[0].title, movieEntities.title)
    }

    @Test
    fun getTvShowDetail() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback)
                .onAllTvShowsReceived(tvShowResponse)
            null
        }.`when`(remote).getAllTvShows(any())

        val tvShowEntities = LiveDataTestUtil.getValue(dicoflixRepository.getTvShowDetail(tvShowId))
        verify(remote).getAllTvShows(any())
        assertNotNull(tvShowEntities)
        assertNotNull(tvShowEntities.title)
        assertEquals(tvShowResponse[0].title, tvShowEntities.title)
    }
}