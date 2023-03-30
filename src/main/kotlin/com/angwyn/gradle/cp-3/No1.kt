package com.angwyn.gradle.`cp-3`

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        val n = input.nextInt()
        val m = input.nextInt()

        if (n == 0 && m == 0) {
            break
        }

        val numbers = mutableListOf<Int>()

        for (i in 0 until n) {
            numbers.add(input.nextInt())
        }

        Collections.sort(numbers, Comparator<Int> { a, b ->
            when {
                a % m < b % m -> -1
                a % m > b % m -> 1
                a % 2 == 0 && b % 2 != 0 -> 1
                a % 2 != 0 && b % 2 == 0 -> -1
                a % 2 == 0 && b % 2 == 0 -> {
                    if (a < b) -1 else 1
                }
                else -> {
                    if (a < b) 1 else -1
                }
            }
        })

        println("$n $m")

        for (number in numbers) {
            println(number)
        }
    }
}