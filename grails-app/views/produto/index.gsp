<!doctype html>
<html>
<head>
    <title><g:if env="development">Gerenciamento de produtos</g:if><g:else>Error</g:else></title>
    <meta name="layout" content="main">
    <g:javascript library="jquery"/>
    <script type="text/javascript">

        function adicionarProduto() {
            $.ajax({
                url: "${createLink(controller: 'produto', action: 'adicionar')}",
                success: function (data) {
                    $("#divLista").html(data);
                },
                error: function (xhr, status, error) {
                    console.error("Erro ao adicionar produto " + error)
                }
            })
        }

        function carregarLista() {
            $.ajax({
                url: "${createLink(controller: 'produto', action: 'lista')}",
                success: function (data) {
                    $("#divLista").html(data);
                },
                error: function (xhr, status, error) {
                    console.error("Erro ao carregar a lista: " + error);
                }
            });
        }

        function excluir(id) {
            if (confirm("Deseja realmente excluir?")) {
                $.ajax({
                    url: "${createLink(controller: 'produto', action: 'excluir')}",
                    data: {id: id},
                    success: function (data) {
                        $("#divLista").html(data);
                    },
                    error: function (xhr, status, error) {
                        console.error("Erro ao excluir o produto: " + error);
                    }
                });
            }
        }

        function carregarFormularioAlterar(id) {
            $.ajax({
                url: "${createLink(controller: 'produto', action: 'alterar')}",
                data: {id: id},
                success: function (data) {
                    $('#divForm').html(data);
                },
                error: function (xhr, status, error) {
                    console.error("Erro ao carregar o formulário de alteração: " + error);
                }
            });
        }

        function cancelar() {
            jQuery("#divForm").html("")
        }

        $(document).ready(function () {
            $('#adicionarProduto').on('click', function (event) {
                event.preventDefault(); // Evita que o link faça uma navegação padrão
                adicionarProduto(); // Chama a função para adicionar produto
            });
        });
    </script>
</head>

<body>
<a href="#" id="adicionarProduto">Adicionar</a>

<div id="divLista">
    <g:render template="lista" model="[produtos: produtos]"/>
</div>

<div id="divForm"></div>

<script src="${resource(dir: 'js', file: 'jquery.min.js')}"></script>


</body>
</html>
