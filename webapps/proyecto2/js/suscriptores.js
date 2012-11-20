var parser = new X2JS();
function SuscriptorList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.suscriptores = json.Envelope.Body.findAllSuscriptorResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllSuscriptor xmlns="http://service"></findAllSuscriptor></soap:Body></soap:Envelope>','text/xml');
};
function SuscriptorDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.suscriptor = json.Envelope.Body.findSuscriptorResponse.return;
$.suscriptor = $global.suscriptor;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findSuscriptor xmlns="http://service"><suscriptorID>'+params[0]+'</suscriptorID></findSuscriptor></soap:Body></soap:Envelope>','text/xml');
};
function SuscriptorNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function SuscriptorInsert($, params) {
$.suscriptor = $global.suscriptor;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('suscriptores');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertSuscriptor xmlns="http://service"><suscriptorID>'+id.value+'</suscriptorID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><identificacion>'+identificacion.value+'</identificacion><telefono>'+telefono.value+'</telefono><direccion>'+direccion.value+'</direccion></insertSuscriptor></soap:Body></soap:Envelope>','text/xml');
};
function SuscriptorUpdate($, params) {
$.suscriptor = $global.suscriptor;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('suscriptores');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateSuscriptor xmlns="http://service"><suscriptorID>'+$.suscriptor.id+'</suscriptorID><id>'+$.suscriptor.id+'</id><nombre>'+$.suscriptor.nombre+'</nombre><identificacion>'+$.suscriptor.identificacion+'</identificacion><telefono>'+$.suscriptor.telefono+'</telefono><direccion>'+$.suscriptor.direccion+'</direccion></updateSuscriptor></soap:Body></soap:Envelope>','text/xml');
};
function SuscriptorDelete($, params) {
$.suscriptor = $global.suscriptor;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('suscriptores');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteSuscriptor xmlns="http://service"><suscriptorID>'+$.suscriptor.cedula+'</suscriptorID></deleteSuscriptor></soap:Body></soap:Envelope>','text/xml');
};
