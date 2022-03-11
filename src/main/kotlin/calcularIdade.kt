//15. Receba data de nascimento de uma pessoa (AA) sem século.
//Calcular a sua idade atual. Considere que não haja idade >70
fun main(args: Array<String>) {
    println("insira seu ano de nascimento:")
    var ano:Int = readLine()!!.toInt()
    println("insira o ano atual:")
    var anoAtual:Int = readLine()!!.toInt()

    var idade:Int = anoAtual - ano
    if (idade < 70){
        println(idade)
    }else{

    }
}
