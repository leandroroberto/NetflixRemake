package com.leandrodev.netflixremake.model

data class Category(
    val nome: String,
    val movies: List<Movie>
)
