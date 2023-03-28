package com.luizafmartinez.aprendakotlindozero

import com.luizafmartinez.aprendakotlindozero.Carro3.Companion.exibeMensagemVelocidadeMaximaLei

enum class StatusVeiculo {
    FUNCIONAMENTO,
    MANUTENCAO,
    QUEBRADO
}

interface Eletrificado {
    fun motorEletrico() {
        println("Rodando com motor elétrico.")
    }
}

abstract class Veiculo (
    nome: String = "",
    qtdRodas: Int = 0,
    status: String = ""
    ) {
    abstract fun acelerar()

    open fun acelerar(intensidade: Int) {
        println("Intensidade da aceleração: $intensidade")
    }

    abstract fun recuperarStatus()
}

class Carro3(
    nome: String,
    qtdRodas: Int,
    statusVeiculo: StatusVeiculo = StatusVeiculo.FUNCIONAMENTO
) : Veiculo() {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas
    var status: StatusVeiculo = statusVeiculo

    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas.")
        acelerar(3)
    }
    override fun recuperarStatus()  {
        status = StatusVeiculo.MANUTENCAO
        println("O status do veículo é: $status")
    }

    companion object {
        fun exibeMensagemVelocidadeMaximaLei(velmax: Int) {
            println("Velocidade Máxima permitida por Lei é de: $velmax Km/h")
        }
    }

}

class Moto(
    nome: String,
    qtdRodas: Int,
    statusVeiculo: StatusVeiculo = StatusVeiculo.FUNCIONAMENTO
) : Veiculo(), Eletrificado {

    var nome: String = nome
    var qtdRodas: Int = qtdRodas
    var status: StatusVeiculo = statusVeiculo

    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas.")
        motorEletrico()
        acelerar(5)
    }

    override fun recuperarStatus()  {
        status = StatusVeiculo.MANUTENCAO
        println("O status do veículo é: $status")
    }

    companion object {
        fun exibeMensagemVelocidadeMaximaLei(velmax: Int) {
            println("Velocidade Máxima permitida por Lei é de: $velmax Km/h")
        }
    }

}

fun main() {

    Carro3.exibeMensagemVelocidadeMaximaLei(120)
    val carrao = Carro3("Lincoln Navigator",4)
    carrao.acelerar()
    carrao.recuperarStatus()
    println("--------------------------------------------------")

    Moto.exibeMensagemVelocidadeMaximaLei(120)
    val motao = Moto("Harley Davidson LiveWire ONE",2)
    motao.acelerar()
    motao.recuperarStatus()

}
