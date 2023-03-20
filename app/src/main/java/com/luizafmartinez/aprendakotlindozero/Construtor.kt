package com.luizafmartinez.aprendakotlindozero

class Usuario2 ( // Construtor Primário
    var nome: String = "",
    var sobrenome: String = ""
) {
    init {
        println("Objeto inicializado.")
        println("Nome: $nome Sobrenome: $sobrenome")
    }
    constructor(nome: String): this(nome, "") { // Construtor Secundário
        println("Construtor Secundário")
    }
}

fun main() {
    var usuario2 = Usuario2( "Homer")
}