package com.tapaafandi.dicoflix.data.source.local.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieEntity(
    val id: Int,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val posterPath: Int,
    val genre: String,
    val director: String
): Parcelable