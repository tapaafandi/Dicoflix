package com.tapaafandi.dicoflix.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShowResponse(
    val id: Int,
    val title: String,
    val overview: String,
    val releaseYear: String,
    val posterPath: String,
    val genre: String,
    val creatorName: String,
): Parcelable
