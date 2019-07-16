package ir.learn.app2.generic_types

fun main(args: Array<String>) {
    var objet = genericsExample<String>("JAVA")
    var objet1 = genericsExample<Int>(10)
}

class genericsExample<T>(input: T) {
    init {
        println("I am getting called with the value " + input)
    }
}