package com.example.calc2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


        fun writeNum(view: View){
            Display.append((view as Button).text)
        }

        fun Clear(view: View){
            Display.text=""
    }

        fun opera(view: View){
                Display.append((view  as Button).text)
        }


}
