package com.movieapp.common

import android.app.Application

class MovieApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        movieApplication = this
    }

    companion object {
        private lateinit var movieApplication: MovieApplication

        fun getInstance(): MovieApplication {
            return movieApplication
        }
    }
}