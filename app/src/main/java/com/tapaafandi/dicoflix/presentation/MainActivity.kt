package com.tapaafandi.dicoflix.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.tapaafandi.dicoflix.R
import com.tapaafandi.dicoflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Dicoflix)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bottomNavigationSetup()
    }

    private fun bottomNavigationSetup() {
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bnView.setupWithNavController(navController)
    }
}