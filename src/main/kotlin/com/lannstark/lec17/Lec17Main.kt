package com.lannstark.lec17

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val fruits = listOf(
        Fruit("사과", 500),
        Fruit("사과", 1000),
        Fruit("사과", 1500),
        Fruit("배", 500),
        Fruit("배", 1000),
        Fruit("배", 1500),
        Fruit("바나나", 500),
        Fruit("바나나", 1000),
        Fruit("바나나", 1500),
    )

    /**
     * 람다
     */
    // 정의
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 호출
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 파라메터로 함수 전달
    filterFruits(fruits, isApple)

    // 람다 형식으로 바로 함수 정의
    filterFruits(fruits) {
        fruit: Fruit -> fruit.name == "사과"
    }

    // 타입 추론을 통한 생략 가능
    filterFruits(fruits) {
        fruit -> fruit.name == "사과"
    }

    // 파라메터가 한 개인 경우 `it` 으로 접근 가능
    filterFruits(fruits) {
        it.name == "사과"
    }


    /**
     * Closure
     */
    var path = ""
    path = "a.txt"

    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for(fruit in fruits) {
        if(filter(fruit)){
            result.add(fruit)
        }
    }

    return result
}