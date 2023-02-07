package com.example.oopkotlinpractice

import android.util.Log

class Driver(var name:String,credit: Int) {
    //var driverName=""
    //lateinit var driverName : String
    private var totalCredit = 50
    private val car = Car()
    init {
        totalCredit += credit
        //driverName = name
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails(){
        Log.i("MyTag","name of the driver is $name with $totalCredit")
    }
}