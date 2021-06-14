window.onload = readAll();
var mensaje, request, parser, xmlDoc, table;

function readAll(){
    table='<table class="table table-bordered mostrar "><thead><tr><th scope="col">ID Pedido</th><th scope="col">ID Carrito</th>'+
    '<th scope="col">Fecha</th><th scope="col">Costo</th><th scope="col">Status</th><th scope="col">Dirección</th></tr></thead><tbody>';
    create();
}

function getPedidos(){
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>' +
            '<ReadAllRequest xmlns="http://cafeteria/pedidos"/>'+
        '</Body>' +
    '</Envelope>';
}

function create() {
    getPedidos();
    axios.post('http://localhost:8081/ws/cafeteria/pedidos', mensaje,{
        headers:{
            'Content-Type': 'text/xml'
        }
    })
    .then(response => getValue(response.data))
    .catch(err => console.log(err.message));
}

function getValue(xml){
    parser = new DOMParser();
    xmlDoc = parser.parseFromString(xml,"text/xml");
    let i=0;
    var indice=0;
    while(i!=1){
        var id =xmlDoc.getElementsByTagName("ns2:id")[indice];
        var id_carrito =xmlDoc.getElementsByTagName("ns2:id_carrito")[indice];
        var fecha =xmlDoc.getElementsByTagName("ns2:fecha")[indice];
        var costo =xmlDoc.getElementsByTagName("ns2:costo")[indice];
        var status =xmlDoc.getElementsByTagName("ns2:status")[indice];
        var direccion =xmlDoc.getElementsByTagName("ns2:direccion")[indice];
        indice++;
        if(id!=null){
            // alert(local); 
            table+="<tr>"
            table+="<td>"+id.childNodes[0].nodeValue.toString()+"</td>"
            table+="<td>"+id_carrito.childNodes[0].nodeValue+"</td>"
            table+="<td>"+fecha.childNodes[0].nodeValue+"</td>"
            table+="<td>"+costo.childNodes[0].nodeValue+"</td>"
            table+="<td>"+status.childNodes[0].nodeValue+"</td>"
            table+="<td>"+direccion.childNodes[0].nodeValue+"</td>"
            table+="</tr>"
            
        }else{
            table+='</tbody></table>';
            console.log(table);
            document.getElementById('here').innerHTML = table;
            i=1;
        }
    }
}
