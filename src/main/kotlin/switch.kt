fun main(args: Array<String>){
    fun returnFirst(a:Int ): Int {
    	return a;
    }
    fun returnSecond(b:Int ): Int {
        return b;
    }
    println("Insira um numero inteiro e em seguida mais um: " + "\n")
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    var A = returnFirst(b)
    var B = returnSecond(a)
    println("a: $A b: $B"); // prints a: 3, b: 8
}