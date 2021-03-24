var mensaje = '';

function ini() {
    mensaje =
        '<?xml version="1.0" encoding="utf-8"?>' +
        '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>' +
        '<SumarRequest xmlns="http://www.example.org/calculadora">' +
        '<a>' + document.getElementById('a').value + '</a>' +
        '<b>' + document.getElementById('b').value + '</b>' +
        '</SumarRequest>' +
        '</Body>' +
        '</Envelope>';
}


function soap() {
    ini();
    axios.post('http://localhost:8080/ws/calculadora', mensaje, {
        headers: {
            'Content-Type': 'text/xml'
        }
    })
        .then(function (response) {
            document.getElementById('r').value = resultado(response.data)
        })
        .catch(err => console.log(err));
}

function resultado(rxml) {
    parser = new DOMParser();
    xmlDoc = parser.parseFromString(rxml, "text/xml");
    result = xmlDoc.getElementsByTagName("ns2:resultado")[0].childNodes[0].nodeValue;
    return result;
}