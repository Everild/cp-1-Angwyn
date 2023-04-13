package com.angwyn.gradle.`cp-4`

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val n = scanner.nextInt()
        if (isPrime(n)) {
            val reversed = reverse(n)
            if (n != reversed && isPrime(reversed)) {
                println("$n is emirp.")
            } else {
                println("$n is prime.")
            }
        } else {
            println("$n is not prime.")
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..(Math.sqrt(n.toDouble()).toInt())) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun reverse(n: Int): Int {
    var result = 0
    var num = n
    while (num > 0) {
        result = result * 10 + num % 10
        num /= 10
    }
    return result
}
