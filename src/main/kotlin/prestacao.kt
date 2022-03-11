fun main(args: Array<String>) {
    var valor:Double = 0.0
    var taxa:Double = 0.0
    println("insira o valor da prestação: "+ "\n")
    valor = readLine()!!.toDouble()
    println("insira a taxa de atraso: "+ "\n")
    taxa = readLine()!!.toDouble()
    var prestacao:Double = valor + (valor * taxa / 100.0)
    println("valor da prestação: $prestacao")
}