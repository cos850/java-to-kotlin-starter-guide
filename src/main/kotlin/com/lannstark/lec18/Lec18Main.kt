package com.lannstark.lec18

fun main() {
    val fruits = listOf(
        Fruit("사과", 500),
        Fruit("사과", 1000),
        Fruit("사과", 1500),
        Fruit("오렌지", 500),
        Fruit("오렌지", 1000),
        Fruit("오렌지", 1500),
        Fruit("바나나", 500),
        Fruit("바나나", 1000),
        Fruit("바나나", 1500),
    )

    /**
     * filter / map
     */
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val bananas = fruits.filterIndexed { idx, fruit ->
        print(idx)
        fruit.name == "바나나"
    }

    val applePrices = fruits
        .filter { fruit -> "사과" == fruit.name }
        .map { fruit -> fruit.price }

    val bananaPrices = fruits
        .filter { fruit -> "바나나" == fruit.name }
        .mapIndexed { idx, fruit ->
            print(idx)
            fruit.price
        }

    val orangePrices = fruits
        .filter { fruit -> "오렌지" == fruit.name }
        .mapNotNull { fruit -> fruit.price }


    /**
     * collection 기능들
     */
    // all
    val isAllApple = fruits.all { fruit -> "사과" == fruit.name } // false
    println("isAllApple = ${isAllApple}")

    // none
    val isNoApple = fruits.none { fruit -> "사과" == fruit.name } // false
    println("isNoApple = ${isNoApple}")

    // any
    val containsApple = fruits.any { fruit -> "사과" == fruit.name }  // true
    println("containsApple = ${containsApple}")

    // count
    val fruitsSize = fruits.count()
    val numberOfApples = fruits.count {
        fruit -> "사과" == fruit.name
    }
    println("numberOfApples = ${numberOfApples}")

    // sortedBy
    val ascendingFruits = fruits.sortedBy { fruit -> fruit.price }
    println("ascendingFruits = ${ascendingFruits}")

    val descendingFruits = fruits.sortedByDescending { fruit -> fruit.price }
    println("ascendingFruits = ${ascendingFruits}")


    // distinctBy
    val distinctFruitsNames = fruits.distinctBy { fruit -> fruit.name }
    println("distinctFruitsNames = ${distinctFruitsNames.map { it.name }}") // [사과, 오렌지, 바나나]


    // first, firstOrNull
    println(fruits.first().name)
    println(fruits.firstOrNull()?.name)

    val emptyList = emptyList<Fruit>()
    println(emptyList.firstOrNull()?.name)

    println()

    // last, lastOrNull
    println(fruits.last().name)
    println(fruits.lastOrNull()?.name)

    println(emptyList.lastOrNull()?.name)


    /**
     * list to map
     */
    // groupBy
    val fruitsMap: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }  // 과일 이름을 기준으로 그룹핑함.
    println("fruitsMap = ${fruitsMap}")

    val fruitPriceMap: Map<String, List<Int>> = fruits.groupBy(
        { fruit -> fruit.name},
        {fruit -> fruit.price}
    )
    println("fruitPriceMap = ${fruitPriceMap}") // fruitPriceMap = {사과=[500, 1000, 1500], 오렌지=[500, 1000, 1500], 바나나=[500, 1000, 1500]}

    // associateBy
    val fruitsMap2: Map<String, Fruit> = fruits.associateBy { fruit -> fruit.name + fruit.price }
    println("fruitsMap2 = ${fruitsMap2}")

    val fruitPriceMap2: Map<String, Int> = fruits.associateBy(
        {fruit -> fruit.name + fruit.price}, {fruit -> fruit.price}
    )
    println("fruitPriceMap2 = ${fruitPriceMap2}")   // fruitPriceMap2 = {사과500=500, 사과1000=1000, 사과1500=1500, 오렌지500=500, 오렌지1000=1000, 오렌지1500=1500, 바나나500=500, 바나나1000=1000, 바나나1500=1500}


    /**
     * 중복된 컬렉션 처리
     */
    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit("사과", 100, 200),
            Fruit("사과", 200, 200),
            Fruit("사과", 300, 200)
        ),
        listOf(
            Fruit("바나나", 100, 300),
            Fruit("바나나", 200, 300),
            Fruit("바나나", 300, 300)
        ),
        listOf(
            Fruit("오렌지", 100, 100),
            Fruit("오렌지", 200, 100),
            Fruit("오렌지", 300, 100)
        )
    )

    // flatMap
    val price200: List<Fruit> = fruitsInList.flatMap {
        list -> list.filter { fruit -> 200 == fruit.price }
    }
    println("price200 = ${price200}")

    val samePriceFruits = fruitsInList.flatMap(List<Fruit>::samePriceFilter)
    println("samePriceFruits = ${samePriceFruits}")



}

data class Fruit(
    val name: String,
    val price: Int,
    val currentPrice: Int = 0
) {
   val isSamePrice: Boolean
       get() = this.price == this.currentPrice
}

fun List<Fruit>.samePriceFilter(): List<Fruit> = this.filter(Fruit::isSamePrice)
