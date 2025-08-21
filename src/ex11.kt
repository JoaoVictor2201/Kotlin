fun main() {
    println("===== Orçamento de Tinta =====")
    print("Largura da parede: ")
    val largura = readln().toFloat()
    print("Altura da parede: ")
    val altura = readln().toFloat()

    val areaTotal = calcularArea(largura, altura)

    print("Para esta pintura vai precisar de ${areaTotal / 2} lata(s) de tinta")
}

fun calcularArea(largura: Float, altura: Float): Float {
    return largura * altura
}