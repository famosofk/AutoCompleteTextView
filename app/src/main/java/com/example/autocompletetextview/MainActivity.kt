package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val suggestion = arrayOf("apple", "google", "samsung", "xiaomi", "lg", "motorola" )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, suggestion)
        autoCompleteTextView.threshold = 0
        autoCompleteTextView.setAdapter( adapter )
       /* autoCompleteTextView.setOnFocusChangeListener { view, b -> if(b){
            autoCompleteTextView.showDropDown()
        } essa parte mostra o dropdown com todas as opções
        } */
    }
}