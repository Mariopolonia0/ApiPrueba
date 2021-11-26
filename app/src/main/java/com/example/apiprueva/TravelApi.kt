package com.example.apiprueva

import retrofit2.Call
import retrofit2.http.*

interface TravelApi{
    @GET("Travels")
    suspend fun GetTravels():List<Travel>

    @POST("Travels")
    fun createTravels(@Body travel: Travel?) :Call <Travel>

}