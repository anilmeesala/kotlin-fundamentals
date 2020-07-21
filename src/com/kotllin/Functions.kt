package com.kotllin

//public by default
//private can be accessed only within file
fun hello(){
    print("hello")
}
fun hello3():String{
   return "hello"
}
//single expression fun
//return type inferred
//b default value
fun add(a:Int,b:Int=1)=a+b
//input -> return type
//(String)->Int
fun lamdaTest(s:String,action: (String)->Int){
    action(s);
}



private fun hello1(){
    print("hello1")
}

fun main() {
    hello()
    hello1()
    add(b=1,a=1)//named params
}