fun main(args: Array<String>) {

    // Nesene üretim işlemi
    val objAction = Action();
    // Sınıf içindeki özelliklere (.) nokta operatörü ile geçiş sağlanır.
    println( objAction.age )

    objAction.sum(30, 60);
    objAction.sum(45, 66);
    objAction.sum(23, 54);
    val size:Int = objAction.size("Hello Kotlin")

    // 1.params Name, 2. params Surname
    // örn: Ali, Bilmem
    // Sn. Ali Bilmem
    val joinString  = objAction.getNameJoinSurname("Ali", "Bilmem")
    println(joinString)

}