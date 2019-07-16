package ir.learn.app2.delegation

interface Base {
    fun printMe() //abstract method
    fun printMe2() //abstract method
}

class BaseImpl(val x: Int) : Base {
    override fun printMe2() {
        println(x * x)
    }

    override fun printMe() {
        println(x)
    }   //implementation of the method
}

class Derived(b: Base) : Base by b  // delegating the public method on the object b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.printMe() // prints 10 :: accessing the printMe() method
    derived.printMe2() // prints 100 :: accessing the printMe() method
}