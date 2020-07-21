package com.kotllin

fun main() {
    //we have null and non null data types
    var s:String?=null; //nullable data types

//    print(s.toUpperCase())//not possible on null data types
    if(s!=null){
        print(s.toUpperCase()) //smart cast
    }
    print(s?.toUpperCase()) //null safe operator
    print(s!!.toUpperCase()) //will result NPE if value not assigned
    s="test";

    print(s.toUpperCase()) //s is smart cast to non null data types

    var s2 = null; //inferred as nothing
//    s2="test" // cannot be assigned anything to nothing type

}