package com.example.basic

fun nullSafety() {
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a null here"

    nullable = null

    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    println(neverNull.length) // 18
    println(nullable?.length) // null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) // 18
}

fun main() {
    nullSafety()
}