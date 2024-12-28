package com.example.menuactionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menuactionbar.databinding.ActivityMainBinding
import java.util.stream.Stream

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title =""
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionmenu, menu)
       return true
   }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.main_menu_about -> {
               toast("درباره ما")
                true
            }

            R.id.main_menu_contact -> {
               startActivity(Intent(this,Testpage2::class.java))
                true
            }

            else ->
                false

        }
    }

            private fun toast(text: String) {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
            }
        }
