package com.peculiaruc.alc_mmsystem_mentormanager.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.peculiaruc.alc_mmsystem_mentormanager.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val i = Intent(this, EditProfile::class.java)
            startActivity(i)
        }

    }
}