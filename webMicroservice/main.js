document.getElementById('btn').addEventListener("click", search)

function search() {
    var column = 0;
    var filtrar, table, tr, td, th, i;

    filtrar = document.getElementById('search');
    filtrar = filtrar.value.toUpperCase();

    table = document.getElementById("table");
    tr = table.getElementsByTagName("tr");
    th = table.getElementsByTagName("th");

    for( i = 0; i<tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[column];

        if(td){
            if(td.innerHTML.toUpperCase().indexOf(filtrar) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

function getReports() {
    fetch("http://localhost:8085/emails/listar",
        {
            method: "GET",
        })
        .then(function(res) {return res.json()})
        .catch(function(res) {console.log(res)})

        .then(function(emails){
            let placeholder = document.querySelector("#email-data");
            let out = "";

            for(let email of emails){
                out += `
                    <tr>
                        <td>${email.dataEnvio}</td>
                        <td>${email.dataRecebimento}</td>
                        <td>${email.conteudoEmail}</td>
                        <td>${email.assuntoEmail}</td>
                        <td>${email.autorEmail}</td>
                    </tr>
                `
            }

            placeholder.innerHTML = out;
        })
}



function postReport() {
    fetch("http://localhost:8085/emails/salvar",
        {
            headers: {
                "Content-Type": "application/json"
            },
            method: "POST",
            body: JSON.stringify(
                {
                    "dataEnvio": "2022-11-13T23:45:38.087Z",
                    "dataRecebimento": "2022-10-13T23:45:38.087Z",
                    "conteudoEmail": "Email de teste",
                    "assuntoEmail": "Isso é um email pré salvo",
                    "autorEmail": "Marcelo"
                }),
        
        })
        .then(function(res) {console.log(res)})
        .catch(function(res) {console.log(res)})
}

postReport();
getReports();
