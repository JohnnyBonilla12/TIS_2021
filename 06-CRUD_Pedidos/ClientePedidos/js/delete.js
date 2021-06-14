var idPedido=0;
var mensaje;

function setValues(){
    idPedido=document.getElementById('idPedido').value;
    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">'+
        '<Body>'+
            '<DeleteRequest xmlns="http://cafeteria/pedidos" >'+
                '<id>'+parseInt(idPedido)+'</id>'+
            '</DeleteRequest>'+
        '</Body>' +
    '</Envelope>';
    console.log(mensaje);
}

var request, parser, xmlDoc;
function deleteP(){
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
        xmlDoc.getElementsByTagName("ns2:mensaje")[0].childNodes[0].nodeValue+" con el ID:"+xmlDoc.getElementsByTagName("ns2:idPedidoEliminado")[0].childNodes[0].nodeValue;
    alert(response); 
}