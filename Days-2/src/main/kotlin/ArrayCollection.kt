fun main(args: Array<String>) {

    // Array - Mutable
    // Runtime halinde bir item üyesinin eklenmesi / silinmesi yeteneğine sahiptir.
    var arr = mutableListOf<String>()

    // Add Item
    arr.add("İstanbul")
    arr.add("Ankara")
    arr.add("İzmir")
    arr.add("Bursa")
    arr.add("Adana")
    arr.add("Gaziantep")
    arr.add("Diyarbakır")
    arr.add("Antalya")
    arr.add("Kırıkkale")

    // single item
    println( arr.get(0) )

    // index add
    arr.add(1, "Samsun")

    // remove item
    arr.removeAt(0);

    // all items
    for( item in arr ) {
        println("item : ${item}")

        if ( item == "Ankara" ) {
            continue
        }
        if ( item == "Bursa" ) {
            println("Bursa Found!")
            break
        }
    }


    // All items
    println( arr )


}