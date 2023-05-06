fun main(args: Array<String>) {

    // username and passwordd valid
    val username = "ali@mail.com"
    val password = "12345"

    // logic gateway
    // Birden fazla koşulun kullanımı
    // &&
    val status = username == "ali@mail.com" && password == "12345"
    println( status )

    // if
    // kararlar vermek bunları işletmek kullanılır.
    if ( status ) {
        println("Login Success")
    }else {
        println("Login Fail")
    }


}