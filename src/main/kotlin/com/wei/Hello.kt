package com.wei

fun main(args: Array<String>) {
    //println("Hello Kotlin")
    //Human().hello()
//    val h = Human(67f, 1.8f)
    val h = Human(weight = 67f, height = 1.8f)
    println(h.bmi())

    val score = 88
    println(score > 80)

    val c:Char = 'A'
    println(c.toInt() > 60)

    /*var age : Int = 19
    age = 20
    var weight = 66.5f
    var name : String
            name = "Wei"*/

}


class Human (var weight : Float , var height : Float , var name : String="") {

    init {
        println("test$weight")
    }

//    constructor(name:String , weight: Float , height: Float): this (weight, height)

    fun bmi():Float{
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }

}