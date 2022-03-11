//14.Receba os valores da altura e sexo (1- Feminino e 2- Masculino) de uma pessoa.
//Calcule e mostre o peso ideal utilizando a regra:
//Homens (72,7 * Altura) – 58;
//Mulheres (62,1 * Altura) – 47.
fun main() {
    println("insira sua altura")
    var altura:Double = readLine()!!.toDouble()
    println("insira seu sexo (1- Feminino 2- Masculino)")
    var sexo:Int = readLine()!!.toInt()
    if (sexo == 1){
        var pm:Double = (62.1 * altura) - 47
        print("Peso ideal feminino é: $pm")
    }else {
        var ph: Double = (72.7 * altura) - 58
        print("peso ideal masculino é: $ph")
    }

}