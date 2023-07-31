fun main(args: Array<String>) {
    //map data structure which store data in key value pair.
   /*// Immutable map
    var map = mapOf<Int, String>(5 to "Atul", 6 to "Anand", 7 to "Amit") // Read operation
    for (mapelement in map.keys) {
        println(map[mapelement])
       // println(map.get(mapelement))
    }*/

    //Mutable map
   // var Map = HashMap<Int,String>()  //// Read and write operation , no fixed size
   //    var Map = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size // this return linked hash map
    var map = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
    map.put(6,"Atul")
    map.put(10,"Anand")
    map.put(11,"Amit")

    for (hashMapelement in map.keys)
    {
        println(map[hashMapelement])
    }
}