package com.lannstark.lec14

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1L)

class Sonata : HyundaiCar("소나타", 2L)

class Grandeur : HyundaiCar("그렌저", 3L)