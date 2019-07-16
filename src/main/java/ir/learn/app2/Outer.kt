package ir.learn.app2

class Outer {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"

    inner class Nested {
        fun foo() = welcomeMessage
    }
}