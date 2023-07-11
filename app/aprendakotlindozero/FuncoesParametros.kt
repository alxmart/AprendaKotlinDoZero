package com.luizafmartinez.aprendakotlindozero

fun somar( num1: Int, num2: Int = 0, num3: Int = 0 ){

    println( num1 + num2 + num3 )
}

fun main() {

    somar(10, num3 = 10)

    somar(num2 = 10, num1 = 5 )

}