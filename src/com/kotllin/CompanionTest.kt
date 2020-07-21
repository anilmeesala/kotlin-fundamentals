package com.kotllin

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

//The name of a class used by itself (not as a qualifier to another name)
//acts as a reference to the companion object of the class (whether named or not)
class MyClass1 {
    companion object Named { }
}

val x = MyClass1

class MyClass2 {
    companion object { }
}

val y = MyClass2
//To create an object of an anonymous class that inherits from some type (or types), we write:
//window.addMouseListener(object : MouseAdapter() {
//    override fun mouseClicked(e: MouseEvent) { /*...*/ }
//
//    override fun mouseEntered(e: MouseEvent) { /*...*/ }
//})

//open class A(x: Int) {
//    public open val y: Int = x
//}
//
//interface B { /*...*/ }
//
//val ab: A = object : A(1), B {
//    override val y = 15
//}
//
//fun foo() {
//    val adHoc = object {
//        var x: Int = 0
//        var y: Int = 0
//    }
//    print(adHoc.x + adHoc.y)
//}

class Temp{
    object Holder{
        fun foo() = 1
    }

    companion object{
        fun foo() = "Hello World"
    }
}

//then you can access both of these objects as following From containing class

//foo()   // call to companion object function
//Holder.foo() // call to plain object function

//and from outside the class

//Temp.foo() // call to companion object function
//Temp.Holder.foo() // call to plain object function

//Under the hood every object declaration creates a singleton. in case of companion
//object the singleton object is created in the static initializer of the containing class.
//but in case of plain objects singleton instance is created lazily when the object class is accessed for the first time.