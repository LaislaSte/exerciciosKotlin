fun main(args: Array<String>) {
    //Receba uma quantidade de um alimento em quilos. Calcule e mostre quantos
    // dias durará esse alimento para uma pessoa que consome 50 gramas/dia.
    println("insira a quantidade de alimentos em quilos: "+"\n")
    var kl:Double = readLine()!!.toDouble()
    var dias:Int = ((kl * 1000) / 50).toInt()
    println("dias levados para consumir essa quantidade: $dias")

}