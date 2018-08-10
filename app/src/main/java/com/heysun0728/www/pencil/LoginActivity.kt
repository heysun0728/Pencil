package com.heysun0728.www.pencil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initializexml()
        
    }

    fun initializexml(){
        val edittext_account: EditText= findViewById(R.id.editText_account)
        val edittext_password: EditText= findViewById(R.id.editText_password)
        val button_login: Button= findViewById(R.id.button_login)
        button_login.setOnClickListener {
            val account: String =edittext_account.text.toString()
            val password: String=edittext_password.text.toString()
        }
    }
}
