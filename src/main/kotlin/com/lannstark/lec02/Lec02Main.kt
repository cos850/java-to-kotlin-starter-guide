package com.lannstark.lec02

/**
 * 02: Kotlin에서 null을 다루는 방법
 */
fun main() {
    /**
     * - safe call (`?.`)
     *  : null이 아니면 실행하고, null이면 실행하지 않음
     */
    var str1: String? = "ABC"
//    print(str1.length)  // 오류!
    println(str1?.length) // 가능

    str1 = null
    println(str1?.length)   // 결과: null

    /**
     * - elvis 연산자 (`?:`)
     *  : 앞의 연산 결과가 null이면 뒤의 값을 사용
     */
    val str2: String? = "BAC"
    println(str2?.length ?: 0)    // 결과: 3

    /**
     * 플랫폼 타입
     * Person의 getName()에 @Nullable 이 붙은 경우
     * 코틀린은 이를 해석해서 아래 코드를 실행할 수 없게 함
     * val person = Person("ABC")
     * startsWithNotNull02(person.name) // @Nullable로 인한 오류!
     *
     * 그런데, 이렇게 @Nullable 이 없다면,
     * 코틀린은 이 값이 nullable인지 non-null인지 알 수 없다.
     * => 플랫폼 타입
     *
     * !!) 그러면 위 코드를 사용할 수 있도록 컴파일 오류가 나지 않기 때문에,
     *  Runtime에서 Exception이 발생할 수 있다.
     */
    val person = Person("ABC")
//    startsWithNotNull02(person.name)
}


/**
 * - java에서는 null이 가능한 변수를 바로 해당 객체의 함수를 호출할 수 없다.
 * - null이 가능한 객체에 접근하기 전에 위에서 null 검사를 해주면, 컴파일러가 null이 아니라고 간주하기 때문에 객체 내부의 요소에 접근할 수 있다.
 */

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


/**
 * non-null 단정자 (`!!.`)
 * : nullable 값이, 절대 null이 아닐 경우,
 * `!!.`를 통해 컴파일러에게 null이 절대 아닐 것을 단언할 수 있음
 * 하지만 null이 들어오게 된다면 `NullPointerException` 발생
 *
 */
fun startsWithNotNull01(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithNotNull02(str: String): Boolean {
    return str!!.startsWith("A")
}

