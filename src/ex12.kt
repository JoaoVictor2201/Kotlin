fun main() {
    println("===== Calculo do valor de Delta =====")
    print("Valor de A: ")
    val a = readln().toFloat()
    print("Valor de B: ")
    val b = readln().toFloat()
    print("O valor de C: ")
    val c = readln().toFloat()

    val delta = calculaDelta(a, b, c)
    println("O valor de Delta é $delta")
}

fun calculaDelta(a: Float, b: Float, c: Float): Float {
    val delta = b * b - (4 * a * c)
    return delta
}