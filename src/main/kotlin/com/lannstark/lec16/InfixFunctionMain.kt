package com.lannstark.lec16

fun main() {
    var i = 1

    println(i.add(1))
    println(i.infixAdd(1))
    println(i infixAdd 1)

}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.infixAdd(other: Int): Int {
    return this + other
}