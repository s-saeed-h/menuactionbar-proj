package com.example.menuactionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menuactionbar.databinding.ActivityTestpage2Binding

class Testpage2 : AppCompatActivity() {
    private lateinit var binding: ActivityTestpage2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestpage2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}