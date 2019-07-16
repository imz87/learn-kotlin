package ir.learn.app2.generic_types

fun main(args: Array<String>) {
    var objet1 = genericsExample2<Int>(10)
    var object2 = genericsExample2<Double>(10.00)
    println(objet1)
    println(object2)
}
class genericsExample2<out T>(input:T) {
    init {
        println("I am getting called with the value $input")
    }
}