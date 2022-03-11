
fun main(args: Array<String>) {
    println("Insira os valores dos lados de um triangulo A, B e C respectivamente")
    var A: Int = readLine()!!.toInt()
    var B: Int = readLine()!!.toInt()
    var C: Int = readLine()!!.toInt()

    if (A < B+C && B < A+C && C < A+B){
        if (A == B && B == C){
            print("triangulo equilatero")
        }else if (A == B || A == C || B == C){
            print("triangulo isósceles")
        }else {
            print("triangulo escaleno")
        }
    }else{
        print("os valores dos lados não caracterizam um triangulo")
    }
}