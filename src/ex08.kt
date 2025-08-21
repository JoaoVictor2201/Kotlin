fun main() {
    println("===== Dobro e terça parte =====")
    print("Digite um numero Real qualquer: ")
    val num = readln().toDouble()
    println("O dobro de $num é ${num * 2}")
    val tercaParte = num / 3
    print("A terça parte de $num é ${"%.5f".format(tercaParte)}")
}