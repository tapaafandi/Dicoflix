package com.tapaafandi.dicoflix.presentation.tv_show

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.data.source.DicoflixRepository
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.domain.model.TvShow
import com.tapaafandi.dicoflix.utils.DataDummy

class TvShowViewModel(private val dicoflixRepository: DicoflixRepository) : ViewModel() {

    fun getTvShows(): LiveData<List<TvShowEntity>> = dicoflixRepository.getAllTvShows()
}