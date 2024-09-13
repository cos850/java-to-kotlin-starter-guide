package com.lannstark.lec03

import jdk.jshell.PersistentSnippet


fun main() {
    /**
     * 1. 기본타입
     */
    val number1 = 1    // Int
    val number2 = 1L   // Long

    val number3 = 3.0f  // Float
    val number4 = 3.0   // Double

    /**
     * 1-1. 기본 타입 간 암시적 변환 불가.
     */
    val number5 = 4;
    val number6 = number1;          // type mismatch
    val number7 = number1.toLong()  // 명시적 변환

    println(number3 + number4)


    /**
     * 형변환
     */
    var obj: Any = Person("철수", 23)
    if(obj is Person) {
        val person = obj as Person
        println(person.age)
    }

    // 스마트 캐스트
    if(obj is Person) {
        println(obj.age)
    }

    // !is, as?
    var obj1: Any = Person("철수", 23)
    if(obj1 !is Person) {    // is가 Persion이 아니면
        // ...
    }

    var obj2: Any? = Person("철수", 23)
    val person = obj2 as? Person


    /**
     * String 활용
     */
    // String interpolation
    val person2 = Person("철수", 23)
    val personDesc = "이름은 ${person2.name}, 나이는 ${person2.age}"

    // String  indexing
    val str = "ABCD"
    val ch = str[2]


    // """
    """
        Hello
        ${person2.name}
    """.trimIndent()
}