fun main(args: Array<String>) {

    lateinit var name: String
    name="Atul"
    println(name)

}


// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it
// lateinit can be used with var only.

// If you try to access lateinit variable without initializing it then it throws UninitializedPropertyAccessException