var parser = new X2JS();
function EstadoservList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.estadosserv = json.Envelope.Body.findAllEstadoservResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllEstadoserv xmlns="http://service"></findAllEstadoserv></soap:Body></soap:Envelope>','text/xml');
};
function EstadoservDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.estadoserv = json.Envelope.Body.findEstadoservResponse.return;
$.estadoserv = $global.estadoserv;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findEstadoserv xmlns="http://service"><estadoservID>'+params[0]+'</estadoservID></findEstadoserv></soap:Body></soap:Envelope>','text/xml');
};
function EstadoservNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function EstadoservInsert($, params) {
$.estadoserv = $global.estadoserv;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosserv');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertEstadoserv xmlns="http://service"><estadoservID>'+id.value+'</estadoservID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><servicio>'+servicio.value+'</servicio></insertEstadoserv></soap:Body></soap:Envelope>','text/xml');
};
function EstadoservUpdate($, params) {
$.estadoserv = $global.estadoserv;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosserv');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateEstadoserv xmlns="http://service"><estadoservID>'+$.estadoserv.id+'</estadoservID><id>'+$.estadoserv.id+'</id><nombre>'+$.estadoserv.nombre+'</nombre><servicio>'+$.estadoserv.servicio+'</servicio></updateEstadoserv></soap:Body></soap:Envelope>','text/xml');
};
function EstadoservDelete($, params) {
$.estadoserv = $global.estadoserv;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosserv');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteEstadoserv xmlns="http://service"><estadoservID>'+$.estadoserv.cedula+'</estadoservID></deleteEstadoserv></soap:Body></soap:Envelope>','text/xml');
};
