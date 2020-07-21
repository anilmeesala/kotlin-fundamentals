package com.kotllin

//types (classes,interfaces) are public by default
//we can have many public classes in single file
//package dir structure need not match

//If the constructor has annotations or
//visibility modifiers, the constructor keyword is required, and the modifiers go before it:
//class Customer public @Inject constructor(name: String) { /*...*/ }
class ClassTest(var name:String) {
    //to override or customize get/sets
    var address="test"; //default get/sets are there

    init {
        println("Init block")
    }
    //secondary constructor, should call primary constructor
    constructor(name: String,age:Int) : this(name) {
    }
    var age:Int=0
//    get() =  field
//        or
    get() {
    return field
    }
//    set(value){
//        field=value;
//    }
//    visibility private
    private set(value) {
    field = value
    }
    public var _table: Map<String, Int>? = null
    public var table: Map<String, Int>? = null
        get() {
            if (_table == null) {
                _table = HashMap() // Type parameters are inferred
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
//    static fun
    companion object{
        fun statFun():Int{
            return 10;
        }
    }
}

fun main() {

    var ct = ClassTest("test",10)//no new required
//    ct.age=10;
    ct.name="test";
    ct.address="test1"
    //getter setters created automatically
//    static fun
    ClassTest.statFun();

}