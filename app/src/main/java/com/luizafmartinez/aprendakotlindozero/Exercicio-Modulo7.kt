package com.luizafmartinez.aprendakotlindozero

class ContaBancaria (
    var agencia: String = "",
    var conta: String = "",
    var senha: String = "",
) {
    var usuarioAutenticado: Boolean = false
    var saldo: Double = 0.0

    init {
        this.usuarioAutenticado = true
    }

    fun recuperarSaldo(): Double {
        if (usuarioAutenticado) {
            return this.saldo
        } else {
            return 0.0
        }
    }

    fun depositar(valor:Double) {
        this.saldo += valor
        println("Realizado deposito no valor de R$ $valor")
    }

    fun sacar(valor: Double) {
        if(valor > this.saldo) {
            println("Atenção: Conta entrou no cheque especial !")
        }
        this.saldo -= valor
        println("Realizado saque no valor de R$ $valor")
    }

    fun extrato(dias: Int) {
       println("Extrato dos últimos $dias dias:")
    }

    fun extrato(dataInicial: String, dataFinal: String ) {
       println("Extrato no intervalo: $dataInicial e $dataFinal:")
    }

}

fun main() {

    var conta = ContaBancaria(agencia = "890", conta = "10158", senha = "abc123")

    var saldorecuperado = conta.recuperarSaldo()
    println("Conta: ${conta.conta}, Agência: ${conta.agencia}")
    println("==========================")

    println("Saldo: $saldorecuperado")

    conta.depositar(200.00)
    conta.sacar(500.00)

    saldorecuperado = conta.recuperarSaldo()
    println("Saldo: $saldorecuperado")

    conta.extrato(5)

    conta.extrato("10/05/22","10/06/22")
}

