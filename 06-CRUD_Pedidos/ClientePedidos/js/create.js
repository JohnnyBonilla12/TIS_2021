$('.navTrigger').click(function () {
    $(this).toggleClass('active');
    console.log("Clicked menu");
    $("#mainListDiv").toggleClass("show_list");
    $("#mainListDiv").fadeIn();
});

var carrito=0;
var fecha=0;
var costo=0;
var status=0;
var direcc=0;
var mensaje;

function setValues(){
    carrito=document.getElementById('idCarrito').value;
    fecha=document.getElementById('fecha').value;
    costo=document.getElementById('costo').value;
    status=document.getElementById('status').value;
    direcc=document.getElementById('direccion').value;

    mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>' +
            '<CreatePedidoRequest xmlns="http://cafeteria/pedidos" >' +
                '<id_carrito>'+parseInt(carrito)+'</id_carrito>' +
                '<fecha>'+fecha+'</fecha>' +
                '<costo>'+costo+'</costo>' +
                '<status>'+status.toString()+'</status>' +
                '<direccion>'+direcc.toString()+'</direccion>' +
            '</CreatePedidoRequest>' +
        '</Body>' +
    '</Envelope>';
}

var request, parser, xmlDoc;
function create() {
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
    alert(xmlDoc.getElementsByTagName("ns2:mensaje")[0].childNodes[0].nodeValue+ " Con el ID: "+xmlDoc.getElementsByTagName("ns2:idPedidoCreado")[0].childNodes[0].nodeValue); 
}



