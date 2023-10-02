package com.example.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Toast
import com.example.belajarintent.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_registration)

        binding.btnLogin.setOnClickListener {
            val i = Intent(applicationContext, LoginSuccess::class.java)
            val username = binding.edtUsername.getText().toString()

            binding.result.setText("hai")

            if (username == "admin") {
                startActivity(i)
            } else {
                Toast.makeText(applicationContext, "Username invalid!", Toast.LENGTH_LONG).show()
            }
        }
    }

    /* fun Registration(view: View?) {
        val i = Intent(applicationContext, LoginSuccess::class.java)
        val username = binding.edtUsername.getText().toString()

        if (username == "admin") {
            startActivity(i)
        } else {
            Toast.makeText(applicationContext, "Username invalid!", Toast.LENGTH_LONG).show()
        }
    } */

}