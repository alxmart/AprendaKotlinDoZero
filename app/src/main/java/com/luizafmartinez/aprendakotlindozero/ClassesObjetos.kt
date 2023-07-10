//Abstração
// Pessoa: cpf, nome, endereço,
// Cachorro: nome, raça, peso, porte,

package com.luizafmartinez.aprendakotlindozero

class Jogador {
    var kart = ""
    var pneu = ""
    var planador = ""
    fun acelerar(aceleracao:Int = 0) {
        println("Acelerar na velocidade $aceleracao")
    }
    fun retornarPoder(): String {
        return "Casco vermelho"
    }
    //  Funcao inline:
    // ----------------------------------------------------
    // fun retornarPoder(): String = "Casco Vermelho"
 }

fun main() {
    val jogador = Jogador()

    //jogador.kart = "Kart do Mario"
    //jogador.pneu = ""
    //jogador.planador = ""

    jogador.acelerar( aceleracao = 80 )

    val poder = jogador.retornarPoder()
    println(poder)
    //println(jogador.kart)
}

