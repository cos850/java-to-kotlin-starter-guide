package com.lannstark.lec15

import kotlin.collections.emptyList as emptyList

fun main() {
    /**
     * array
     */
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i}, ${array[i]}")
    }

    for ((i, value) in array.withIndex()) {
        println("${i}, ${value}")
    }

    array.plus(300)

    /**
     * collection - 불변
     */
    val emptyList = emptyList<Int>()
    val numbers = listOf(100, 200)  // 타입 추론을 통한 생략
    printNumbers(emptyList())       // 타입 추론을 통한 생략

    val list = listOf(Person("철수"), Person("짱구"))
//    list.add(Person("짱구"))  // 불가능
//    list[3] = Person("짱구")  // 불가능
    list[0].name = "맹구" // 가능

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx}. ${value}")
    }

    /**
     * collection - 가변
     */
    val mutableList = mutableListOf(100, 200)
    mutableList.add(300)


    /**
     * Set
     */
    val numberSet = setOf(100, 200)
    val mutableSet = mutableSetOf(100, 200)
    // 대부분의 기능이 리스트와 동일

    /**
     * Map
     */
    val map = emptyMap<Int, String>()

    val intKeyMap = mutableMapOf<Int, String>()
    intKeyMap.put(1, "철수")
    intKeyMap[1] = "철수"

    val stringKeyMap = mutableMapOf("철수" to 1, "유리" to 2, "맹구".to(3))
    stringKeyMap["철수"] = 3

    for(key in intKeyMap.keys) {
        println(key)
        println(intKeyMap[key])
    }

    for((key, value) in intKeyMap.entries) {
        println("${key}, ${value}")
    }
}

class Person(var name: String)

private fun printNumbers(numbers: List<Int>) {

}




