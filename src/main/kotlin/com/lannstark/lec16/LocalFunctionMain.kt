package com.lannstark.lec16

fun main() {
    val person = createPerson("철수", "김")
}

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없음!!!")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(lastName + firstName, 1)
}