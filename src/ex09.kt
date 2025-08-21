fun main() {
    println("===== Conversor de metros =====")

    print("Informe uma distância em metros: ")
    val metros = readln().toDouble()

    println("${metros * 100} centimetro(s)")
    println("${metros / 1000} quilometro(s)")
    println("${metros * 3.28 } pés")
}