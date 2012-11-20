var parser = new X2JS();
function EstadoaveriaList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.estadosaveria = json.Envelope.Body.findAllEstadoaveriaResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllEstadoaveria xmlns="http://service"></findAllEstadoaveria></soap:Body></soap:Envelope>','text/xml');
};
function EstadoaveriaDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.estadoaveria = json.Envelope.Body.findEstadoaveriaResponse.return;
$.estadoaveria = $global.estadoaveria;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findEstadoaveria xmlns="http://service"><estadoaveriaID>'+params[0]+'</estadoaveriaID></findEstadoaveria></soap:Body></soap:Envelope>','text/xml');
};
function EstadoaveriaNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function EstadoaveriaInsert($, params) {
$.estadoaveria = $global.estadoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertEstadoaveria xmlns="http://service"><estadoaveriaID>'+id.value+'</estadoaveriaID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><averia>'+averia.value+'</averia></insertEstadoaveria></soap:Body></soap:Envelope>','text/xml');
};
function EstadoaveriaUpdate($, params) {
$.estadoaveria = $global.estadoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateEstadoaveria xmlns="http://service"><estadoaveriaID>'+$.estadoaveria.id+'</estadoaveriaID><id>'+$.estadoaveria.id+'</id><nombre>'+$.estadoaveria.nombre+'</nombre><averia>'+$.estadoaveria.averia+'</averia></updateEstadoaveria></soap:Body></soap:Envelope>','text/xml');
};
function EstadoaveriaDelete($, params) {
$.estadoaveria = $global.estadoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('estadosaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteEstadoaveria xmlns="http://service"><estadoaveriaID>'+$.estadoaveria.cedula+'</estadoaveriaID></deleteEstadoaveria></soap:Body></soap:Envelope>','text/xml');
};
