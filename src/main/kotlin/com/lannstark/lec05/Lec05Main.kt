package com.lannstark.lec05

/**
 * 코틀린에서 조건문을 다루는 방법
 */
fun main() {
    validateScoreIsNotNegative(-1)

    /**
     * if-else expression
     */
    getPassOrFail(60)

    /**
     * java switch (kotlin when)
     */
    getGradeWithSwitch01(85)
    getGradeWithSwitch02(85)
    startWithA("ABC")
    judgeNumber(0)
}


fun validateScoreIsNotNegative(score: Int) {
    if(score < 0) {
        throw IllegalArgumentException("${score}는 0을 넘을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        return "Pass"
    } else {
        "Fail"  // return 생략 가능
    }
}

fun getGradeWithSwitch01(score: Int) {
    when(score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch02(score: Int): String {
    return when(score) {
        in 90..100 -> "A"
        in 80.. 89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
     when(number) {
         0, -1, 1 -> println("어디서 많이 본 숫자입니다.")
         else -> println("0, -1, 1 과 다른 숫자입니다.")
     }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}