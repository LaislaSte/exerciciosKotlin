//13.Receber 3 coeficientes A, B, C de uma equação da forma Ax²+Bx+c=0,
// verifique a existência de raízes e caso exista, calcule e mostre.
fun main(args: Array<String>) {
    var a:Double = readLine()!!.toDouble()
    var b:Double = readLine()!!.toDouble()
    var c:Double = readLine()!!.toDouble()
    var delta:Double = 0.0
    var x1:Double = 0.0
    var x2:Double = 0.0

    delta = (b*b)+(-4 * (a * c))

    fun sqrt(delta:Double): Double{
        return delta
    }

    x1 = -b + sqrt(delta)/ 2 * a
    x2 = -b - sqrt(delta)/ 2 * a

    println("X1: "+ x1 + " X2: "+ x2 )

}

