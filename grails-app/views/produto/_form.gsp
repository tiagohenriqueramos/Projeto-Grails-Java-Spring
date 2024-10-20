<div id="divMensagem"></div>

<g:form name="frmProduto" id="frmProduto" url="[controller: 'produto', action: 'salvar']">
    Nome <input type="text" name="nome" value="${produto?.nome}" /><br/>
    Preco <input type="text" name="preco" value="${produto?.preco}" /><br/>
    Qtde. atual <input type="text" name="quantidade" value="${produto?.estoque?.quantidade}" /><br/>
    Qtde. minima <input type="text" name="quantidadeMinima" value="${produto?.estoque?.quantidadeMinima}" /><br/>
    <input type="submit" name="btnSalvar" value="Salvar" />
    <input type="button" name="btnCancelar" value="Cancelar" onclick="cancelar()" />
    <input type="hidden" name="id" value="${produto?.id}" />
</g:form>
