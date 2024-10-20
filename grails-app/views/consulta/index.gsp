<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Lista de Pedidos</title>
</head>
<body>
<h1>Lista de Pedidos</h1>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Data e Hora</th>
        <th>Valor Total</th>
        <th>Cliente</th>
        <th>Itens</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${lista}" var="pedido">
        <tr>
            <td>${pedido.id}</td>
            <td>${pedido.dataHora?.format('dd/MM/yyyy HH:mm')}</td>
            <td>${pedido.valorTotal}</td>
            <td>${pedido.cliente?.nome}</td>
            <td>
                <ul>
                    <g:each in="${pedido.itens}" var="item">
                        <li>${item.descricao} - Quantidade: ${item.quantidade}</li>
                    </g:each>
                </ul>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>