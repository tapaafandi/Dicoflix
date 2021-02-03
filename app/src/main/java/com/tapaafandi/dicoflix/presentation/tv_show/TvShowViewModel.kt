package com.tapaafandi.dicoflix.presentation.tv_show

import androidx.lifecycle.ViewModel
import com.tapaafandi.dicoflix.domain.model.TvShow
import com.tapaafandi.dicoflix.utils.DataDummy

class TvShowViewModel : ViewModel() {
    fun getTvShows(): List<TvShow> = DataDummy.generateTvShows()
}