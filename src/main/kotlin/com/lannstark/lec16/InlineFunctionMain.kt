package com.lannstark.lec16

fun main() {
 3.inlineAdd(4)
}

inline fun Int.inlineAdd(other: Int): Int {
    return this + other
}