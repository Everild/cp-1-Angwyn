package com.angwyn.gradle.`cp-1`

//class No2 {
//}
fun main() {
    val input = """
        4
        2
        2. A
        1. B
        5
        1. A
        5. B
        3. D
        4. E
        2. C
        1
        1. C
        5
        5. E
        4. D
        3. C
        2. B
        1. A
    """.trimIndent()

    val cases = input.trim().split("\n\n")
    var caseNumber = 1
    for (case in cases) {
        val numbers = case.split("\n").drop(1).map { it.substringBefore(".") }
        val strings = case.split("\n").drop(1).map { it.substringAfter(". ") }
        val sortedPairs = numbers.zip(strings).sortedWith(compareBy({ it.second }, { it.first }))
        println("Case #$caseNumber:")
        for (pair in sortedPairs) {
            println("${pair.first}. ${pair.second}")
        }
        caseNumber++
    }
}