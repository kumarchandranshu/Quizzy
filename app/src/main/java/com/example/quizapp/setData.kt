package com.example.quizapp

object setData {
    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que: ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
            "Identify the correct extension of the user-defined header file in C++.",
            1,
            ".cpp",
            ".h",
            ".kt",
            ".c",
            2,


        )
        var question2 = QuestionData(
            "C++ uses which approach?",
            2,
            "right-left",
            "top-down",
            "left-right",
            "down-top",
            4,
        )
        var question3 = QuestionData(
            "Which of the following data type is supported in C++ but not in C?",
            3,
            "loop",
            "double",
            "float",
            "bool",
            4,
        )
        var question4 = QuestionData(
            "Size of wchat_t is",
            4,
            "two",
            "four",
            "two-four",
            "depend upon no of string ",
            4,
        )
        var question5 = QuestionData(
            "Identify the correct example for a pre-increment operator",
            5,
            "++n",
            "n--",
            "+n",
            "n++",
            1,

        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)

        return que


    }
}