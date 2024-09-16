package com.lannstark.lec10

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("base class: number=${number}")
    }
}

class Derived(
    override val number: Int
): Base(number) {
    init {
        println("derived class: number=${number}")
    }
}