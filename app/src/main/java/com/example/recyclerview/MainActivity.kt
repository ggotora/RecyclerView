package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Learn Kotlin", false),
            Todo("Go Jogging", false),
            Todo("LEarn Fragments", false),
            Todo("Go To Mbare", false),
            Todo("Look for loads", false),
            Todo("Go Jogging", false),

        )
    }
}