package com.example.profilepage

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.editprofile.*


class editActivity: AppCompatActivity() {
    var classprofileInfo=profileInfo()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile)
        info()
        init()
    }
    private fun saveChanges(){
        val intent= Intent (this, studentActivity()::class.java)
        startActivity(intent)
    }
    private fun init(){
        saveButton.setOnClickListener{
            saveChanges();
        }
    }
    private fun info(){
        editName.setHint(classprofileInfo.name.toString())
        editLastName.setHint(classprofileInfo.lastName.toString())
        editMail.setHint(classprofileInfo.mail.toString())
        editYear.setHint(classprofileInfo.year.toString())
        editSex.setHint(classprofileInfo.sex.toString())
    }
}