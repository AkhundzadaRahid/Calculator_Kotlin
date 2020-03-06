package com.example.calc2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
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

   /* var dott: Boolean = true
    var operaa: Boolean = false

    var a: Double = 0.0
    var b: Double = 0.0
    var i:Int=0
    var j:Int=0
    var c:Int=0
    var d:Int=0
    var Total:Int=0


    var numArray = emptyArray<Int>()
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
            Total=0
        }
*//*------------------------------------------------------------------------------------------------------------*//*
        fun opera(view: View) {
            dott = true
            val input = DisplayWrite.text
            val SplitInput= input.split(' ')
            val j=SplitInput.size

            if(DisplayWrite.text.endsWith("+") || DisplayWrite.text.endsWith("-") ){

                DisplayWrite.append((view as Button).text)

            }else if(operaa == true){

                DisplayWrite.append(" ")
                DisplayWrite.append((view as Button).text)
                DisplayWrite.append(" ")
            }


*//*------------------------------------------------------------------------------------------------------------*//*

            if(j == 5){
                for (i in  0..j) {
                    if (i == 1) {
                        if(SplitInput[1] == "+"){
                            Total =  SplitInput[0].toInt() +  SplitInput[2].toInt();
                            DisplayWrite.text = Total.toString();
                            DisplayWrite.append(" + ")
                            Display.text = Total.toString();
                        }

                        if(SplitInput[1] == "-"){
                            Total =  SplitInput[0].toInt() -  SplitInput[2].toInt();
                            DisplayWrite.text = Total.toString();
                            DisplayWrite.append(" - ")
                            Display.text = Total.toString();
                        }

                        if(SplitInput[1] == "*"){
                            Total =  SplitInput[0].toInt() *  SplitInput[2].toInt();
                            DisplayWrite.text = Total.toString();
                            DisplayWrite.append(" * ")
                            Display.text = Total.toString();
                        }

                        if(SplitInput[1] == "/"){
                            Total =  SplitInput[0].toInt() /  SplitInput[2].toInt();
                            DisplayWrite.text = Total.toString();
                            DisplayWrite.append(" / ")
                            Display.text = Total.toString();
                        }

                    }
                }
            }
        }

        fun Beraber(veiw: View) {

            val input = DisplayWrite.text
            val SplitInput=input.split(' ')
            val j=SplitInput.size
            for (i in  0..j) {

                if (i == 1) {
                    if(SplitInput[i] == "+"){
                        Total =  SplitInput[i-1].toInt() +  SplitInput[i+1].toInt();
                        DisplayWrite.text = Total.toString();
                    }

                }
            }

            Display.text = Total.toString();
}*/


    var op=""
    var eq: Boolean = true
    var snop:Double=0.0
    var dott:Boolean = true
    var Total:Double=0.0

    var result:Double=0.0




    fun writeNum(view: View) {
        if (DisplayWrite.text == "+" ||DisplayWrite.text == "-" || DisplayWrite.text == "*" || DisplayWrite.text == "/"   ) {
            DisplayWrite.text = ""
            Display.append((view as Button).text)
        } else {
                        DisplayWrite.append((view as Button).text)
        }


    }

    fun dot(view: View) {
        if (dott == true) {
            DisplayWrite.append((view as Button).text)
            dott = false
        }
    }


    fun Clear(view: View) {
        DisplayWrite.text = ""
        Display.text=""
        dott=true

    }


    fun opera(view: View) {
        dott = true
        if(Display.text==""){
            if(DisplayWrite.text == " + " ||DisplayWrite.text == " - " || DisplayWrite.text == " * " || DisplayWrite.text == " / ") {
                DisplayWrite.text = ""
                DisplayWrite.append(" ")
                DisplayWrite.append((view as Button).text)
                DisplayWrite.append(" ")
                op==(view as Button).text
            }else{
                DisplayWrite.append(" ")
                DisplayWrite.append((view as Button).text)
                DisplayWrite.append(" ")
                op==(view as Button).text
            }
        } else{
            DisplayWrite.text = ""
            Display.text=""

        }



        }


    fun Beraber(veiw: View) {
        var input = DisplayWrite.text
        var SplitInput= input.split(' ')
        var pn= SplitInput[0]
        var ns=SplitInput[2]
        if(SplitInput[1]=="+"){
                result=pn.toDouble()+ns.toDouble()
            }else if (SplitInput[1]=="-"){
                result=pn.toDouble()-ns.toDouble()
            }else if (SplitInput[1]=="*"){
                result=pn.toDouble()*ns.toDouble()
            }else if (SplitInput[1]=="/"){
                 result=pn.toDouble()/ns.toDouble()
}


        Display.text=result.toString()
}}








