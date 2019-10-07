package com.example.myapplication.ui.main

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


class Repository {

    var mainViewModel: MainViewModel? = null
    @SuppressLint("CheckResult")
    fun getData(): Observable<List<Employee>>? {
        var data = MutableLiveData<List<Employee>>()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://fakerestapi.azurewebsites.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        val apiService: ApiService = retrofit.create(ApiService::class.java)
        //without disposable
        /* apiService.getEmployeeData().subscribeOn(Schedulers.io()) .observeOn(AndroidSchedulers.mainThread())
             .subscribe{
                 Log.d("2",it.size.toString())
             }*/
        //with disposable
        return  apiService.getEmployeeData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())



    }


}