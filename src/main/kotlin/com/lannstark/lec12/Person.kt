package com.lannstark.lec12

class Person private constructor(
    private val name: String,
    private val age: Int
) {
    companion object {
        private const val MIN_AGE = 1

        fun newBody(name: String): Person {
            return Person(name, MIN_AGE)
        }

        @JvmStatic
        fun newBody2(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}