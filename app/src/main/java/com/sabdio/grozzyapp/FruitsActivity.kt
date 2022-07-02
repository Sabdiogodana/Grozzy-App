package com.sabdio.grozzyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitsActivity : AppCompatActivity() {
    lateinit var tvOranges:TextView
    lateinit var imgOranges:ImageView
    lateinit var imgMangoes:ImageView
    lateinit var imgBanana:ImageView
    lateinit var tvChungwa:TextView
    lateinit var tvMaembe:TextView
    lateinit var tvNdizi:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        castviews()
    }
    fun castviews(){
        tvOranges=findViewById(R.id.tvOranges)
        imgOranges=findViewById(R.id.imgOranges)
        imgMangoes=findViewById(R.id.imgMangoes)
        imgBanana=findViewById(R.id.imgBanana)
        tvChungwa=findViewById(R.id.tvchungwa)
        tvNdizi=findViewById(R.id.tvNdizi)
        tvMaembe=findViewById(R.id.tvMaembe)
       
    }
}