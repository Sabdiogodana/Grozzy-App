package com.sabdio.grozzyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilEmail:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var btnLogin:Button
    lateinit var tvSignup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findviews()
        btnLogin.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
            validateLogin()
        }
//        btnLogin.setOnClickListener { validateLogin() }
    }
   fun findviews(){
        tilEmail=findViewById(R.id.tilEmail2)
        etEmail=findViewById(R.id.etEmail)
        tilPassword=findViewById(R.id.tilPassword)
        etPassword=findViewById(R.id.etPassword)
        tvSignup=findViewById(R.id.tvSignup)
        btnLogin=findViewById(R.id.btnLogin)
       tvSignup.setOnClickListener {
           val intent=Intent(this,SignupActivity::class.java)
           startActivity(intent)

       }
    }
    fun validateLogin(){
        var error=false
        tilEmail.error=null
        tilPassword.error=null
        var email=etEmail.text.toString()
        if (email.isBlank())
            tilEmail.error="Email required"

        var password=etPassword.text.toString()
        if (password.isBlank())
            tilPassword.error="Password required"

        if (!error){

        }

    }

}