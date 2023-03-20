package com.luizafmartinez.aprendakotlindozero

class Usuariox {

    //propriedades

    fun logar(email:String, senha: String) {
        // Assinatura do método: Nome + Parâmetros e seus tipos
        println("Usuario logado com email: $email e senha: $senha")
    }

    //Sobrecarga
    fun logar(numeroTelefone: String) {
        println("Usuario logado com telefone: $numeroTelefone")
    }

}

fun main() {

    val usuario = Usuariox()

    usuario.logar("homer@springfield.com","GoIsotopes")

    usuario.logar("+55 19 988887777")

}