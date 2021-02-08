package com.tapaafandi.dicoflix.data.source.local.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowEntity(
    val id: Int,
    val title: String,
    val overview: String,
    val releaseYear: String,
    val posterPath: Int,
    val genre: String,
    val creatorName: String,
): Parcelable
