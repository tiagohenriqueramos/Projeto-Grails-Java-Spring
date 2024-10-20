<!doctype html>
<html>
<head>
    <title><g:if env="development">Gerenciamento de produtos</g:if><g:else>Error</g:else></title>
    <meta name="layout" content="main">
    <g:javascript library="jquery"/>
    <script type="text/javascript">
    function carregarLista(){
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
        if(confirm("Deseja realmente excluir?")){
            $.ajax({
                url: "${createLink(controller: 'produto', action: 'excluir')}",
                data: {id: id},
                success: function (data) {
                    $("#divLista").html(data);  // Atualiza a lista após exclusão
                },
                error: function (xhr, status, error) {
                    console.error("Erro ao excluir o produto: " + error);
                }
            });
        }
    }
    function cancelar(){
        jQuery("#divForm").html("")
    }
</script>
</head>

    <body>
        <a href="#" id="adicionarProduto">Adicionar</a>

        <div id="divLista">
            <g:render template="lista" model="[produtos: produtos]"/>
        </div>

        <div id="divForm"></div>

    </body>
</html>
<script src="${resource(dir: 'js', file: 'jquery.min.js')}"></script>

<script>
    $(document).ready(function () {
        $('#adicionarProduto').on('click', function (event) {
            event.preventDefault();
            $.ajax({
                url: "${createLink(controller: 'produto', action: 'adicionar')}",
                success: function (data) {
                    $('#divForm').html(data);
                },
                error: function (xhr, status, error) {
                    console.log('Erro na requisição AJAX: ' + error);
                }
            });
        });
    });
</script>
