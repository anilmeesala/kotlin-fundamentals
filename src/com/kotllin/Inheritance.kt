package com.kotllin

class Inheritance {

}

open class Base(p: Int)

class Derived(p: Int) : Base(p)
//If the derived class has a primary constructor, the base class
//can (and must) be initialized right there, using the parameters of the primary constructor.

//If the derived class has no primary constructor, then each secondary constructor has to
//initialize the base type using the super keyword, or to delegate to another constructor which does that. Note that
//in this case different secondary constructors can call different constructors of the base type:
//class MyView : View {
//    constructor(ctx: Context) : super(ctx)
//
//    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//}
//Kotlin requires explicit modifiers for overridable members (we call them open) and for overrides:
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

//A member marked override is itself open,
//i.e. it may be overridden in subclasses. If you want to prohibit re-overriding, use final:
open class Rectangle() : Shape() {
    final override fun draw() { /*...*/ }
}
//Overriding properties works in a similar way to overriding methods;
open class Shape1 {
    open val vertexCount: Int = 0
}

class Rectangle1 : Shape1() {
    override val vertexCount = 4
}
//You can also override a val property with a var property, but not vice versa
//Calling the superclass implementation

open class Rectangle2 {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle2() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

open class Rectangle3 {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle3(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle3>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

open class Polygon2 {
    open fun draw() {}
}

abstract class Rectangle4 : Polygon2() {
    abstract override fun draw()
}