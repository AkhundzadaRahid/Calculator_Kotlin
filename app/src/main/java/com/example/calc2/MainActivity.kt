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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var dott: Boolean = true
    var operaa: Boolean = false

    var a: Double = 0.0
    var b: Double = 0.0
    var i:Int=0
    var j:Int=0


    var numArray = emptyArray<String>()
    var oppArray = emptyArray<String>()
    var num=0
    var ops=0

    val opp= arrayOf("+","-","/","*")

    fun dot(view: View) {
        if (dott == true) {
            DisplayWrite.append((view as Button).text)
            dott = false
        }
    }

    fun writeNum(view: View) {

        operaa = true

        if (DisplayWrite.text == "+") {
            DisplayWrite.text = ""
           // Display.append((view as Button).text)
        } else {
            DisplayWrite.append((view as Button).text)
        }

    }

        fun Clear(view: View) {
            DisplayWrite.text = ""
            Display.text=""
            operaa=false
            dott=true
        }

        fun opera(view: View) {

            dott = true
            if (operaa == true) {
                DisplayWrite.append(" ")
                DisplayWrite.append((view as Button).text)
                DisplayWrite.append(" ")
                operaa = false
            }
        }

        fun Beraber(view: View) {

            val input = DisplayWrite.text
            val SplitInput=input.split(' ')
            val j=SplitInput.size

           /* for (i in 0..j){
                if (i % 2 == 1){
                    numArray.set(SplitInput[i])

                }
                else if(i % 2 == 0){
                    var oppArray =SplitInput[i]
                }
            }*/



            while (i==j){
                i++
                if (i % 2 == 1){
                    SplitInput[i]
                }
                else if(i % 2 == 0){
                    SplitInput[i]
                }
           }



}}




