package com.example.lab1
import java.util.*


fun main(args: Array<String>) {
        //bộ lọc
        val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
        val eager = decorations.filter { it [0] == 'p' }
        println("eager: $eager")
        val filtered = decorations.asSequence().filter { it[0] == 'p' }
        println("filtered: $filtered")
        val newList = filtered.toList()
        println("new list: $newList")
        val lazyMap = decorations.asSequence().map {
                println("access: $it")
                it

        }
        println("lazy: $lazyMap")
        println("-----")
        println("first: ${lazyMap.first()}")
        println("-----")
        println("all: ${lazyMap.toList()}")
        val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
                println("access: $it")
                it
        }
        println("-----")
        println("filtered: ${lazyMap2.toList()}")

        val mysports = listOf("basketball", "fishing", "running")
        val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
        val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
        val mylist = listOf(mysports, myplayers, mycities)     // list of lists
        println("-----")
        println("Flat: ${mylist.flatten()}")
        // hàm main()
        println("Hello, ${args[0]}");
        val isUnit = println("This is an expression")
        println(isUnit)
        val temperature = 10
        val isHot = if (temperature > 50) true else false
        println(isHot)
        //Tìm hiểu lý do tại sao (gần như) mọi thứ đều có giá trị
        val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
        println(message)
        feedTheFish()
        swim()
        swim("slow")
        swim(speed="turtle-like")
}
// Tìm hiểu thêm về các chức năng
fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
                isTooHot(temperature) -> true
                isDirty(dirty) -> true
                isSunday(day) -> true
                else  -> false
        }
}
// Khám phá các giá trị mặc định và các hàm nhỏ gọn
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println ("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
}
fun randomDay():String {
        var week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday")
        return return week[Random().nextInt(week.size)]
}
fun fishFood (day : String) : String {
        val food : String
        return when (day) {
                "Monday" -> "flakes"
                "Wednesday" -> "redworms"
                "Thursday" -> "granules"
                "Friday" -> "mosquitoes"
                "Sunday" -> "plankton"
                else -> "nothing"
        }
}
fun swim(speed: String = "fast") {
        println("swimming $speed")
}