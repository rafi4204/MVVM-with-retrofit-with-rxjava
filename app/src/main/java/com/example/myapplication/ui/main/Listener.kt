package com.example.myapplication.ui.main

import androidx.lifecycle.MutableLiveData

interface Listener {
    fun setDataListener(data: MutableLiveData<List<Employee>>?)
}