fun main(args: Array<String>) {

    var program=Program()

    //with
    with(program)
    {
        //name="Atul"
        //id="1"
        println(name)
        println(id)
    }
    //apply
    program.apply {

       // name="Atul"
       // id="1"
        println(name)
        println(id)

    }.startProgram()


}

class Program
{
    var name="p1"
    var id="-1"

    fun startProgram()
    {
        println("start Program")
    }
}