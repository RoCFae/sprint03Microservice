const form = document.querySelector("form");
const nome = document.getElementById("nome");
const tipo = document.getElementById("tipo");
const preco = document.getElementById("preco");
const estoque = document.getElementById("estoque");

function cadastrar() {
    fetch("http://localhost:8080/produtos/save",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nomeProduto: nome.value,
            tipoProduto: tipo.value,
            precoProduto: preco.value,
            estoqueProduto: estoque.value
        })
    })
    .then(function (res) {console.log(res)})
    .catch(function (res) {console.log(res)})
}

function limpar() {
    nome.value = "";
    tipo.value = "";
    preco.value = "";
    estoque.value = "";
}

form.addEventListener('submit', function (event) {
    event.preventDefault()
    console.log("teste")


    cadastrar();
    window.location.href = './produtos.html'
})