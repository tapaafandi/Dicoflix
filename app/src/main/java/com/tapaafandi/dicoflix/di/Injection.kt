package com.tapaafandi.dicoflix.di

import android.content.Context
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.data.source.remote.RemoteDataSource
import com.tapaafandi.dicoflix.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): DicoflixRepository {
        val remoteRepository = RemoteDataSource.getInstance(JsonHelper(context))
        return DicoflixRepository.getInstance(remoteRepository)
    }
}