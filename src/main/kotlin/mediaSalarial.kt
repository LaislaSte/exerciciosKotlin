//17. Calcule a média de salários para um grupo de 2000 funcionários e exiba:
//- salário bruto;
//- salário líquido;
//- respectivo desconto.
//O desconto deverá ser feito a partir dos seguintes critérios:
//Salário Desconto
//<= 300 0%
//> 300 e <= 800 5%
//> 900 e <= 1200 10%
//> 1200 15%

fun main(args: Array<String>) {
    var nf = 0

    while (nf < 2000){
        var sb:Double = readLine()!!.toDouble()
    println("salário bruto: $sb")
    if (sb < 300){
        println("salario bruto: $sb")
    }
    if (sb > 300 && sb <= 800){
        sb -= (sb * 5/100)
        println("salario liquido: $sb desconto de 5%")
    }
    if (sb > 900 && sb <= 1200){
        sb -= (sb * 10/100)
        println("salario liquido: $sb desconto de 10%")
    }
    if (sb > 1200){
        sb -= (sb * 15/100)
        println("salario liquido: $sb desconto de 15%")
    }
        nf++
    }
}