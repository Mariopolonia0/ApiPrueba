package com.example.apiprueva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.apiprueva.databinding.ActivityMainBinding
import com.google.gson.Gson
import okhttp3.internal.notify
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.lista.observe(this) {
            val adapter = TravelAdapter()
            adapter.sumitList(it)
            binding.listatravelsrecyclerview.adapter = adapter
        }

        binding.buttonprobar.setOnClickListener {

            var travel :Travel? = Travel(0,binding.editTextTextObs.text.toString(),binding.editTextMilla.text.toString().toInt())

            RetrofitInstance.api.createTravels(travel).enqueue(object :Callback<Travel>{
                override fun onResponse(call: Call<Travel>, response: Response<Travel>) {
                    travel = response?.body()
                     Log.i("Bueno",Gson().toJson(travel))
                }
                override fun onFailure(call: Call<Travel>, t: Throwable) {
                    t?.printStackTrace()
                }
            })
            Toast.makeText(this,"hola mario",Toast.LENGTH_LONG)
        }
    }
}






