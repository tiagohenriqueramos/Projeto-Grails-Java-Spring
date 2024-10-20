<div id="divMensagem"></div>

<g:form name="frmProduto" id="frmProduto" url="[controller: 'produto', action: 'salvar']">
    Nome <input type="text" name="nome" value="${produto?.nome}" required /><br/>
    Preco <input type="number" name="preco" step="0.01" value="${produto?.preco ?: ''}" required /><br/>
    <input type="submit" name="btnSalvar" value="Salvar" />
    <input type="button" name="btnCancelar" value="Cancelar" onclick="cancelar()" />
    <input type="hidden" name="id" value="${produto?.id}" />
</g:form>
<g:form controller="produto" action="salvar">
    <label for="nome">Nome:</label>
    <g:textField name="nome" value="${produto?.nome}" required="required"/>

    <label for="preco">Preço:</label>
    <g:textField name="preco" value="${produto?.preco}" required="required"/>

    <button type="submit">Salvar</button>
    <button type="button" onclick="cancelar()">Cancelar</button>
</g:form>
