fun main(args:Array<String>) {
    //Receba o salário bruto de um funcionário: Calcule e mostre o salário líquido
    // sabendo que ele recebe 10% de gratificação sobre o salário bruto, mas paga 20% de imposto de renda.
    println("Insira o salario bruto do funcionario: "+"\n")
    var sb:Double = readLine()!!.toDouble()
    sb += (sb * 10/100)
    print("salario gratificado do funcionario $sb"+"\n")
    var sl:Double = sb - (sb * 20/100)
    print("salario liquido do funcionario $sl")
}