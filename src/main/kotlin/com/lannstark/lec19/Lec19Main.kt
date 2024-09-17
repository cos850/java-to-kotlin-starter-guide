package com.lannstark.lec19

import com.lannstark.lec18.Fruit

/**
 * as import
 */
import com.lannstark.lec19.a.printHelloWorld as helloWorldA
import com.lannstark.lec19.b.printHelloWorld as helloWorldB

fun main() {
    helloWorldA()
    helloWorldB()

    /**
     * 구조분해
     */
    val person = Person("철수", 5)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()

    println("name = ${name}, age = ${age}")


    /**
     * jump, label
     */
    val numbers = listOf(1, 2, 3)
    run {
        numbers.forEach {num ->
            if (num == 2) {
                return@run
            }
        }
    }

    numbers.forEach {num ->
        if (num == 2) {
            return@forEach
        }
    }

    root@ for(i in 1..10) {
        for(j in 1..10) {
            if(j == 2) {
                break@root
            }
        }
    }


    /**
     * takeIf, takeUnless
     */

}

class Person(val name: String, val age: Int) {
    operator fun component1(): String {
        return this.name
    }
    operator fun component2(): Int {
        return this.age
    }
}

/**
 * typealias
 */
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) { /** ... */ }

data class UltraSuperGuardianTribe(val name: String)
typealias USGTMap = Map<String, UltraSuperGuardianTribe>


val number = 0
fun getNumberOrNull(): Int? {
    return if(number <= 0) null
        else number
}

fun getNumberOrNull2(): Int? {
    return number.takeIf { number -> number > 0 }
}

fun getNumberOrNull3(): Int? {
    return number.takeUnless { it <= 0 }
}