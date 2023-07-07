package com.luizafmartinez.aprendakotlindozero
class Carro {
    var cor = "Vermelho"
    fun acelerar() {
    //
    }
}
fun main() {

    var carro: Carro? = null

    //carro = Carro() // ** Instanciando Carro

    //println(carro.cor)

    // println(carro?.cor)

    val cor = carro?.cor ?: "cor padrão"
    println(cor)

//  if ( carro != null ) {
//      println(carro.cor)
//  }

//
//  val cor = carro?.cor ?: "cor padrão"
//
//  //println(carro?.cor)
//  println(cor)

}