fun main(args: Array<String>) {
    println("digite um valor de temperatura celsius"+"\n")
    var c:Double = readLine()!!.toDouble()
    val F = (c*9+160)/5
    println("temperatura em farenheit:  $F")

}