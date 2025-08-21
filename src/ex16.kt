fun main() {
    println("===== Calculo de salario no mes =====")
    print("Dias trabalhados este mes: ")
    val dias = readln().toInt()
    val horasTrabalhadas = dias * 8
    val salario = horasTrabalhadas * 25

    println("Este mes seu salario é de R$ $salario")

}