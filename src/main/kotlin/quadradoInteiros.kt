//18. Calcule e mostre o quadrado dos números inteiros compreendidos entre 10 e 150.
import kotlin.math.sqrt
fun main(args: Array<String>) {
    var c = [10..100]
    var contador:Int = 0
    var i = 0.0
    while (contador > 10 && contador < 150){
        i = sqrt(i)
        println(i)
        contador++
    }
}