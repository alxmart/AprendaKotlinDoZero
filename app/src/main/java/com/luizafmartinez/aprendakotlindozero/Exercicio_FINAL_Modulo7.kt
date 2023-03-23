package com.luizafmartinez.aprendakotlindozero

abstract class Veiculo (
    nome: String = "",
    qtdRodas: Int = 0
    ) {

    abstract fun acelerar()
}

class Carro3(nome: String, qtdRodas: Int) : Veiculo() {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas

    override fun acelerar() {

        println("Acelerar $nome com $qtdRodas rodas")
    }
}

class Moto(nome: String, qtdRodas: Int) : Veiculo() {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas

    override fun acelerar() {

        println("Acelerar $nome com $qtdRodas rodas")
    }
}

fun main() {

    val carrao = Carro3("Fusca",4)
    println("Nome: ${carrao.nome}")
    println("Quantidade de Rodas: ${carrao.qtdRodas}")
    carrao.acelerar()
    println()

    val motao = Moto("Yamaha",2)
    println("Nome: ${motao.nome}")
    println("Quantidade de Rodas: ${motao.qtdRodas}")
    motao.acelerar()



}
