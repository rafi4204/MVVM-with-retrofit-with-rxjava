package com.example.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

  var repository:Repository?=null
    var employee=MutableLiveData<List<Employee>>()


    fun setEmployee(){
          repository= Repository()
        repository.let {
            it?.getData()?.subscribe{
                employee.value=it
            }
        }


    }



}
