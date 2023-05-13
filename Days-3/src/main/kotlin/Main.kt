import java.util.*

fun main(args: Array<String>) {

    var data = "Lorem 1 Ipsum, dizgi ve baskı 4 endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir 9 matbaacının bir hurufat numune kitabı oluşturmak üzere 5 bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır."
    var st1 = "Ali"
    var st2 = "Alim"
    // String Fonksiyonları
    // Karakter Katarı

    // String ifadeler bir dizi gibi davranış sergiler
    val size = data.length
    println("Karakter Sayısı : $size")
    println( data[10] )
    var spaceCount = 0
    val numbers = "0123456789"
    var index = 0
    var sum = 0
    for (item in data) {
        if ( item == ' ') {
            spaceCount += 1
        }
        for (i in numbers) {
            if ( item == i ) {
                println("Sayı : $i - index : $index")
                sum += i.toString().toInt()
            }
        }
        index += 1
    }
    println("Sum : $sum")
    println("spaceCount: $spaceCount")
    println('a'.toInt())


    // İki adet string ifadenin kıyaslanmasını sağlar
    val compareNumber = st1.compareTo(st2)
    println("compareNumber : $compareNumber")

    // Bir string ifadenin içinde farklı bir string ifade varmı
    val statusContains = data.contains("isin")
    println(statusContains)

    // Bir string ifadenin kaçıncı index'te olduğunu bulur.
    val findIndex = data.indexOf("isin")
    println("findIndex: $findIndex")

    // Bir string ifadenin içindeki kelimeleri bulma
    val words =  data.split(" ")
    for( item in words ) {
        println(item)
    }
    val wordCount = words.count()
    println("Total Word Count : $wordCount")

    // String ifadenin belirli sayıda bölümünü almak
    // 1. parametre -> karakterin başlangıç indexi
    // 2. parametre -> Üzerinde işlem yapılacak toplam karakter sayısı
    // kural -> 2.parametre 1.parametreden büyük olmalıdır.
    val subString = data.substring(15, 20)
    data.substring(data.length - 15, data.length)
    println("subString : $subString")

    // String ifadedeki tüm karakterleri büyük harf yap
    // üğişçöÜĞİŞÇÖ
    val stUpperCase = data.uppercase(Locale.forLanguageTag("tr-TR"))
    println("UpperCase : $stUpperCase")

    // tring ifadedeki tüm karakterleri küçük harf yap
    val stLowerCase = data.lowercase(Locale.forLanguageTag("tr-TR"))
    println("LowerCase : $stLowerCase")

    // Bir string ifadenin içinde bir farklı string ifadeyi bulduktan sonra değiştirir
    var stReplace = data.replace("Lorem", "Ali")
    println(stReplace)

}