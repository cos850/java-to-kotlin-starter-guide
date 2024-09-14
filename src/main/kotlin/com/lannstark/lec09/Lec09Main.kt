package com.lannstark.lec09

fun main() {
    val person = Person()
    person.age = 10
    println("${person.name}는 ${person.age}세 이므로 ${if(person.isAdult) "성인입니다." else "성인이 아닙니다."}")
}