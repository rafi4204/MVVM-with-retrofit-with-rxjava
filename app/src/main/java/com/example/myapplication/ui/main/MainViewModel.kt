package com.example.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(),Listener {


    var employee: MutableLiveData<List<Employee>>?=null


    fun setRepo(){
        employee=MutableLiveData<List<Employee>>()
       val repository= Repository()
        repository.listener=this
        repository.getData()
    }

    override fun setDataListener(data: MutableLiveData<List<Employee>>?) {
       employee?.value=data?.value
    }

}
