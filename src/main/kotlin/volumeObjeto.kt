fun main(args: Array<String>){
    println("digite a altura do objeto "+"\n")
    var h:Double = readLine()!!.toDouble()
    println("digite o raio do objeto "+"\n")
    var r:Double = readLine()!!.toDouble()
    val v = 3.14 * r - 2 * h
    println("volume, $v metros")
}