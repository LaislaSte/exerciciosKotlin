//11. Efetuar a leitura de 5 números e identificar e mostrar o maior e o menor valor do grupo.
fun main(args: Array<String>) {
    var A: Int = readLine()!!.toInt()
    var B: Int = readLine()!!.toInt()
    var C: Int = readLine()!!.toInt()
    var D: Int = readLine()!!.toInt()
    var E: Int = readLine()!!.toInt()

    if (A > B && A > C && A > D && A > E){
        print("maior numero: $A")
    }
    if (B > A && B > C && B > D && B > E){
        print("maior numero: $B")
    }
    if (C > A && C > B && C > D && C > E){
        print("maior numero: $C")
    }
    if (D > A && D > B && D > C && D > E){
        print("maior numero: $D")
    }
    if (E > A && E > B && E > C && E > D){
        print("maior numero: $E")
    }

    if (A < B && A < C && A < D && A < E){
        print("menor numero: $A")
    }
    if (B < A && B < C && B < D && B < E){
        print("menor numero: $B")
    }
    if (C < A && C < B && C < D && C < E){
        print("menor numero: $C")
    }
    if (D < A && D < B && D < C && D < E){
        print("menor numero: $D")
    }
    if (E < A && E < B && E < C && E < D){
        print("menor numero: $E")
    }
}