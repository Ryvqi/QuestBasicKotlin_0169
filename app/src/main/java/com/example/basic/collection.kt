package com.example.basic

fun ContohList(){
    println("=== List ===")

    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)