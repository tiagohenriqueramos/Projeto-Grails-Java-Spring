class Bebida extends  Produto{

    Double liquido;
    String unidade;

    static constraints = {
    liquido min: Double.valueOf(0.0)
        unidade nullable: false, blank: false, inList: ["L", "ml"]
    }
    static mapWith = "mongo"

    static mapping = {
        discriminator value: "BEBIDA"
    }

}
