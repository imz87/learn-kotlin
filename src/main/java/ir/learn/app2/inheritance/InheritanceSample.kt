package ir.learn.app2.inheritance


open class ABC {
    open fun think () {
        println("Hey!! i am thiking ABC")
    }
}
class BCD: ABC(){ // inheritence happend using default constructor
    override fun think() {
        super.think()
        println("Hey!! i am thiking in BCD")
    }
}

fun main(args: Array<String>) {
    var  a = BCD()
    a.think()
}