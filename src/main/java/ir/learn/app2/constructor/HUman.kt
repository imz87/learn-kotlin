package ir.learn.app2.constructor

fun main(args: Array<String>) {
    val HUman = HUman("TutorialsPoint.com", 25)
    println("${HUman.message}"+"${HUman.firstName}"+
            "Welcome to the example of Secondary  constructor, Your Age is-${HUman.age}")
    val HUman2 = HUman("TutorialsPoint.com", 25, "Chetori")
    println("message is : ${HUman2.message}")

    val humanNumber = HUman("TutorialsPoint.com", 25, 50)
    println("number is : ${humanNumber.number}")

}
class HUman(val firstName: String, var age: Int) {
    var message:String  = "Hey!!!"
    var number : Int = 0

    constructor(name : String , age :Int ,message :String):this(name,age) {
        this.message = message
    }

    constructor(name : String , age :Int ,number :Int):this(name,age) {
        this.number = number
    }
}