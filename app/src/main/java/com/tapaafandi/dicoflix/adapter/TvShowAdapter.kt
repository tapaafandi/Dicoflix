package com.tapaafandi.dicoflix.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.data.source.local.entity.TvShowEntity
import com.tapaafandi.dicoflix.databinding.ItemsRowBinding

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.MovieViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    private var listTvShow = ArrayList<TvShowEntity>()

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

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

    inner class MovieViewHolder(private val binding: ItemsRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: TvShowEntity) {
            with(binding) {
                tvTitleItem.text = tvShow.title
                tvOverview.text = tvShow.overview
                tvDateRelease.text = tvShow.releaseYear

                Glide.with(itemView.context)
                    .load(tvShow.posterPath)
                    .apply(RequestOptions.placeholderOf(R.drawable.dicoflix_placeholder))
                    .into(ivMovieItem)

                itemView.setOnClickListener { onItemClickCallback?.onItemClicked(tvShow) }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: TvShowEntity)
    }
}