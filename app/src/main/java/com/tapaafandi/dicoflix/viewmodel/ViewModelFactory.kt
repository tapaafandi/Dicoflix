package com.tapaafandi.dicoflix.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.di.Injection
import com.tapaafandi.dicoflix.presentation.detail.DetailViewModel
import com.tapaafandi.dicoflix.presentation.movie.MovieViewModel
import com.tapaafandi.dicoflix.presentation.tv_show.TvShowViewModel

class ViewModelFactory private constructor(private val mDicoflixRepository: DicoflixRepository) :
    ViewModelProvider.NewInstanceFactory() {

        companion object {
            @Volatile
            private var instance: ViewModelFactory? = null

            fun getInstance(context: Context): ViewModelFactory =
                instance ?: synchronized(this) {
                    instance ?: ViewModelFactory(Injection.provideRepository(context))
                }
        }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                MovieViewModel(mDicoflixRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                TvShowViewModel(mDicoflixRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(mDicoflixRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
    }
}