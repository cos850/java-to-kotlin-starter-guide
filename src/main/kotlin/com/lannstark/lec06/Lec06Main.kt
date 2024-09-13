package com.lannstark.lec06

fun main() {
    /**
     * for each 문
     */
    val numbers = listOf(1, 2, 3)
    for(num in numbers) {
        println(num)
    }

    /**
     * 정통 for 문
     */
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }

    /**
     * while
     */
    var i = 1
    while (i <= 3) {
        println(i)
    }
}