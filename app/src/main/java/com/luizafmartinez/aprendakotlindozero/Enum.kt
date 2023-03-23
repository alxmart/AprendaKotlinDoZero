package com.luizafmartinez.aprendakotlindozero

// aguardando_aprovacao
// pedido_realizado, pagamento_confirmado
// pedido_enviado, pedido_entregue

enum class StatusPedido {
    AGUARDANDO_APROVACAO,  // 0
    PEDIDO_REALIZADO,      // 1
    PAGAMENTO_CONFIRMADO,  // 2
    PEDIDO_ENVIADO,        // 3
    PEDIDO_ENTREGUE        // 4
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
) {

}

fun main() {
    //Tela de Compras
    var pedido = Pedido(125.90,"Camiseta , Livro")

    // Pagamento com Cartão
    //pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    // Transportadora
    //pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    println("Status do pedido: ${StatusPedido.AGUARDANDO_APROVACAO.ordinal}")
    // Saída:  Status do pedido: 3

    // Histórico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO  ) {
        println("O seu pedido foi realizado")
    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {
        println("O seu pagamento foi confirmado")
    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {
        println("O seu pedido foi enviado")
    }


}
