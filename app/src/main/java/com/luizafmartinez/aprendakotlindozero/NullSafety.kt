package com.luizafmartinez.aprendakotlindozero

class Carro {

    var cor = "Vermelho"
    fun acelerar() {
        //
    }
}

fun main() {

  var carro: Carro? = null
  // ** Instanciando Carro
  //carro = Carro()
 /* if ( carro != null ) {
      println(carro.cor)
  }*/

  val cor = carro?.cor ?: "cor padrão"

  //println(carro?.cor)
  println(cor)

}