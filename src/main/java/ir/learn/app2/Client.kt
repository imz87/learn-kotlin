package ir.learn.app2

class Client {
    private var name: String = "Hilda"

    fun printMe() {
        print("The name is : $name")
    }

    infix fun printMe(message: String) {
        print(message + name)
    }

}