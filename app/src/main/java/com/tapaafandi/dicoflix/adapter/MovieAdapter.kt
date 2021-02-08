package com.tapaafandi.dicoflix.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.data.source.local.entity.MovieEntity
import com.tapaafandi.dicoflix.databinding.ItemsRowBinding
import com.tapaafandi.dicoflix.domain.model.Movie
import com.tapaafandi.dicoflix.presentation.detail.DetailActivity
import com.tapaafandi.dicoflix.utils.Constants.MOVIE_TYPE

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovies = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size

    class MovieViewHolder(private val binding: ItemsRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvTitle.text = movie.title
                tvOverview.text = movie.overview
                tvDateRelease.text = movie.releaseDate

                Glide.with(itemView.context)
                    .load(movie.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.dicoflix_placeholder))
                    .into(ivMovieItem)

                itemView.setOnClickListener {
                    Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_DETAIL, movie.id)
                        putExtra(DetailActivity.EXTRA_TYPE, MOVIE_TYPE)
                        itemView.context.startActivity(this)
                    }
                }
            }
        }
    }
}