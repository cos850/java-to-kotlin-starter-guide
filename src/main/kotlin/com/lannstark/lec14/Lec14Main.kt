package com.lannstark.lec14

fun main() {
    val dto = PersonDto("철수", 5)

    println(dto.hashCode())
    println(dto)

    val dto2 = PersonDto("철수", 5)
    println(dto == dto2)

}

fun handleCountry(country: Country) {
    when(country) {
     Country.KOREA -> TODO()
     Country.AMERICA -> TODO()
    }
}

fun handleHyundaiCar(hyundaiCar: HyundaiCar) {
    when(hyundaiCar) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Grandeur -> TODO()
    }
}