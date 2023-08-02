fun main(args: Array<String>) {
    var human= Human()
    println(human.age)

}

class Human {
    var age = 20
     get() {
            //println("Age $age") // throw stackoverflow Exception.
            println("Age $field")
            return field
        }
        set(value) {
            if (value >= 0) {
                field = value
            }

        }
}