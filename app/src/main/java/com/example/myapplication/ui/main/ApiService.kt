package com.example.myapplication.ui.main

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface ApiService {
    @GET("api/Activities")
    fun getEmployeeData(): Observable<List<Employee>>
}