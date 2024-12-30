package com.vasifgumbatov.newapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vasifgumbatov.newapplication.databinding.ActivityMainBinding
import com.vasifgumbatov.newapplication.extensions.setStatusBarColors

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // statusBar color
        setStatusBarColors(R.color.background)
    }
}