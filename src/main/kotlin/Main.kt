fun main(args: Array<String>) {

    var cat = Cat()
    cat.eat()
    println(cat.color)
}


open class Animal {         // Super class / Parent class /  Base class

    open var color: String = "White"


    open fun eat() {  // by Default method is final,so we can not override, need to make it open.
        println("Animal is Eating")
    }
}

class Dog : Animal() {      // Sub class / Child class / Derived class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}
class Cat : Animal() {      // Sub class / Child class / Derived class

    var age: Int = -1
    override var color="Black"

    fun meow() {
        println("Meow")
    }

    override fun eat() {
        super<Animal>.eat() //if we are implementing any interface ,interface also containing  eat,
                            // to avoid the confusion we need mention <Animal>
        println("Cat is Eating")
    }
}