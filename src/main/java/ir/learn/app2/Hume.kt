package ir.learn.app2

typealias DevTypeAlias = Developer

class Developer : Human {

    override fun think() {
        println("I am an example of Class ")
    }

    val programmer: Human = object : Human {
        override fun think() { // overriding the think method
            println("I am an example of Anonymous Inner Class ")
        }
    }
}

interface Human {
    fun think()
}