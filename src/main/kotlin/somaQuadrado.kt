import kotlin.math.sqrt
fun main(args: Array<String>) {
    println("digite 3 valores inteiros seguidos")
    var a:Double = readLine()!!.toDouble()
    var b:Double = readLine()!!.toDouble()
    var c:Double = readLine()!!.toDouble()
    var soma = sqrt(a)+sqrt(b)+sqrt(c)
    println("a soma do quadrado desses numeros é $soma")

}