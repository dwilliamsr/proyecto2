var parser = new X2JS();
function TipoaveriaList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.tiposaveria = json.Envelope.Body.findAllTipoaveriaResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllTipoaveria xmlns="http://service"></findAllTipoaveria></soap:Body></soap:Envelope>','text/xml');
};
function TipoaveriaDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.tipoaveria = json.Envelope.Body.findTipoaveriaResponse.return;
$.tipoaveria = $global.tipoaveria;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findTipoaveria xmlns="http://service"><tipoaveriaID>'+params[0]+'</tipoaveriaID></findTipoaveria></soap:Body></soap:Envelope>','text/xml');
};
function TipoaveriaNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function TipoaveriaInsert($, params) {
$.tipoaveria = $global.tipoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertTipoaveria xmlns="http://service"><tipoaveriaID>'+id.value+'</tipoaveriaID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><averia>'+averia.value+'</averia></insertTipoaveria></soap:Body></soap:Envelope>','text/xml');
};
function TipoaveriaUpdate($, params) {
$.tipoaveria = $global.tipoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateTipoaveria xmlns="http://service"><tipoaveriaID>'+$.tipoaveria.id+'</tipoaveriaID><id>'+$.tipoaveria.id+'</id><nombre>'+$.tipoaveria.nombre+'</nombre><averia>'+$.tipoaveria.averia+'</averia></updateTipoaveria></soap:Body></soap:Envelope>','text/xml');
};
function TipoaveriaDelete($, params) {
$.tipoaveria = $global.tipoaveria;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposaveria');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteTipoaveria xmlns="http://service"><tipoaveriaID>'+$.tipoaveria.cedula+'</tipoaveriaID></deleteTipoaveria></soap:Body></soap:Envelope>','text/xml');
};
