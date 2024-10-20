<g:if test="${produtos?.size() > 0}">
    <table>
        <tr>
            <th>Nome</th>
            <th>Preço</th>
            <th>Ações</th>
        </tr>
        <g:each var="produto" in="${produtos}">
            <tr>
                <td>${produto?.nome ?: 'Nome não disponível'}</td>
                <td>${produto?.preco ?: 'Preço não disponível'}</td>
                <td>
                    <a href="#" onclick="carregarFormularioAlterar('${produto?.id}')">Alterar</a>

                    <a href="#" onclick="excluir('${produto?.id}')">Excluir</a>

                </td>
            </tr>
        </g:each>
    </table>
</g:if>
<g:else>
    Não há produtos
</g:else>
