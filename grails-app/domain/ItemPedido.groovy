class ItemPedido {

    Integer quantidade;
    Double valorVendido;
    String observacao;

    Produto produto;
    Pedido pedido;

    static belongsTo = [pedido: Pedido]
    static constraints = {
        quantidade  min: 0
        valorVendido min: Double.valueOf(0.0)
        observacao nullable: true, blank: true
    }

    static mapping = {
        produto column: "id_produto"
        pedido column:  "id_pedido"
    }

    static mapWith = "mongo"

}
