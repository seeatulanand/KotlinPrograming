/*
*
* 1. Lambda Expression
*   2. Higher-Order Function
* */
fun main(args: Array<String>) {
    val program = MYProgram()

//    val myLambda: (Int, Int) -> Int = { x, y -> x + y}  // Lambda Expression [ Function ]
// OR,
//    program.addTwoNumbers(2, 7, { x, y -> x + y })
// OR,
    program.addTwoNumbers(2, 7) {x, y -> x + y}

}


class MYProgram {

    fun addTwoNumbers(a: Int, b: Int, action: (Int,Int) -> Int) {  // High Level Function with Lambda as Parameter
        val sum = action(a,b)
        println("sum is $sum")

    }
}

