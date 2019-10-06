package com.example.myapplication.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response




class Repository {
var listener:Listener?=null

    fun getData(){
        var data=MutableLiveData<List<Employee>>()
      val  retrofit = Retrofit.Builder()
            .baseUrl("https://fakerestapi.azurewebsites.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService:ApiService=retrofit.create(ApiService::class.java)
      apiService.getEmployeeData().enqueue(object :Callback<List<Employee>>{
          override fun onFailure(call: Call<List<Employee>>, t: Throwable) {
              Log.d("failure!!!!!!!!",t.message)
          }

          override fun onResponse(call: Call<List<Employee>>, response: Response<List<Employee>>) {
              data?.value=response.body()
              listener?.setDataListener(data)
          }

      })


    }


}