package ir.learn.app2.delegation

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("Welcome to Tutorialspoint.com") {
            prop, old, new ->
        println("$old -> $new")
        println("$old -> $new")
    }
}
fun main(args: Array<String>) {
    val user = User()
    user.name = "first"
    user.name = "second"
}