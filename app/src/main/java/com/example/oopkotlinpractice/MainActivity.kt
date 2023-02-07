package com.example.oopkotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val car = Car()
        //car.maxSpeed =150
        //car.start()
        //val d= Driver("Tom",37)
        //d.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 350
        myCar.start()
    }
}