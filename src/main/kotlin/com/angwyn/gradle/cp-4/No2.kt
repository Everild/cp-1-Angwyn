package com.angwyn.gradle.`cp-4`

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numTests = scanner.nextInt()

    for (i in 1..numTests) {
        val num = scanner.nextInt()

        val binaryCount = Integer.bitCount(num)
        val hexCount = Integer.bitCount(Integer.parseInt(num.toString(), 16))

        println("$binaryCount $hexCount")
    }
}
