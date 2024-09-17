package com.lannstark.lec20

import com.lannstark.lec09.Person

fun main() {
    val person = Person()

    val personAge1 = person.let { it.age }
    val personAge2 = person.run { this.age }

    val person1 = person.also { it.age }
    val person2 = person.apply { this.age }

    with(person) {
        println(this.name)
        println(age)
    }

    /**
     * let 활용
     */
    // 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("APPLE", "CAR", "SAMPLE")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    // non-null 값에 대해서만 코드를 실행하고 싶을 때
    var str: String? = "하하"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }
}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}