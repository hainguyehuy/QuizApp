package com.example.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(),View.OnClickListener {
    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition:Int? = 0
    private var progressBar : ProgressBar? = null
    private var tvProgressBar :TextView? = null
    private var tvTopic :TextView? = null
    private var tvQuestion :TextView? = null
    private var tvAw1 :TextView? = null
    private var tvAw2 :TextView? = null
    private var tvAw3 :TextView? = null
    private var tvAw4 :TextView? = null
    private var btnSubmit :Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        progressBar = findViewById(R.id.progressBar)
        tvProgressBar = findViewById(R.id.tv_progress)
        tvTopic = findViewById(R.id.tv_topic)
        tvQuestion = findViewById(R.id.tv_question)
        tvAw1 = findViewById(R.id.tv_aw1)
        tvAw2 = findViewById(R.id.tv_aw2)
        tvAw3 = findViewById(R.id.tv_aw3)
        tvAw4 = findViewById(R.id.tv_aw4)
        btnSubmit = findViewById(R.id.btnSubmit)



        mQuestionList = Constrant.getQuestion()
        setQuestion()

        tvAw1?.setOnClickListener(this)
        tvAw2?.setOnClickListener(this)
        tvAw3?.setOnClickListener(this)
        tvAw4?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

    }

    private fun setQuestion() {
        val questionn: Question = mQuestionList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        tvProgressBar?.text = "${mCurrentPosition}/${this.progressBar?.max}"
        tvTopic?.text = questionn.topic
        tvQuestion?.text = questionn.question
        tvAw1?.text = questionn.optionOne
        tvAw2?.text = questionn.optionTwo
        tvAw3?.text = questionn.optionThree
        tvAw4?.text = questionn.optionFour

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "Finish"
        }
        else{
            btnSubmit?.text = "Submit"

        }
    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        tvAw1?.let {
            options.add(0,it)
        }
        tvAw2?.let {
            options.add(1,it)
        }
        tvAw3?.let {
            options.add(2,it)
        }
        tvAw4?.let {
            options.add(3,it)
        }
        for(option in options){
            option.setTextColor(Color.parseColor("#99A98F"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.background_aw)
        }
    }
    private fun selectedOptionView(tv:TextView, selectedOptionNumber:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber
        tv.setTextColor(Color.parseColor("#A84448"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_options_border_bg)

    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_aw1 -> {
                tvAw1?.let{
                    selectedOptionView(it,1)
                }
            }
            R.id.tv_aw2 -> {
                tvAw2?.let{
                    selectedOptionView(it,2)
                }
            }
            R.id.tv_aw3 -> {
                tvAw3?.let{
                    selectedOptionView(it,3)
                }
            }
            R.id.tv_aw4 -> {
                tvAw4?.let{
                    selectedOptionView(it,4)
                }
            }
            R.id.btnSubmit->{
                //TODO
            }
        }
    }
}
















