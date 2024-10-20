class Cliente {

    String nome;
    String email;
    String senha;
    String cpf;

    List<Pedido> pedidos

    static hasMany = [pedidos: Pedido]

    static constraints = {
        nome nullable: false, blank: false
        email email: true, unique: true
        senha size: 6..10
        cpf validator:{ valor, objeto ->
            (valor.size() == 11)
        }

    }
    static mapWith = "mongo"


}
