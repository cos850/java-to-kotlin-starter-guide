package com.lannstark.lec04

fun main() {
    var money1 = JavaMoney(100L)
    var money2 = JavaMoney(90L)

    /**
     * 비교 연산자
     */
    if(money1 > money2)
        println("money1 이 money2 보다 큽니다.")
    else
        println("money1 이 money2 보다 작습니다.")

    /**
     * 동등성, 동일성
     */
    money2 = JavaMoney(100L)
    if (money1 == money2)
        println("money1 과 money2 는 동일한 값을 가지고 있습니다.")

    money2 = money1
    if (money1 === money2)
        println("money1 과 money2 는 주소값이 동일합니다.")

    /**
     * 연산자 오버로딩
     */
    val money03 = KotlinMoney(10L)
    val money04 = KotlinMoney(20L)
    println("money03 + money04 = ${money03 + money04}")
}