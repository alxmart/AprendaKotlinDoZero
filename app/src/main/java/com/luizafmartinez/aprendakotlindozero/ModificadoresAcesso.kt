package com.luizafmartinez.aprendakotlindozero

open class Carrox {
   //var modelo = ""
   fun acelerar() {
        injetarCombustivel()
        println("Acelerar o carro")
    }
    protected open fun injetarCombustivel() {
        println("Injeção do combustível")
    }
}
class Gol : Carrox() {
    override fun injetarCombustivel() {
        super.injetarCombustivel()
    }
}
class Ferrari : Carrox() {
}
fun main() {
//    var carro = Carrox()
//    carro.acelerar()
    val gol = Gol()
    gol.acelerar()
}