package com.example.toaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.showToaster(this, "Hello Toaster")
    }
}