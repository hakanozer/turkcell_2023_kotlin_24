fun main(args: Array<String>) {

    // Array
    // Bir değişken içerisinde birden fazla değer tutma
    // daha sonradan değişimi olmayan Array - unMutable
    val arr1 = arrayOf("Hatay", "Kahraman Maraş", "Adana", "Adıyaman", "Şanlıurfa", "Elazığ")

    // size
    // içerisindeki eleman sayısı
    println( arr1.size )

    // single item
    // index -> 0 dan başlar
    println( arr1[0] )
    val index = 3
    if ( arr1.size > index ) {
        println( arr1[index] ) // Index 6 out of bounds for length 5
    }

    // single val change
    arr1[2] = "Diyarbakır";
    println(arr1[2])

    println("======================")
    for ( item in arr1 ) {
        println(item)
    }

    println("======================")
    for( i in 0..arr1.size - 1 step 1 ) {
        println(arr1[i])
    }

    println("======================")
    var sum = 0;
    for( i in 24..100 step 2 ) {
        sum += i
    }
    println("Sum : ${sum}")



}