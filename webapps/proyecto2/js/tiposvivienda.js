var parser = new X2JS();
function TipoviviendaList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.tiposvivienda = json.Envelope.Body.findAllTipoviviendaResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllTipovivienda xmlns="http://service"></findAllTipovivienda></soap:Body></soap:Envelope>','text/xml');
};
function TipoviviendaDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.tipovivienda = json.Envelope.Body.findTipoviviendaResponse.return;
$.tipovivienda = $global.tipovivienda;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findTipovivienda xmlns="http://service"><tipoviviendaID>'+params[0]+'</tipoviviendaID></findTipovivienda></soap:Body></soap:Envelope>','text/xml');
};
function TipoviviendaNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function TipoviviendaInsert($, params) {
$.tipovivienda = $global.tipovivienda;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposvivienda');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertTipovivienda xmlns="http://service"><tipoviviendaID>'+id.value+'</tipoviviendaID><id>'+id.value+'</id><nombre >'+nombre .value+'</nombre ><servicio>'+servicio.value+'</servicio></insertTipovivienda></soap:Body></soap:Envelope>','text/xml');
};
function TipoviviendaUpdate($, params) {
$.tipovivienda = $global.tipovivienda;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposvivienda');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateTipovivienda xmlns="http://service"><tipoviviendaID>'+$.tipovivienda.id+'</tipoviviendaID><id>'+$.tipovivienda.id+'</id><nombre >'+$.tipovivienda.nombre +'</nombre ><servicio>'+$.tipovivienda.servicio+'</servicio></updateTipovivienda></soap:Body></soap:Envelope>','text/xml');
};
function TipoviviendaDelete($, params) {
$.tipovivienda = $global.tipovivienda;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('tiposvivienda');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteTipovivienda xmlns="http://service"><tipoviviendaID>'+$.tipovivienda.cedula+'</tipoviviendaID></deleteTipovivienda></soap:Body></soap:Envelope>','text/xml');
};
