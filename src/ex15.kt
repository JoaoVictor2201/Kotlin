fun main() {
    println("===== Orçamento de Aluguel de carro =====")
    print("Distancia em km que o carro percorreu: ")
    val km = readln().toFloat()
    print("Dias usados: ")
    val dias = readln().toFloat()

    val valorKm = km * 0.20
    val valorDias = dias * 90

    println("Valor de distancia: $valorKm")
    println("O valor de dia: $valorDias")
    println("Valor total: ${valorKm * valorDias}")
}