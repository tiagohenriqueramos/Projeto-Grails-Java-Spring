class ProdutoController {

    def index() {
        def lista = Produto.list()
        render(view: "/produto/index", model: [produtos: lista])
    }

    def adicionar() {

        Produto novoProduto = new Produto()
        novoProduto.preco = 0
        novoProduto.estoque = new Estoque()
        novoProduto.estoque.quantidade = 0
        novoProduto.estoque.quantidadeMinima = 0
        render(template: "/produto/form", model: [produtos: novoProduto])

    }

    def alterar() {
        Produto produto = Produto.get(params.id)
        render(template: "/produto/form", model: [produtos: produto])
    }

    def lista() {
        def lista = Produto.list()
        render(template: "/produto/lista", model: [produtos: lista])
    }

    def salvar() {
        Produto produto = params.id ? Produto.get(params.id) : new Produto(estoque: new Estoque())
        produto.nome = params.nome
        produto.preco = params.preco.toDouble()
        if (!produto.estoque) {
            produto.estoque = new Estoque()
        }
        produto.estoque.quantidade = params.quantidade.toInteger()
        produto.estoque.quantidadeMinima = params.quantidadeMinima.toInteger()

        produto.validate()
        if (produto.hasErrors()) {
            render("Deu ruim")
        } else {
            produto.save(flash: true)
            render("Salvou com sucesso")
        }
    }

    def excluir() {
        Produto produto = Produto.get(params.id)
        produto.delete(flash: true)
        def lista = Produto.list()
        render(template: "/produto/lista", model: [produtos: lista])
    }
}
