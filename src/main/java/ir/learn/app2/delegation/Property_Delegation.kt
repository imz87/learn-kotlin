package ir.learn.app2.delegation

val myVar: String by lazy {
    "Hello"
}
fun main(args: Array<String>) {
    println(myVar +" My dear friend")
}