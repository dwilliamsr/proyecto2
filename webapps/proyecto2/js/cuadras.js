var parser = new X2JS();
function CuadraList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.cuadras = json.Envelope.Body.findAllCuadraResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllCuadra xmlns="http://service"></findAllCuadra></soap:Body></soap:Envelope>','text/xml');
};
function CuadraDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.cuadra = json.Envelope.Body.findCuadraResponse.return;
$.cuadra = $global.cuadra;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findCuadra xmlns="http://service"><cuadraID>'+params[0]+'</cuadraID></findCuadra></soap:Body></soap:Envelope>','text/xml');
};
function CuadraNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function CuadraInsert($, params) {
$.cuadra = $global.cuadra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('cuadras');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertCuadra xmlns="http://service"><cuadraID>'+id.value+'</cuadraID><id>'+id.value+'</id><nombre>'+nombre.value+'</nombre><region>'+region.value+'</region></insertCuadra></soap:Body></soap:Envelope>','text/xml');
};
function CuadraUpdate($, params) {
$.cuadra = $global.cuadra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('cuadras');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateCuadra xmlns="http://service"><cuadraID>'+$.cuadra.id+'</cuadraID><id>'+$.cuadra.id+'</id><nombre>'+$.cuadra.nombre+'</nombre><region>'+$.cuadra.region+'</region></updateCuadra></soap:Body></soap:Envelope>','text/xml');
};
function CuadraDelete($, params) {
$.cuadra = $global.cuadra;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('cuadras');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteCuadra xmlns="http://service"><cuadraID>'+$.cuadra.cedula+'</cuadraID></deleteCuadra></soap:Body></soap:Envelope>','text/xml');
};
