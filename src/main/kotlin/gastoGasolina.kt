fun main(args: Array<String>) {

    //3 Efetuar o cálculo e apresentar a quantidade de litros gastos em uma viagem,
    // utilizando um veículo que faz 12 Km/L.
    println("tempo gasto na viagem (horas): "+"\n")
    var tempo:Double = readLine()!!.toDouble()
    println("qual a velocidade media do veiculo(kl/h): "+"\n")
    var vm:Double = readLine()!!.toDouble()
    //calculando distancia percorrida:
    var dp:Double = tempo * vm
    //litros gastos:
    var lg:Double = dp / 12

    println("quantidade de gasolina gasta: $lg litros")
}