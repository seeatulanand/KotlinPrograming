fun main(args: Array<String>) {
var student1=Student("Atul","1")
var student2=Student("Atul","1")

    /*println("Student 1 address -> $student1")
    println("Student 2 address -> $student2")*/



    if (student1==student2)
    {
     println("Equal")
    }
    else
    {
        println("Not Equal")
    }

    /*var student_copied= student1.copy(id="100",name = "Anand")
    println(student_copied)*/
}
//dealing with data only.
data class Student(var name:String,var id:String)
{

}


//without data class it will give not equal
/*class Student(var name:String,var id:String)
{

}*/
