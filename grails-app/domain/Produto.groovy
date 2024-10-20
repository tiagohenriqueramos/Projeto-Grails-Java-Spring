import org.bson.types.ObjectId

class Produto {
    String nome
    Double preco

    static mapWith = "mongo"

    static constraints = {
        nome blank: false, nullable: false
        preco nullable: false, min:Double.valueOf(0.0)

    }


}

