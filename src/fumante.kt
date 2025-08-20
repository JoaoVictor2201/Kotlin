fun main() {
    println("Quantos cigarros a pessoa fuma por dia?")
    val cigas = readln().toInt()
    println("Há quantos anos ela fuma?")
    val quantosAnos = readln().toInt()
    val vidaPerdida = fumando(cigas, quantosAnos)
    println("A pessoa perdeu $vidaPerdida dias de vida")
}

fun fumando(cigas: Int, quantosAnos: Int): Int {
    val totalCigas = cigas * (quantosAnos * 365)
    val vidaPerdidaMinutos = totalCigas * 10
    val vidaPerdidaDias = vidaPerdidaMinutos / 1440

    return vidaPerdidaDias
}