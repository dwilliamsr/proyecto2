var parser = new X2JS();
function AveriaList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.averias = json.Envelope.Body.findAllAveriaResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllAveria xmlns="http://service"></findAllAveria></soap:Body></soap:Envelope>','text/xml');
};
function AveriaDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.averia = json.Envelope.Body.findAveriaResponse.return;
$.averia = $global.averia;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAveria xmlns="http://service"><averiaID>'+params[0]+'</averiaID></findAveria></soap:Body></soap:Envelope>','text/xml');
};
function AveriaNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function AveriaInsert($, params) {
$.averia = $global.averia;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('averias');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertAveria xmlns="http://service"><averiaID>'+id.value+'</averiaID><id>'+id.value+'</id><descripcion>'+descripcion.value+'</descripcion><fecha>'+fecha.value+'</fecha><servicio>'+servicio.value+'</servicio></insertAveria></soap:Body></soap:Envelope>','text/xml');
};
function AveriaUpdate($, params) {
$.averia = $global.averia;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('averias');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateAveria xmlns="http://service"><averiaID>'+$.averia.id+'</averiaID><id>'+$.averia.id+'</id><descripcion>'+$.averia.descripcion+'</descripcion><fecha>'+$.averia.fecha+'</fecha><servicio>'+$.averia.servicio+'</servicio></updateAveria></soap:Body></soap:Envelope>','text/xml');
};
function AveriaDelete($, params) {
$.averia = $global.averia;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('averias');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteAveria xmlns="http://service"><averiaID>'+$.averia.cedula+'</averiaID></deleteAveria></soap:Body></soap:Envelope>','text/xml');
};
