fun main() {
    println("====== Somador de Números =====")
    print("Digite um numero: ")
    var num1 = readln().toInt()
    print("Digite outro numero: ")
    var num2 = readln().toInt()
    println("A soma de $num1 e $num2 é igual a ${soma(num1, num2)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b
}