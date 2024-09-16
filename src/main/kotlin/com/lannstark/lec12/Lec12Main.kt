package com.lannstark.lec12

fun main() {
    Person.newBody("ABC")

    println("a = ${Singleton.a}")
    Singleton.a = 10
    println("a = ${Singleton.a}")

    moveSomething(object : Movable{
        override fun move() {
            println("움직인다")
        }

        override fun fly() {
            println("날다")
        }
    })

}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}