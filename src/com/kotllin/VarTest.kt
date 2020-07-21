package com.kotllin

import java.math.BigDecimal

fun main(args:Array<String>) {
    println("test")
    var i:Int=2 // var i:Integer =2; error
    var bd = BigDecimal(12);
    var b1 = BigDecimal(1) //new is not required
    var bd2:BigDecimal=BigDecimal.valueOf(100)
    print(bd2::class)
    print(bd2)
}