package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var isTesting123=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!isTesting123){
            isTesting123 = false
            val count:Int = 2
            val cont2:Int =3
        }else if(!isTesting123){
            isTesting123 = true
            val count:Int = 1
        }


    }
}
