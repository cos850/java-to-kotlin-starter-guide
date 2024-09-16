package com.lannstark.lec11


fun main() {
    println(isDirectoryPath("hello/"))

    val person = Person("철수", 23)

//    person.age = 1 // 오류!
}

class Person(val name: String, age: Int) {
    var age: Int = age
        private set
}