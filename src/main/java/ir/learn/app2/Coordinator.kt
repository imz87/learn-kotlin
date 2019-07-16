package ir.learn.app2

class Coordinator {

    fun creator() {
        val customer = Customer(1, "iman.@google.com")
        println(customer.email)


        val e = 3L
        println(e)


        nullability()

        val items2 = listOf(1, 2, 3, 4, 5, 6, 7)
        listItem(items2)

        items2.listIterator().forEach { println(it) }

        for (i in 3..6)
            println("item : $i")

        for (i in items2) {
            when (i) {
                1 -> println("it is one")
                2 -> println("it is two")
                3,4,5 -> println("it is 3,4,5")
                else -> println("it is bigger than 5")
            }
        }

        val items3 = listOf(90, 91, 92, 93, 94, 95, 96)

        val itemsWithIndex = items3.withIndex()
        for ((i, v) in itemsWithIndex){
            println("the element at $i is $v")
        }
        println(itemsWithIndex)


        val client = Client()
        client printMe "hii "

        println()

        val t = Developer()
        t.think()
        t.programmer.think()



        val d = DevTypeAlias()
        d.think()

    }

    private fun listItem(items2: List<Int>) {
        val items = listOf(1, 2, 3, 4, 5)
        val biggerThan2 = items.filter { this.filterBy2(it) }
        println(biggerThan2)
        val biggerThan3 = items2.filter { this.filterBy2(it) }
        println(biggerThan3)
    }

    fun filterBy2(i: Int): Boolean {
        return i > 2
    }

    fun nullability() {
        var neverNull: String = "This can't be null"            // 1

//        neverNull = null                                        // 2

        var nullable: String? = "You can keep a null here"      // 3

        nullable = null                                         // 4

        var inferredNonNull = "The compiler assumes non-null"   // 5

//        inferredNonNull = null                                  // 6

        fun strLength(notNull: String): Int {                   // 7
            return notNull.length
        }

        println(strLength(neverNull))                                    // 8
        println(nullable?.let { strLength(it) })
    }
}