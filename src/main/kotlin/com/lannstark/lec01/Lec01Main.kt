package com.lannstark.lec01

fun main() {
    /**
     * 1. 기본적인 변수 선언
     */
    var number10 = 10L
    val number11 = 10L

    /**
     * 2. 타입 명시
     */
    var number20: Long = 10L

    /**
     * 3. 초기화
     */
    val number30: Long
//    println(number4) // number4가 초기화되지 않았기 때문에 오류 !

    /**
     * 4. tip
     */

    /**
     * 5. Kotlin Primitive Type
     */
    val number50: Long

    /**
     * 6. kotlin nullable
     */
    var number60: Long
//    number60 = null   // not null 변수이기 때문에 오류!

    var number41: Long?
    number41 = null


    /**
     * 7. kolin 의 인스턴스 생성
     */
    val person = Person()
}