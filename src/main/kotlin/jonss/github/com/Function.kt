package jonss.github.com

class Function {

    fun aFunction(): Unit {
        println("A function")
    }

    fun bFunction() {
        println("B function")
    }

    fun cFunction() = println("C Function")

    // Internally is a val
    fun aSum(a: Int,b: Int): Int {
        return a + b;
    }

    fun bSum(a: Int, b: Int) = a + b

}