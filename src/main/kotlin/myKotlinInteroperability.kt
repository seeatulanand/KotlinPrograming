@file:JvmName("MyCustomKotlinFileName")

/*
 *   Interoperability Example
 * */
fun main(args: Array<String>) {

    var area = MyJavaFile.getArea(10, 5)
    println("Printing area from Kotlin file: $area")
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

/*
* Kotlin Default Function with Interoperability @JvmOverloads
* */
@JvmOverloads
fun findVolume(length: Int, breath: Int, height: Int=50): Int {
    return length * breath * height;
}