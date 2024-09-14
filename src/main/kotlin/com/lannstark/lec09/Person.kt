package com.lannstark.lec09

/**
 * primary constructor
 */
class Person (name: String, var age: Int) {

    /**
     * init block
     */
    init {
        println("초기화 블록")
        if(age <= 0) {
            throw IllegalArgumentException()
        }
    }

    /**
     * secondary constructor
     */
    constructor(name: String) : this(name, 1) {
        println("부생성자 1 - name만 인수로")
    }

    constructor(): this("홍길동") {
        println("부생성자 2 - 아무것도 받지 않음")
    }

    /**
     * custom getter/setter
     */
    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    val isAdult: Boolean
        get() = this.age >= 20
}