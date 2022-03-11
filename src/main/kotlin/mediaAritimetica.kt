fun main(args: Array<String>) {
    // Ler 4 notas de um aluno. Calcule e exiba a média aritmética e a descrição:
    // MD >= 6 -> "Aprovado"; MD < 3 -> "Retido"; MD >= 3 e < 6 -> "Exame" .
    println("insira 4 notas do aluno em seguida: "+"\n")
    var a:Float = readLine()!!.toFloat()
    var b:Float = readLine()!!.toFloat()
    var c:Float = readLine()!!.toFloat()
    var d:Float = readLine()!!.toFloat()

    var media:Float = (a+b+c+d)/4
    println("A media aritimetica do aluno é: $media"+"\n")
    if (media >=6){
        println("Aprovado")
    }
    if(media < 3){
        println("Retido")
    }
    if (media >=3 && media < 6){
        println("Exame")
    }
}