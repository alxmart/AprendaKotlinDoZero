package com.luizafmartinez.aprendakotlindozero

interface Presidenciavel {
  fun candidatarSe()
}

abstract class Pessoa {
    fun comer() = println("Comer...")
}

class DesenvolvedorAndroid : Pessoa() {
    fun programar() = println("Programar")
}

class DesenvolvedorWeb : Pessoa() {
    fun programar() = println("Programar")
}

class Jornalista : Pessoa(), Presidenciavel {

    fun escreverNoticia() = println("Escrever Notícia")

    override fun candidatarSe() {
        println("Fazer o processo para se candidatar.")
    }
}

class FuncionarioPublico : Pessoa() {
}

fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()
    println("-----------------------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe()
    println("-----------------------")

}