package com.example.movielistmvvm.data.model

data class MoviesResponceModel(
    val id: Int,
    val image: String,
    val is_new: Int,
    val language: String,
    val like_percent: Int,
    val rating: String,
    val title: String,
    val type: String,
    val vote_count: Int
)