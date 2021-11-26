package com.example.apiprueva

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.launch



class MainActivityViewModel  : ViewModel() {

    private var _lista = MutableLiveData<List<Travel>>()

    val lista :LiveData<List<Travel>>
    get() = _lista

    init {
        try {
            viewModelScope.launch {
                _lista.value = RetrofitInstance.api.GetTravels()
            }
        }catch (E : Exception){
            Log.i("hola","klk")
        }
    }
}