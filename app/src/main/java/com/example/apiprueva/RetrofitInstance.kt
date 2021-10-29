package com.example.apiprueva

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api:TravelApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://aplicada2021.azurewebsites.net/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TravelApi::class.java)
    }
}