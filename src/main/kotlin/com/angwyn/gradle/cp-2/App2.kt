package com.angwyn.gradle.`cp-2`

fun mutiple(number: Int){

    if (number % 11 != 0) {
        println("$number is a mutiple of 11")
    }  else {
        println("$number is not a mutiple of 11")
    }
}

fun main() {
    println(mutiple(112233))
    println(mutiple(30800))
    println(mutiple(2937))
    println(mutiple(323455693))
    println(mutiple(5038297))
    println(mutiple(112234))

}