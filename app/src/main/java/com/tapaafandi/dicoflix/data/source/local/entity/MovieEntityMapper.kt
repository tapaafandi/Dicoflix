package com.tapaafandi.dicoflix.data.source.local.entity

import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.domain.util.DomainMapper

class MovieEntityMapper : DomainMapper<MovieEntity, Movie> {

    override fun mapToDomainModel(model: MovieEntity): Movie {
        return Movie(
            id = model.id,
            title = model.title,
            overview = model.overview,
            releaseDate = model.releaseDate,
            posterPath = model.posterPath,
            genre = model.genre,
            director = model.director
        )
    }

    override fun mapFromDomainModel(domainModel: Movie): MovieEntity {
        return MovieEntity(
            id = domainModel.id,
            title = domainModel.title,
            overview = domainModel.overview,
            releaseDate = domainModel.releaseDate,
            posterPath = domainModel.posterPath,
            genre = domainModel.genre,
            director = domainModel.director
        )
    }

    fun toDomainList(initial: List<MovieEntity>): List<Movie> {
        return initial.map { mapToDomainModel(it) }
    }

    fun fromDomainList(initial: List<Movie>): List<MovieEntity> {
        return initial.map { mapFromDomainModel(it) }
    }
}