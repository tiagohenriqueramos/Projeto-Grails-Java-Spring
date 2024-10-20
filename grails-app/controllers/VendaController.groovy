import grails.converters.JSON

class VendaController {

    def vendaService

    def index() {
        def produtos = Produto.list()
        render(model: [produtos: produtos], view: "index")
    }

    def salvar(){
        def produto = params.produto
        def quantidade = params.quantidade

        def mensagem = [:]
        try {
            vendaService.salvar(params.nome, params.email, params.produto.toList(), params.quantidade.toList())
            mensagem += ["resposta":"OK"]
        }catch(Exception excecao){
            mensagem += ["resposta":excecao.message]
        }
        render mensagem as JSON
    }
}