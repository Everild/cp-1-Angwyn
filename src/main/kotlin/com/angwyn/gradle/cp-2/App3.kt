package com.angwyn.gradle.`cp-2`

fun main() {
    print("Masukkan kalimat: ")
    val sentenceWithDoubleQuotes = readLine()!!
    val sentenceWithSingleQuotes = sentenceWithDoubleQuotes.replace("\"", "' '")
    println(sentenceWithSingleQuotes)
}

