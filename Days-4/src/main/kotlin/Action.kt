class Action {

    val age = 30

    // İki sayıyı alarak toplama işlemi yapan bir method
    // kotlinde fonksyionlar fun anahtar kelimesi ile gerçekleşirler
    // her method bir isme sahiptir  ve bu isim benzersiz olmalıdır.
    // Parametre -> bir metHhod'a verilen değerlerdir.
    // return -> bir method çalıştığında ürettiği değeri geri döndermesi için kullanılır.
    fun sum(  val1: Int ,val2: Int  ) : Int {
        val sm = val1 + val2
        println("Sum : $sm")
        return sm
    }

    fun size( data: String ) : Int {
        val sizeChar = data.length
        println("Size : $sizeChar")
        return sizeChar
    }

    /**
     * @param name: String, surname: String -> User Name and Surname
     * @return String -> name and surname join
     * @author Erkan Bilki
     * @throws RuntimeException.class
     * @see 1.8
     */
    fun getNameJoinSurname( name: String, surname: String ) : String {
        val joinStrig = "Sn. $name $surname"
        return joinStrig
    }


}