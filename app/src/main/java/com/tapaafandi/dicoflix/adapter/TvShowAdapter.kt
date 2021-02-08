package com.tapaafandi.dicoflix.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.databinding.ItemsRowBinding
import com.tapaafandi.dicoflix.domain.model.TvShow
import com.tapaafandi.dicoflix.presentation.detail.DetailActivity
import com.tapaafandi.dicoflix.utils.Constants.TV_SHOW_TYPE

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.MovieViewHolder>() {

    private var listTvShow = ArrayList<TvShowEntity>()

    fun setTvShow(tvShows: List<TvShowEntity>?) {
        if (tvShows == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsMovieBinding = ItemsRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShow.size

    class MovieViewHolder(private val binding: ItemsRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShowEntity) {
            with(binding) {
                tvTitle.text = tvShow.title
                tvOverview.text = tvShow.overview
                tvDateRelease.text = tvShow.releaseYear

                Glide.with(itemView.context)
                    .load(tvShow.posterPath)
                    .into(ivMovieItem)

                itemView.setOnClickListener {
                    Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_DETAIL, tvShow.id)
                        putExtra(DetailActivity.EXTRA_TYPE, TV_SHOW_TYPE)
                        itemView.context.startActivity(this)
                    }
                }
            }
        }
    }
}