fun main(args: Array<String>) {
    val myList= listOf<Int>(1,4,5,7,10)

//   var smallList = myList.filter { sn-> sn < 5  } // sn-> sn < 5  predicate
    //OR
   /*var smallList = myList.filter { it < 5  }

   // println(smallList)

    for (num in smallList)
    {
        println(num)
    }*/

    val mySquaredNums = myList.map { it * it }     // OR { num -> num * num }
    for (num in mySquaredNums) {
        println(num)
    }

    var people = listOf<Pperson>(Pperson(10, "Steve"), Pperson(23, "Annie"), Pperson(17, "Sam"))
    var names = people.filter { person ->person.name.startsWith("S") }.map { it.name }

    for (name in names) {
        println(name)
    }
}

class Pperson(var age: Int, var name: String) {
    // Some other code..
}