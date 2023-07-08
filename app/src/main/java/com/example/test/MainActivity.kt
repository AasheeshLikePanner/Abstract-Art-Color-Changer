package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card1:CardView = findViewById(R.id.card1)
        val card21:CardView = findViewById(R.id.card21)
        val card22:CardView = findViewById(R.id.card22)
        val card23:CardView = findViewById(R.id.card23)
        val card24:CardView = findViewById(R.id.card24)
        val card31:CardView = findViewById(R.id.card31)
        val card32:CardView =  findViewById(R.id.card32)
        val card4:CardView =  findViewById(R.id.card4)
        val card5:CardView = findViewById(R.id.card5)
        card1.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card1, ran)
        }
        card21.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card21, ran)
            changeColor(card22, ran)
            changeColor(card23, ran)
            changeColor(card24, ran)

        }
        card22.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card21, ran)
            changeColor(card22, ran)
            changeColor(card23, ran)
            changeColor(card24, ran)
        }
        card23.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card21, ran)
            changeColor(card22, ran)
            changeColor(card23, ran)
            changeColor(card24, ran)
        }
        card24.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card21, ran)
            changeColor(card22, ran)
            changeColor(card23, ran)
            changeColor(card24, ran)
        }
        card31.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card31, ran)
            changeColor(card32,ran)
        }
        card32.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card31, ran)
            changeColor(card32,ran)
        }
        card4.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card4,ran)
        }
        card5.setOnClickListener {
            val ran:Int = (1 .. 5).random()
            changeColor(card5, ran)
        }
    }
    private fun changeColor(item:View, ran:Int){
        when(ran){
            1 -> {
                val color:Int = R.color.box1
                item.setBackgroundColor(ContextCompat.getColor(this,color ))
                changeBox(item, color)
            }
            2 -> {
                val color:Int = R.color.box2
                item.setBackgroundColor(ContextCompat.getColor(this,color ))
                changeBox(item, color)
            }
            3 -> {
                val color:Int = R.color.box3
                item.setBackgroundColor(ContextCompat.getColor(this,color ))
                changeBox(item, color)
            }
            4 -> {
                val color:Int = R.color.box4
                item.setBackgroundColor(ContextCompat.getColor(this,color ))
                changeBox(item, color)
            }
            5 -> {
                val color:Int = R.color.box5
                item.setBackgroundColor(ContextCompat.getColor(this,color ))
                changeBox(item, color)
            }
        }
    }
    private fun changeBox(item: View, color:Int){
        when(item.id){
            R.id.card1 ->   {val box1:CardView = findViewById(R.id.box1)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))
            }
            R.id.card21 ->   {val box1:CardView = findViewById(R.id.box2)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
            R.id.card22 ->   {val box1:CardView = findViewById(R.id.box2)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
            R.id.card23 ->   {val box1:CardView = findViewById(R.id.box2)
            box1.setBackgroundColor(ContextCompat.getColor(this, color))

        }
            R.id.card24 ->   {val box1:CardView = findViewById(R.id.box2)
            box1.setBackgroundColor(ContextCompat.getColor(this, color))

        }
            R.id.card31 ->   {val box1:CardView = findViewById(R.id.box3)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
            R.id.card32 -> {val box1:CardView = findViewById(R.id.box3)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
            R.id.card4 ->   {val box1:CardView = findViewById(R.id.box4)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
            R.id.card5 ->   {val box1:CardView = findViewById(R.id.box5)
                box1.setBackgroundColor(ContextCompat.getColor(this, color))

            }
        }
    }
}