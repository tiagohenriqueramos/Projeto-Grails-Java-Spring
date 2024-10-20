class Pedido {

    Date dataHora;
    Double valorTotal
    Estoque estoque;
    Cliente cliente // Um pedido pertence a um cliente

    static hasMany = [itens: ItemPedido] // Um pedido pode ter vários itens
    static constraints = {
        valorTotal min: Double.valueOf(0.0)
        cliente nullable: false
    }
    static mapWith = "mongo"

}
