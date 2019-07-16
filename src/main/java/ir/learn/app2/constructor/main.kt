package ir.learn.app2.constructor

fun main(args: Array<String>) {
   val person1 = Person("TutorialsPoint.com", 15)
   println("First Name = ${person1.firstName}")
   println("Age = ${person1.age}")
   person1.age = 10
   println("Age = ${person1.age}")

}

