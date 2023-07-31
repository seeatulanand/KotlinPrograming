fun main(args: Array<String>) {
    var array = Array<Int>(5){0}
    array[0]=1
    array[1]=2
    array[2]=3
    array[3]=4
    array[4]=5

   /* for (i in 0..array.size-1)
    {
        //println(i)
        println(array[i])

    }*/


    for (i in 0 until array.size)
    {
        //println(i)
        println(array[i])

    }


}