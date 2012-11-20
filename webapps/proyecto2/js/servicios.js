var parser = new X2JS();
function ServicioList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.servicios = json.Envelope.Body.findAllServicioResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllServicio xmlns="http://service"></findAllServicio></soap:Body></soap:Envelope>','text/xml');
};
function ServicioDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.servicio = json.Envelope.Body.findServicioResponse.return;
$.servicio = $global.servicio;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findServicio xmlns="http://service"><servicioID>'+params[0]+'</servicioID></findServicio></soap:Body></soap:Envelope>','text/xml');
};
function ServicioNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function ServicioInsert($, params) {
$.servicio = $global.servicio;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('servicios');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertServicio xmlns="http://service"><servicioID>'+id.value+'</servicioID><id>'+id.value+'</id><fechainst>'+fechainst.value+'</fechainst><direccion>'+direccion.value+'</direccion><region>'+region.value+'</region><suscriptor>'+suscriptor.value+'</suscriptor></insertServicio></soap:Body></soap:Envelope>','text/xml');
};
function ServicioUpdate($, params) {
$.servicio = $global.servicio;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('servicios');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateServicio xmlns="http://service"><servicioID>'+$.servicio.id+'</servicioID><id>'+$.servicio.id+'</id><fechainst>'+$.servicio.fechainst+'</fechainst><direccion>'+$.servicio.direccion+'</direccion><region>'+$.servicio.region+'</region><suscriptor>'+$.servicio.suscriptor+'</suscriptor></updateServicio></soap:Body></soap:Envelope>','text/xml');
};
function ServicioDelete($, params) {
$.servicio = $global.servicio;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('servicios');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteServicio xmlns="http://service"><servicioID>'+$.servicio.cedula+'</servicioID></deleteServicio></soap:Body></soap:Envelope>','text/xml');
};
