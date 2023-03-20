package com.luizafmartinez.aprendakotlindozero


open class Animal2 {      //"Toda classe em kotlin é final"

    var cor = ""
    var tamanho = "" // pequeno , medio , grande porte
    var peso = 0.0

    //Metodo ("Função dentro de uma classe é um método")
    //fun correr() = println("Correr")

    open fun correr() {   // "Por padrão, todo método é final"
        print("Correr como um")
    }

    //fun dormir() = println("Correr")

    open fun dormir() {   // "Por padrão, todo método é final"
        println("Dormir...")
    }
}

class Cao2 : Animal2() {   // Subclasse ou classe filha de Animal

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
}

class Passaro2: Animal2() {  // Subclasse ou classe filha de Animal
    //fun voar() = println("Voar...")
    fun voar() {
        println("Voar...")
    }
    override fun correr() {   // Polimorfismo de sobreposição
        super.correr()
        println(" pássaro de 2 pernas")
    }
}

fun main() {

    val cao = Cao()
    cao.correr()
    //cao.latir()

    val passaro = Passaro()
    passaro.correr()
    //passaro.voar()
}

