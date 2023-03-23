package com.luizafmartinez.aprendakotlindozero

interface Eletrificado {

    fun motorEletrico()
}

abstract class Veiculo (
    nome: String = "",
    qtdRodas: Int = 0
    ) {

    abstract fun acelerar()

    open fun acelerar(intensidade: Int) {
        println("Intensidade da aceleração: $intensidade")
    }

}

class Carro3(nome: String, qtdRodas: Int) : Veiculo() {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas

    override fun acelerar() {

        println("Acelerar $nome com $qtdRodas rodas.")
        acelerar(2)
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
        acelerar(4)
    }

}

fun main() {

    val carrao = Carro3("Lincoln Navigator",4)
    //println("Nome: ${carrao.nome}")
    //println("Quantidade de Rodas: ${carrao.qtdRodas}")
    carrao.acelerar()
    //carrao.acelerar(3)

    val motao = Moto("Harley Davidson Ultra Limited",2)
    //println("Nome: ${motao.nome}")
    //println("Quantidade de Rodas: ${motao.qtdRodas}")
    motao.acelerar()
    //motao.acelerar(4)

}
