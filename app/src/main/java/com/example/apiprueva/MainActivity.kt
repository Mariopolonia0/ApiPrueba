package com.example.apiprueva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.apiprueva.databinding.ActivityMainBinding
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            val lista = RetrofitInstance.api.GetTravels()
            //val cant = lista.size

            var adapter = TravelAdapter()
            adapter.sumitList(lista)
            binding.listatravelsrecyclerview.adapter = adapter

       }
    }
}