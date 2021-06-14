var idPedido=0;
var mensaje;

function setValues(){
    idPedido=document.getElementById('idPedido').value;
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>'+
            '<ReadRequest xmlns="http://cafeteria/pedidos" >' +
                '<id>'+parseInt(idPedido)+'</id>' +
            '</ReadRequest>' +
        '</Body>' +
    '</Envelope>';
}

var request, parser, xmlDoc;
function read() {
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
        "ID del pedido: "+
        xmlDoc.getElementsByTagName("ns2:id")[0].childNodes[0].nodeValue+
        "\nID del carrito: "+
        xmlDoc.getElementsByTagName("ns2:id_carrito")[0].childNodes[0].nodeValue+
        "\nFecha del pedido: "+
        xmlDoc.getElementsByTagName("ns2:fecha")[0].childNodes[0].nodeValue+
        "\nCosto del pedido: "+
        xmlDoc.getElementsByTagName("ns2:costo")[0].childNodes[0].nodeValue+
        "\nStatus del pedido: "+
        xmlDoc.getElementsByTagName("ns2:status")[0].childNodes[0].nodeValue+
        "\nDirección del pedido: "+
        xmlDoc.getElementsByTagName("ns2:direccion")[0].childNodes[0].nodeValue;
    alert(response); 
}