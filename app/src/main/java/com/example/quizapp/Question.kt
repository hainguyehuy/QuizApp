package com.example.quizapp

import android.media.Image

data class Question(
    val ID:Int,
    val topic:String,
    val question: String,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)
