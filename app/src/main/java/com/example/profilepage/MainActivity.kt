package com.example.profilepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun openStudentPage(){
        val intent= Intent(this, studentActivity()::class.java)
        startActivity(intent)
    }
    private fun init(){
        loginButton.setOnClickListener{
            if (username.text.toString()==("Student")&& password.text.toString()==("Stud")){
                Toast.makeText(this,"Log In Success!", Toast.LENGTH_SHORT).show()
                openStudentPage();
            } else {
                Toast.makeText(this,"Wrong Information, Try Again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
