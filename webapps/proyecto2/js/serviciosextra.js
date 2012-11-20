var parser = new X2JS();
function ServicioextraList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.serviciosextra = json.Envelope.Body.findAllServicioextraResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllServicioextra xmlns="http://service"></findAllServicioextra></soap:Body></soap:Envelope>','text/xml');
};
function ServicioextraDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.servicioextra = json.Envelope.Body.findServicioextraResponse.return;
$.servicioextra = $global.servicioextra;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findServicioextra xmlns="http://service"><servicioextraID>'+params[0]+'</servicioextraID></findServicioextra></soap:Body></soap:Envelope>','text/xml');
};
function ServicioextraNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function ServicioextraInsert($, params) {
$.servicioextra = $global.servicioextra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('serviciosextra');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertServicioextra xmlns="http://service"><servicioextraID>'+id.value+'</servicioextraID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><servicio>'+servicio.value+'</servicio></insertServicioextra></soap:Body></soap:Envelope>','text/xml');
};
function ServicioextraUpdate($, params) {
$.servicioextra = $global.servicioextra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('serviciosextra');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateServicioextra xmlns="http://service"><servicioextraID>'+$.servicioextra.id+'</servicioextraID><id>'+$.servicioextra.id+'</id><nombre>'+$.servicioextra.nombre+'</nombre><servicio>'+$.servicioextra.servicio+'</servicio></updateServicioextra></soap:Body></soap:Envelope>','text/xml');
};
function ServicioextraDelete($, params) {
$.servicioextra = $global.servicioextra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('serviciosextra');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteServicioextra xmlns="http://service"><servicioextraID>'+$.servicioextra.cedula+'</servicioextraID></deleteServicioextra></soap:Body></soap:Envelope>','text/xml');
};
