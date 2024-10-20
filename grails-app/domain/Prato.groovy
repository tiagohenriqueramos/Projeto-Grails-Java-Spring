class Prato extends Produto {

    Integer quantidadePessoas;
    static constraints = {
        quantidadePessoas min: 1
    }
    static mapWith = "mongo"

    static mapping = {
        discriminator value: "PRATO"
    }
}
