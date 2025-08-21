fun main() {
    println("===== Sucessor e Antecessor =====")
    print("Digite um numero: ")
    val numero = readln().toInt()
    println("O antecessor de $numero é ${numero - 1}.")
    println("O sucessor de $numero é ${numero + 1}.")
}