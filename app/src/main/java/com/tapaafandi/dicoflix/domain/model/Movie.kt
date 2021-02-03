package com.tapaafandi.dicoflix.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val posterPath: Int,
    val genre: String,
    val director: String
): Parcelable
