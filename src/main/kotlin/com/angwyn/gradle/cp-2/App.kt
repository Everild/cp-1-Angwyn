package com.angwyn.gradle.`cp-2`

fun main() {
    val input1 = readLine()?.toInt() ?: 0

    val input2 = readLine()?.toInt() ?: 0

    val input3 = readLine()?.toInt() ?: 0

    val input4 = readLine()?.toInt() ?: 0

    val input5 = readLine()?.toInt() ?: 0

    val arr = arrayOf(input1, input2, input3, input4, input5)
    var total1 = 0
    var total2 = 0
    var counter = 0

    for (i in arr[1]..arr[2]) {
        if (i % 2 != 0) {
            total1 += i
        }
    }

    for (i in arr[3]..arr[4]) {
        if (i % 2 != 0) {
            total2 += i
        }
    }

    for (j in 1..arr[0]) {
        counter += 1
        if (counter > 1) {
            break
        }
        println("Case 1 : $total1")
        println("Case 2 : $total2")
    }
}
