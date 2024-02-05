package com.leandrodev.netflixremake

import android.graphics.drawable.LayerDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat

class MovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        //Criando a toolbar
        val toolbar: Toolbar = findViewById(R.id.movie_toolbar)
        setSupportActionBar(toolbar)

        //Setando a toolbar como actionBar e colocando um icone indicador para voltar
        supportActionBar?.setHomeAsUpIndicator(R.drawable.icon_back)

        //Habilitando a toolbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Buscando o desenhável LayerList
        val layerDrawable : LayerDrawable = ContextCompat.getDrawable(this, R.drawable.shadows) as LayerDrawable

        // Buscando filme que quer atribuir
        val movieCover = ContextCompat.getDrawable(this, R.drawable.movie_4)

        //Atribui a esse layerList o novo filme
        layerDrawable.setDrawableByLayerId(R.id.cover_drawable, movieCover)

        //Set no ImageView
        val coverImg: ImageView = findViewById(R.id.movie_img)
        coverImg.setImageDrawable(layerDrawable)
    }
}