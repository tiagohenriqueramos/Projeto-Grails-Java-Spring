class ConsultaController {

    def index() {
        def lista = []

        render(view:"index", model: [lista: lista])
    }

}
