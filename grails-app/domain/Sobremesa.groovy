class Sobremesa  extends  Produto{


    Integer calorias;

    static constraints = {
        calorias min: 1
    }

    static mapWith = "mongo"

    static mapping = {
        discriminator value: "SOBREMESA"
    }
}
