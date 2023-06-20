package com.example.quizapp

import kotlin.random.Random

object Constrant {

    const val USERNAME :String ="userName"
    const val totalQuestion:String = "totalQuestion"
    const val correctQuestion :String = "correcQuestion"




    fun getQuestion():ArrayList<Question>{
        val questionList :ArrayList<Question> = ArrayList<Question>()

        val que1 = Question(
            1,"Điền từ còn thiếu vào câu","Chị ngã em ...",
            "đá","nâng","kệ","cười",
            2
        )
        questionList.add(que1)
        val que2 = Question(
            1,"Điền từ còn thiếu vào câu","Ăn quả nhớ kẻ ... ",
            "phá cây","trồng cây","chặt cây","bán quả",
            2
        )
        questionList.add(que2)
        val que3 = Question(
            1,"Điền từ còn thiếu vào câu","Uống nước nhớ ...",
            "trả tiền","nguồn","vứt chai","em",
            2
        )
        questionList.add(que3)
        val que4 = Question(
            1,"Điền từ còn thiếu vào câu","Con hơn cha là nhà có ...",
            "phúc","điềm","tiền","vàng",
            1
        )
        questionList.add(que4)
        val que5 = Question(
            1,"Điền từ còn thiếu vào câu","Một con ngựa đau, Cả tàu bỏ ...",
            "uống","cỏ","kệ","nước",
            2
        )
        questionList.add(que5)
        return questionList
    }

}