fun main() {
    println("===== Aumento de Salário =====")
    print("Qual o salário atual R$ : ")
    val salario = readln().toFloat()

    println("O salario com aumento de 15% fica R$ ${salario * 1.15}")
}