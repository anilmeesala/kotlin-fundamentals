package com.kotllin

fun main() {
    var a=10;//type inference
    var b:Int=20

    //string templates
    println("a is ${a}");
    //escape with \
    println("a is \$a");
    var s= """
        multiline string
        line2
    """;
    var d1:Double=10.0
    println("${d1 is Double}")
    println("${d1::class.qualifiedName}")
    println("${d1.javaClass.name}")
}