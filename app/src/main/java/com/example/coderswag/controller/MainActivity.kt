package com.example.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.coderswag.R
import com.example.coderswag.adapters.CategoryAdapter
import com.example.coderswag.model.Category
import com.example.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
        
        categoryListView.setOnItemClickListener { _, _, position, _ ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You have clicked ${category.title} cell!", Toast.LENGTH_SHORT).show()
        }
    }
}
