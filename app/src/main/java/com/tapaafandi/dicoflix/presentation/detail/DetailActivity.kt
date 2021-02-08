package com.tapaafandi.dicoflix.presentation.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.databinding.ActivityDetailBinding
import com.tapaafandi.dicoflix.utils.Constants.MOVIE_TYPE
import com.tapaafandi.dicoflix.utils.Constants.TV_SHOW_TYPE
import com.tapaafandi.dicoflix.viewmodel.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var viewModel: DetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val idDetail = intent.getIntExtra(EXTRA_DETAIL, 0)
        when (intent.getStringExtra(EXTRA_TYPE)) {
            MOVIE_TYPE -> {
                viewModel.setSelectedMovie(idDetail)
                requestDetailMovie()
            }
            TV_SHOW_TYPE -> {
                viewModel.setSelectedTvShow(idDetail)
                requestDetailTvShow()
            }
        }
    }

    private fun requestDetailMovie() {
        viewModel.getMovie().observe(this, { movie ->
            with(binding) {
                supportActionBar?.setTitle(movie.title)
                tvTitle.text = movie.title
                tvReleaseDate.text = movie.releaseDate
                tvOverview.text = movie.overview
                tvGenre.text = movie.genre
                tvDirector.text = movie.director

                Glide.with(this@DetailActivity)
                    .load(movie.posterPath)
                    .into(ivPoster)

                Glide.with(this@DetailActivity)
                    .load(movie.posterPath)
                    .into(ivPosterBackground)
            }
        })
    }

    private fun requestDetailTvShow() {
        viewModel.getTvShow().observe(this, { tvShow ->
            with(binding) {
                supportActionBar?.setTitle(tvShow.title)
                tvTitle.text = tvShow.title
                tvReleaseDate.text = tvShow.releaseYear
                tvOverview.text = tvShow.overview
                tvGenre.text = tvShow.genre

                tvDirectorCreator.setText(R.string.creators)
                tvDirector.text = tvShow.creatorName

                Glide.with(this@DetailActivity)
                    .load(tvShow.posterPath)
                    .into(ivPoster)

                Glide.with(this@DetailActivity)
                    .load(tvShow.posterPath)
                    .into(ivPosterBackground)
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}