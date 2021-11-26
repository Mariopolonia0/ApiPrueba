package com.example.apiprueva

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
        //https://aplicada2021.azurewebsites.net/api/
    val api:TravelApi by lazy{
        Retrofit.Builder()
            .baseUrl("http://www.apiprueba.somee.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TravelApi::class.java)
    }

}