fun main(args: Array<String>) {
    var program = MyProgram()
    var result = 0;
    program.addTwoNumber(7, 8) { a, b -> result = a + b }

    println(result)

}

class MyProgram {
    fun addTwoNumber(a: Int, b: Int, addTwoNum: (Int, Int) -> Unit) {
        addTwoNum(a, b)

    }
}