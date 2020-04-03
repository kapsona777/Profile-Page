package com.example.profilepage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.studentpage.*



class studentActivity : AppCompatActivity() {

    var classprofileInfo=profileInfo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.studentpage)

        init()
        init2()
    }
    private fun logOut(){
        val intent= Intent(this, MainActivity()::class.java)
        startActivity(intent)}
    private fun editProfile(){
        val intent=Intent(this,editActivity()::class.java)
        startActivity(intent)
    }

    private fun init2(){
        viewName.setText(classprofileInfo.name.toString())
        viewLastName.setText(classprofileInfo.lastName.toString())
        viewMail.setText(classprofileInfo.mail.toString())
        viewYear.setText(classprofileInfo.year.toString())
        viewSex.setText(classprofileInfo.sex.toString())
    }

    private fun init() {
        logOutButton.setOnClickListener {
            logOut();
        }
        editButton.setOnClickListener{
            editProfile();
        }
    }
}