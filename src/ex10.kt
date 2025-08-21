fun main() {
    println("===== Conversor de Dólar =====")
    print("Informe a quantidade em R$: ")
    val valor = readln().toDouble()

    println("O valor de R$ $valor em dólares é de U$ ${"%.2f".format(valor * 3.45)}")
}