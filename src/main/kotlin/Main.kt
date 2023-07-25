fun main(args: Array<String>) {
    var student=Student("Atul Anand")
}

class Student(var name:String)
{
    init {
        println("My name is $name")
    }
}