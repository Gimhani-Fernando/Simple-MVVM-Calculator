package com.example.se_2019_023_assignment_01.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var result = MutableLiveData<Double>(0.0)

    fun add(number1:Double, number2:Double){
        result.value = number1.plus(number2)
        Log.d("Add Result",result.value.toString())
    }

    fun subtract(number1:Double, number2:Double){
        result.value = number1.minus(number2)
        Log.d("Subtract Result",result.value.toString())
    }

    fun multiply(number1:Double, number2:Double){
        result.value = number1 * number2
        Log.d("Multiply Result",result.value.toString())
    }

    fun divide(number1:Double, number2:Double){
        result.value = number1 / number2
        Log.d("Divide Result",result.value.toString())
    }
}