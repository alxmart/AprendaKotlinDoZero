package com.luizafmartinez.aprendakotlindozero

abstract class Animal3 {    // Classe Pai, super classe, classe abstrata

    var cor = ""
    var tamanho = "" // pequeno , medio , grande porte
    var peso = 0.0

    open fun correr() {   // "Por padrão, todo método é final"
        print("Correr como um")
    }

    abstract fun dormir()

}

class Cao3 : Animal3() {   // Subclasse ou classe filha, CONCRETA

    //fun latir() = println("Latir...")
    fun latir() {
        println("Latir...")
    }

    override fun correr() {   // Polimorfismo de sobreposicao
        super.correr()
        println(" cão de 4 patas")
        /*
          * Várias linhas de código
        */
    }

    override fun dormir() {
        println("Dormir como um cão.")
    }


}

class Passaro2: Animal3() {  // Subclasse ou classe filha de Animal
    //fun voar() = println("Voar...")
    fun voar() {
        println("Voar...")
    }
    override fun correr() {   // Polimorfismo de sobreposição
        super.correr()
        println(" pássaro de 2 pernas")
    }

    override fun dormir() {
        println("Dormir como um pássaro")
    }
}

fun main() {

    val cao3 = Cao3()
    cao3.correr()
    cao3.dormir()



//    val cao = Cao()
//    cao.correr()
//    //cao.latir()
//
//    val passaro = Passaro()
//    passaro.correr()
//    //passaro.voar()
}

