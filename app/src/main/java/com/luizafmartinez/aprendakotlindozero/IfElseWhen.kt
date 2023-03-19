package com.luizafmartinez.aprendakotlindozero

fun main() {

//    val notaAluno = 7
//    val condicao = notaAluno >= 6
//
//    if (condicao) {
//        println("Aprovado")
//    } else {
//        println("Reprovado")
//    }


//    val opcao = 2
//    if ( opcao == 1 ){
//        println("Cartão de crédito")
//    }else if( opcao == 2 ){
//        println("Extrato bancário")
//    }else if( opcao == 3 ){
//        println("Saldo")
//    }else{
//        println("Nenhuma opção selecionada")
//    }


//    val opcao = 2
//    if ( opcao in 1..3 ){
//        println("opções selecionadas: 1, 2 3")
//    }else if( opcao in 4..8 ){
//        println("opções selecionadas: 4 até 8")
//    }


    val opcao = 2
    //println("Cartão de crédito")
    //println("Extrato bancário")
    //println("Saldo")
    when( opcao ){
        1 -> println("Cartão de crédito")
        2 -> println("Extrato bancário")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionada")
    }

}