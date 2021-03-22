var mensaje = '<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<SumarRequest xmlns="http://www.example.org/calculadora">' +
    '<a>' +
    document.getElementById('a').value +
    '</a>' +
    '<b>' +
    document.getElementById('b').value +
    '</b>' +
    '</SumarRequest>' +
    '</Body>' +
    '</Envelope>';

function soap() {
    axios.post('http://localhost:8080/ws/calculadora', mensaje, {
        headers: {
            'Content-Type': 'text/xml'
        }
    })
        .then(response => console.log(response.data))
        .catch(err => console.log(err));
}