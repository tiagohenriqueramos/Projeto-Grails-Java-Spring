class Estoque {

    Integer quantidade;
    Integer quantidadeMinima;
    Produto produto;

    static belongsTo = [Produto]
    static mapWith = "mongo"

    static constraints = {
        quantidade  min: 0
        quantidadeMinima  min: 0
        produto nullable: false
    }


}
