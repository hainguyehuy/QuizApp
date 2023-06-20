package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName:TextView = findViewById(R.id.tv_Name)
        var tvScore:TextView = findViewById(R.id.tv_Score)
        var btnFinish:Button = findViewById(R.id.finish)

        tvName.text = intent.getStringExtra(Constrant.USERNAME)
        val totalQuestion = intent.getIntExtra(Constrant.totalQuestion,0)
        val correctQuestion = intent.getIntExtra(Constrant.correctQuestion,0)
        tvScore.text = "Your score is $correctQuestion out of $totalQuestion"
        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}