var idPedido=0;
var status=0;
var mensaje;

function setValues(){
    idPedido=document.getElementById('idPedido').value;
    status=document.getElementById('status').value;
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
        '<Body>'+
            '<UpdateRequest xmlns="http://cafeteria/pedidos" >' +
                '<id>'+parseInt(idPedido)+'</id>' +
                '<status>'+status.toString()+'</status>' +
            '</UpdateRequest>'+
        '</Body>' +
    '</Envelope>';
    console.log(mensaje);
}

var request, parser, xmlDoc;
function update() {
    setValues();
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
    xmlDoc = parser.parseFromString(xml,"text/xml")
    var response=
        xmlDoc.getElementsByTagName("ns2:mensaje")[0].childNodes[0].nodeValue+
        "\nID del pedido actualizado: "+
        xmlDoc.getElementsByTagName("ns2:idPedidoActualizado")[0].childNodes[0].nodeValue;
    alert(response); 
}