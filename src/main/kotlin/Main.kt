fun main(args: Array<String>) {

    //Null safety in the kotlin

    /*
    * Null safety operator in the kotlin
    * */

    // ?. => safe call operator, !! => not null Assertion  , Elvis => ?: , ?.let(..) ==> safe call with let.


    val name: String? = "Atul"    // change it to null and see the effect in output

    // 1. Safe Call ( ?. )
    // Returns the length if 'name' is not null else returns NULL
    // Use it if you don't mind getting NULL value
    println(message = "The length(?.) of name is ${name?.length}")

    // 2. Safe Call with let ( ?.let )
    // It executes the block ONLY IF name is NOT NULL

    name?.let {
        println(message = "The length (?.let) of name is ${name?.length}")

    }

    /*
    * // 3. Elvis-operator ( ?: )
    // When we have nullable reference 'name', we can say "is name is not null", use it,
    // otherwise use some non-null value"
    val len = if (name != null)
        name.length
    else
        -1
    * */

    val length = name?.length ?: -1
    println("The length(Elvis-operator) of name is ${length}")

    // 4. Non-null assertion operator ( !! )
    // Use it when you are sure the value is NOT NULL
    // Throws NullPointerException if the value is found to be NULL

    println("The length(!!) of name is ${name!!.length}")
}