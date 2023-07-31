
/*
* 'it' keyword
* */
fun main(args: Array<String>) {
    var reverse = Reverse()
    //reverse.reverseString("Atul"){ s -> s.reversed()}
    reverse.reverseString("Atul"){ it.reversed()}

}

class Reverse
{
    //Normal way
    /*fun reverseString(str:String,revstr:(String)->String)
    {
        var resultRev = revstr(str)
        println(resultRev)

    }*/
    fun reverseString(str:String,revstr:(String)->String)  //// High Level Function with Lambda as Parameter
   {
       var resultRev = revstr(str) //// it.reversed() ==> str.reversed() ==> "Atul".reversed() = "lutA"
       println(resultRev)

   }

}