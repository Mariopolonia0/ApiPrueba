package com.example.apiprueva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private var _binding : MainActivity? = null
    private val binding get() = _binding

    //private lateinit var viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       lifecycleScope.launchWhenCreated {
           val lista = RetrofitInstance.api.GetTravels()
           val cant = lista.size

       }


    }
}