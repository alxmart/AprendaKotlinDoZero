package com.luizafmartinez.aprendakotlindozero

fun main() {

//   val nomes = arrayOf(
//        "Homer", "Lisa", "Bart"
//    )
//
//    nomes[0] = "Moe"
//
//    println( nomes[0] )
//    println( nomes[1] )
//    println( nomes[2] )
//
//
//
//

//    for ( numero in 3..10 ){
//        println( "Executou: $numero" )
//    }


    val postagens = arrayOf(
        "Viagem para a praia",//0
        "Levei meu cachorro no veterinário",//1
        "Trilha com os amigos"//2
    )
    for ( (indice, postagem) in postagens.withIndex() ){
        println("$indice: $postagem")
    }

}