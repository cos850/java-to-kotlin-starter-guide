package com.lannstark.lec08

import com.lannstark.lec08.Lec08Main.printAll

fun main() {
    /**
     * 함수 선언 문법
     */
    max(1, 2)

    /**
     * default parameter
     */
    repeat("Hello World 1", 3, true)
    repeat("Hello World 2")

    /**
     * named argument
     */
    repeat("Hello World 3", useNewLine = false)
//    printAll(strings = "hello!!") java method 에서는 사용 불가!!

    /**
     * 가변인자
     */
    printAllKt("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAllKt(*array)  // spread 연산자 (*) 사용

}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) {
//        a
//    } else {
//        b
//    }
//}
fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if(useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}


fun printAllKt(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}