package ir.learn.app2.sealed_class

sealed class MyExample {
    class OP1 : MyExample() // MyExmaple class can be of two types only
    class OP2 : MyExample() {
        fun calculate(): Int {
            return 53
        }
    }
}

fun main(args: Array<String>) {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) { // defining the object of the class depending on the inuputs
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "option Two has been chosen"
    }

    println(output)

    val obj2: MyExample.OP2 = MyExample.OP2()
    println(obj2.calculate())

}