function getProdutos() {

    fetch("http://localhost:8080/produtos/list",
        {
            method: "GET",
        })
        .then(function(res) {return res.json()})
        .catch(function(res) {console.log(res)})

        .then(function(produtos){
            let placeholder = document.querySelector("#produto-data");
            let out = "";

            for(let produto of produtos){
                out += `
                    <tr>
                        <td>${produto.nomeProduto}</td>
                        <td>${produto.tipoProduto}</td>
                        <td>${produto.precoProduto}</td>
                        <td>${produto.estoqueProduto}</td>
                    </tr>
                `
            }

            placeholder.innerHTML = out;
        })
}

getProdutos()
