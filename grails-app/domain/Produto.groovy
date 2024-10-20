class Produto {
    String nome
    Double preco
    Estoque estoque;

    static hasMany = [clientes: Cliente, itens: ItemPedido]

    static mapWith = "mongo"

    static constraints = {
        nome blank: false, nullable: false
        preco nullable: false, min:Double.valueOf(0.0)
    }
    static mapping = {
        discriminator column: "tipo", value: "GERAL"
        estoque column: "id_estoque"
        clientes joinTable: [name: "preferencias_clientes", key: "id_produto", column: "id_cliente"]

    }
}

