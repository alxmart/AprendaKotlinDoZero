package com.luizafmartinez.aprendakotlindozero

fun main() {

    val n1 = 10
    val n2 = 20

    //val resultado = n1 + n2

    //val resultado = 2 + 2 * 2 //6

    val resultado = (2 + 2) * 2 //8
    println(resultado)

    val resultado2 = 2 > 5
    println(resultado2) // false

    val resultado3 = 21 > 5
    println(resultado3) // true

    val resultado4 = 2 == 5
    println(resultado4) // false

    val resultado5 = 5 != 5
    println(resultado5) // false

    val resultado6 = 6 >= 5
    println(resultado6) // true

    val resultado7 = true && false
    println(resultado7) // false

    val resultado8 = 2 > 1 && 3 == 3
    println(resultado8) // true
    println("Resultado 8 agora é ${!resultado8}") //false

    val idadePessoa = 50
    val comprasPessoa = 500
    val resultado9 = idadePessoa >= 50 && comprasPessoa >= 400
    println(resultado9)


}