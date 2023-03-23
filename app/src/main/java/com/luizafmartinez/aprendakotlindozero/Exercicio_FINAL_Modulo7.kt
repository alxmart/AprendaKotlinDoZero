package com.luizafmartinez.aprendakotlindozero

interface Eletrificado {

    fun motorEletrico()
}

abstract class Veiculo (
    nome: String = "",
    qtdRodas: Int = 0
    ) {

    abstract fun acelerar()

    //abstract fun Eletrificado()
}

class Carro3(nome: String, qtdRodas: Int) : Veiculo() {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas

    override fun acelerar() {

        println("Acelerar $nome com $qtdRodas rodas.")
    }
}

class Moto(nome: String, qtdRodas: Int) : Veiculo(), Eletrificado {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas

    override fun motorEletrico() {
        println("Rodando com motor elétrico.")
    }

    override fun acelerar() {

        println("Acelerar $nome com $qtdRodas rodas.")
        motorEletrico()
    }


}

fun main() {

    val carrao = Carro3("Lincoln Navigator",4)
    //println("Nome: ${carrao.nome}")
    //println("Quantidade de Rodas: ${carrao.qtdRodas}")
    carrao.acelerar()

    val motao = Moto("Harley Davidson Ultra Limited",2)
    //println("Nome: ${motao.nome}")
    //println("Quantidade de Rodas: ${motao.qtdRodas}")
    motao.acelerar()

}
