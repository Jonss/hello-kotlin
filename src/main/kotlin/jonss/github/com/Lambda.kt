package jonss.github.com

import kotlin.math.pow

class Lambda {

    // anonymous functions
    val a = { "A" }


    val multBy2: (Int) -> Int = { n -> n * 2 }

    // High Order functions

    fun math(firstNumber: Float, secondNumber: Float,operation: (Float, Float) -> Float ): Float {
        return operation(firstNumber, secondNumber)
    }

    val sum = {a: Float, b: Float ->  a + b}

    val subtract = { firstNumber: Float, secondNumber: Float -> firstNumber - secondNumber }

    val multiply = { firstNumber: Float, secondNumber: Float -> firstNumber * secondNumber }

    val pow: (Float, Float) -> Float = { a, b -> a.pow(b) }

    val div: (Float, Float) -> Float = { a, b -> a / b}
}

fun main() {
    val lambda = Lambda()
    println(lambda.a())
    println(lambda.multBy2(2))
    println("Sum ${lambda.math(4F,2F, lambda.sum)}")
    println("Sub: ${lambda.math(4F,2F, lambda.subtract)}")
    println("Mult: ${lambda.math(4F,2F, lambda.multiply)}")
    println("Pow: ${lambda.math(4F,2F, lambda.pow)}")
    println("Div: ${lambda.math(4F,2F, lambda.div)}")

}