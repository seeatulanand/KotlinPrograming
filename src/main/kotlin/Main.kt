fun main(args: Array<String>) {

    //all
    var  list_all = listOf<Int>(1,3,4,55,45)
    var  check_allList = list_all.all { it > 10 }  // num -> num > 10 ---> it>10

    println(check_allList)


    //any
    var list_any = listOf<Int>(2,5,4,9,15)
    var check_any = list_any.any { it > 10 }
    println(check_any)

    var count_in = listOf<Int>(2,5,4,9,15)
    var count = count_in.count { it > 15 }

    println(count)


    var find_in = listOf<Int>(2,5,4,9,15)

    var firstElement= find_in.find { it < 5 } //Return the first element that matches the predicates
    println(firstElement)

    //Storing lambda function in the variable.
    // we can use myPredicates in the above example.
    var myPredicates = {number:Int->number>10}





}