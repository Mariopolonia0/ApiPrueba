package com.example.apiprueva

import retrofit2.http.GET

interface TravelApi{
    @GET("Travels")
    suspend fun GetTravels():List<Travel>
}