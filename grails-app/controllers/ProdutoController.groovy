class ProdutoController {

    def index() {
        def lista = Produto.list()
        render(view: "/produto/index", model: [produtos: lista])
    }

    def adicionar() {
        Produto novoProduto = new Produto(nome: "", preco: 0)
        render(template: "/produto/form", model: [produto: new Produto()])
    }

    def alterar() {
        Produto produto = Produto.get(params.id)
        render(template: "/produto/form", model: [produto: produto])
    }

    def lista() {
        def lista = Produto.list()
        render(template: "/produto/lista", model: [produtos: lista])
    }

    def salvar() {
        Produto produto = params.id ? Produto.get(params.id) : new Produto()

        produto.nome = params.nome

        if (params.preco) {
            try {
                produto.preco = params.preco.toDouble()
            } catch (NumberFormatException e) {
                render "O preço deve ser um número válido."
                return
            }
        } else {
            render "O campo 'preco' é obrigatório."
            return
        }

        if (produto.validate() && !produto.hasErrors()) {
            produto.save(flush: true)
            render "Salvou com sucesso"
        } else {
            render "Deu ruim: ${produto.errors.allErrors}"
        }
    }

    def excluir() {
        Produto produto = Produto.get(params.id)
        if (produto) {
            produto.delete(flush: true)
            render "Produto excluído com sucesso"
        } else {
            render "Produto não encontrado"
        }

        def lista = Produto.list()
        render(template: "/produto/lista", model: [produtos: lista])
    }
}
