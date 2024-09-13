package com.lannstark.lec02

/**
 * 02: Kotlin에서 null을 다루는 방법
 */
fun main() {
    /**
     * - safe call (`?.`)
     */
    var str1: String? = "ABC"
//    print(str1.length)  // 오류!
    println(str1?.length) // 가능

    str1 = null
    println(str1?.length)   // 결과: null

    /**
     * - elvis 연산자 (`?:`)
     */
    val str2: String? = "BAC"
    println(str2?.length ?: 0)    // 결과: 3

    /**
     * 플랫폼 타입
     */
    val person = Person("ABC")
//    startsWithNotNull02(person.name)
}

fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if(str == null) {
        return false
    }
    return str.startsWith("A")
}


/**
 * 위의 함수를 조금 더 코틀린스럽게!
 */

fun startsWithA1Kt(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2Kt(str: String?): Boolean? {
    return str?.startsWith("A") // safe call 은 str이 null이면 null 반환
}

fun startsWithA3Kt(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithNotNull01(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithNotNull02(str: String): Boolean {
    return str!!.startsWith("A")
}

