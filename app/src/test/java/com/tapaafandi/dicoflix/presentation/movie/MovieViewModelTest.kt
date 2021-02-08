package com.tapaafandi.dicoflix.presentation.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.utils.DataDummy
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var dicoflixRepository: DicoflixRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(dicoflixRepository)
    }

    @Test
    fun getMovies() {
        val dummyMovies = DataDummy.generateDummyMovies()
        val movies = MutableLiveData<List<MovieEntity>>()
        movies.value = dummyMovies

        `when`(dicoflixRepository.getAllMovies()).thenReturn(movies)
        val movieEntities = viewModel.getMovies().value
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)
        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovies)
    }
}