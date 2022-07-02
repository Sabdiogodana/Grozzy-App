package com.sabdio.grozzyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var tilFirstName: TextInputLayout
    lateinit var etFirstName: TextInputEditText
    lateinit var tilSecondName: TextInputLayout
    lateinit var etSecondName: TextInputEditText
    lateinit var tilEmail2:TextInputLayout
    lateinit var etEmail2:TextInputEditText
    lateinit var tilPassword2:TextInputLayout
    lateinit var etPassword2:TextInputEditText
    lateinit var tilConfirmPassword:TextInputLayout
    lateinit var etConfirmPassword:TextInputEditText
    lateinit var btnSignup: Button
    lateinit var tvLogin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castviews()
        btnSignup.setOnClickListener { validateSignup() }
    }
    fun castviews(){
        tilFirstName=findViewById(R.id.tilFirstName)
        etFirstName=findViewById(R.id.etFirstName)
        tilSecondName=findViewById(R.id.tilSecondName)
        etSecondName=findViewById(R.id.etSecondName)
        tilEmail2=findViewById(R.id.tilEmail2)
        etEmail2=findViewById(R.id.etEmail2)
        tilPassword2=findViewById(R.id.tilPassword2)
        etPassword2=findViewById(R.id.etPassword2)
        tilConfirmPassword=findViewById(R.id.tilConfirmPassword)
        etConfirmPassword=findViewById(R.id.etConfirmPassword)
        tvLogin=findViewById(R.id.tvLogin)
        btnSignup=findViewById(R.id.btnSignup)
        tvLogin.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    fun validateSignup(){
        var error=false
        tilFirstName.error=null
        tilSecondName.error=null
        tilEmail2.error=null
        tilPassword2.error=null
        tilConfirmPassword.error=null

        var name1=etFirstName.text.toString()
        if (name1.isBlank())
            tilFirstName.error="Name required"

        var name2=etSecondName.text.toString()
        if (name2.isBlank())
            tilSecondName.error="Name required"

        var email2=etEmail2.text.toString()
        if (email2.isBlank())
            tilEmail2.error="Email required"

        var password2=etPassword2.text.toString()
        if (password2.isBlank())
            tilPassword2.error="Password required"

        var confirm=etConfirmPassword.text.toString()
        if (confirm.isBlank())
            tilConfirmPassword.error="Confirmation required"

        if (!error){

        }
    }
}