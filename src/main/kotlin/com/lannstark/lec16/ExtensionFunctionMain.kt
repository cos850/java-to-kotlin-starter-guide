package com.lannstark.lec16

fun main() {
    /**
     * 확장 함수
     */
    println("ABC".lastChar())

    val person = Person("철수", 5)
    println(person.nextYearAge())   // 멤버 함수 호출

    val train = Train()
    train.isRunning()       // train의 멤버함수 호출
    val srtTrain: Train = Srt()
    srtTrain.isRunning()    // train의 멤버함수 호출
    val srt = Srt()
    srt.isRunning()         // srt의 확장 함수호출

    /**
     * 확장 프로퍼티
     */
    println("ABCD".lastChar)
}


fun String.lastChar(): Char = this[this.lastIndex]

val String.lastChar: Char
    get() = this[this.lastIndex]

class Person(val name: String, var age: Int) {
    fun nextYearAge(): Int {
        println("member function")
        return this.age + 1
    }
}

fun Person.nextYearAge(): Int {
    println("extension function")
    return this.age + 1
}

open class Train()
class Srt() : Train()

fun Train.isRunning() = true
fun Srt.isRunning() = false

