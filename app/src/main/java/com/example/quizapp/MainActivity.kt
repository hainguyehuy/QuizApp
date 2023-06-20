package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart :Button = findViewById<Button>(R.id.btnStart)
        val name :EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(this,"Enter Your Name, Please",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constrant.USERNAME,name?.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}