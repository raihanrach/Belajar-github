package com.unero.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class Adristi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adristi)
    }

    fun halamanSelanjutnya(view: View) {
        val intent = Intent(this, Mifta::class.java)
        startActivity(intent)
    }
    
}