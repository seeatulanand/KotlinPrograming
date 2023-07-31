fun main(args: Array<String>) {
    // Elements :   5   6    8   9   10
    // Index    :   0   1   2   3   4

//    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements
    var list = ArrayList<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Atul")        // 0
    list.add("Anand")    // 1
    list.add("Amit")    // 2

    for (element in list) {             // Using individual elements (Objects)
        println(element)
    }


}