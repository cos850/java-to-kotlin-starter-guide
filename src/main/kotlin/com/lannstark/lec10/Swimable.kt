package com.lannstark.lec10

interface Swimable {

    val swimAbility: Int

    val swimSpped: Int
        get() = 3

    fun act() {
        println("어푸어푸")
    }
}