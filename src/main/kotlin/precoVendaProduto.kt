//16. Receber o preço atual e a venda mensal de um produto.
//Calcular e mostrar o novo preço segundo:
//Se a venda mensal < 500 e o preço atual < R$ 30,00 sofre aumento de 10 %
//Se a venda mensal = 500 e <1000, sofre aumento se 15%.

fun main(args: Array<String>) {
    println("insira o preço atual do produto:")
    var pa = 0.0
    println("isira a venda mensal desse produto:")
    var vm = 0
    if (vm < 500 && pa < 30.00){
        pa += (pa * 10/100)
        print("novo preço atual: $pa")
    }
    if (vm == 500 && vm < 1000){
        pa += (pa * 15/100)
        print("novo preço atual: $pa")
    }
}