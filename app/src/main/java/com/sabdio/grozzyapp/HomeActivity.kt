package com.sabdio.grozzyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvWelcome:TextView
    lateinit var imgperson:ImageView
    lateinit var tvCategories:TextView
    lateinit var tvFruits:TextView
    lateinit var tvVegetables:TextView
    lateinit var imgFruity:ImageView
    lateinit var imgVegy:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findveiws()

    }
   fun  findveiws(){
        tvWelcome=findViewById(R.id.tvWelcome)
        imgperson=findViewById(R.id.imgperson)
        tvCategories=findViewById(R.id.tvCategories)
        imgFruity=findViewById(R.id.imgFruity)
        tvVegetables=findViewById(R.id.tvVegetables)
        imgVegy=findViewById(R.id.imgVegy)
       tvFruits=findViewById(R.id.tvFruits)
      tvFruits.setOnClickListener {
          val intent=Intent(this,FruitsActivity::class.java)
          startActivity(intent)
      }

   }
}