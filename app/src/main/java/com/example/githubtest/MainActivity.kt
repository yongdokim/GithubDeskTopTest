package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var isTest=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(isTest){
            isTest = false
            val count:Int = 2
        }else{
            isTest = true
            val count:Int = 1
        }


    }
}
