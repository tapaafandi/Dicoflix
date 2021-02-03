package com.tapaafandi.dicoflix.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShow(
    val id: Int,
    val title: String,
    val overview: String,
    val releaseYear: String,
    val posterPath: Int,
    val genre: String,
    val creatorName: String,
): Parcelable
