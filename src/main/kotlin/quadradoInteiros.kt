//18. Calcule e mostre o quadrado dos números inteiros compreendidos entre 10 e 150.
import kotlin.math.sqrt
fun main(args: Array<String>) {
    var c = 10..100
    var contador = 0
    for (contador in c){
        var e = contador.toDouble()
        e = sqrt(e)
        println(e)
    }
}
