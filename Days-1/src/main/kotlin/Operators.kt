fun main(args: Array<String>) {

    // Matematik Operatörleri
    val num1 = 30.0
    val num2 = 17.0

    var end:Double = num1 + num2
    println(end)

    end = num1 - num2
    println(end)

    end = num1 * num2
    println(end)

    end = num1 / num2
    println(end)

    end = num1 % num2
    println(end)

    // Mantıksal Operatörler
    // Boolean veri türünü geriye dönderirler
    // Eşitmi ==
    var oper = num1 == num2
    println(oper)

    // soldaki değer sağdaki değerden büyük mü
    oper = num1 > num2
    println(oper)

    // sağdaki değer soldaki değerden büyük mü
    oper = num1 < num2
    println(oper)

    // Eşit değil
    oper = num1 != num2
    println(oper)
}