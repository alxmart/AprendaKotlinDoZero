package com.luizafmartinez.aprendakotlindozero

import com.luizafmartinez.aprendakotlindozero.Usuario3.Companion.verificarUsuarioLogado

class Carro2(
    var modelo: String = "",
    var velocidade: Int = 0
) {
    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120

        fun exibirMensagemVelocidadeMaxima() {
          println("Veloc.Máxima Permitida: ${Carro2.VELOCIDADE_MAX_PERMITIDA}")
        }
    }

    fun exibirInformacoes(){
        println("Informações: $modelo e $velocidade")
    }
}
//=======================================================================

class Usuario3 {

    // Comapnion object Nomeado (nome= regras)
    //companion object regras {

    companion object {
        fun verificarUsuarioLogado(): Boolean {
            // Verificação
            return true
        }
    }
}

fun main() {

    // Companion object nomeado (regras)
    //val retorno = Usuario3.regras.verificarUsuarioLogado()

    val retorno = Usuario3.verificarUsuarioLogado()
    println("Usuario logado: $retorno")

    /*Carro2.exibirMensagemVelocidadeMaxima()

    var fusca = Carro2("Fusca",100)
    fusca.exibirInformacoes()

    var ferrari = Carro2("Ferrari",200)
    ferrari.exibirInformacoes()

    println("PI: ${Math.PI}")*/

}

//=================================================
//    JAVA JAVA JAVA
//=====================================================

/*

class Usuario4 {

    final static int QUANTIDADE_CONEXOES_SIMULTANEAS = 2;

    static boolean verificarUsuarioLogado() {
        //Verificação
        return true;
    }
}

class Companion_object {

    public static void main(String[] args) {

        boolean retorno = Usuario4.verificarUsuarioLogado();

        int qtd = Usuario4.QUANTIDADE_CONEXOES_SIMULTANEAS;

        System.out.println("Usuario logado:" + retorno);

        System.out.println("Qtd conexões:" + qtd);
    }
}
*/
