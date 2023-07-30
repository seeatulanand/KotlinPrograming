fun main(args: Array<String>) {
    //object class
    /*CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("hello")*/

       println(MyClass.count)
       println(MyClass.typeOfCustomers())


}


//companion object.

class MyClass {
   companion object  {  // Object Declaration

        var count: Int = -1             // Behaves like a STATIC variable
        //if we want to call this method from java class add @JvmStatic
        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like a STATIC method
            return "Indian"
        }
    }
}



/*
open class MySuperClass {

    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData: MySuperClass() {      // Object Declaration

    var count: Int = -1             // Behaves like a STATIC variable

    fun typeOfCustomers(): String { // Behaves like a STATIC method
        return "Indian"
    }

    override fun myMethod(str: String) {    // Currently, behaving like a STATIC method
        super.myMethod(str)
        println("object Customer Data: $str")
    }
}*/
