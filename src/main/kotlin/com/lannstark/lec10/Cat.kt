package com.lannstark.lec10

import jdk.incubator.vector.VectorSpecies

/**
 * `:` == extends
 * 타입으로 사용할 경우 붙여서 사용 (`val name: String`)
 * 상속으로 사용할 때는 띄워서 사용 (`class Cat : Animal`)
 */
class Cat(species: String) : Animal(species, 4) {
    override fun move() {
        println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어다닙니다.")
    }
}