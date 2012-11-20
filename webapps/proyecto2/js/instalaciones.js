var parser = new X2JS();
function InstalacionList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.instalaciones = json.Envelope.Body.findAllInstalacionResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllInstalacion xmlns="http://service"></findAllInstalacion></soap:Body></soap:Envelope>','text/xml');
};
function InstalacionDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.instalacion = json.Envelope.Body.findInstalacionResponse.return;
$.instalacion = $global.instalacion;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findInstalacion xmlns="http://service"><instalacionID>'+params[0]+'</instalacionID></findInstalacion></soap:Body></soap:Envelope>','text/xml');
};
function InstalacionNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function InstalacionInsert($, params) {
$.instalacion = $global.instalacion;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('instalaciones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertInstalacion xmlns="http://service"><instalacionID>'+id.value+'</instalacionID><id>'+id.value+'</id><numconcent>'+numconcent.value+'</numconcent><cantmetcable>'+cantmetcable.value+'</cantmetcable><inspropia>'+inspropia.value+'</inspropia><canttel>'+canttel.value+'</canttel></insertInstalacion></soap:Body></soap:Envelope>','text/xml');
};
function InstalacionUpdate($, params) {
$.instalacion = $global.instalacion;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('instalaciones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateInstalacion xmlns="http://service"><instalacionID>'+$.instalacion.id+'</instalacionID><id>'+$.instalacion.id+'</id><numconcent>'+$.instalacion.numconcent+'</numconcent><cantmetcable>'+$.instalacion.cantmetcable+'</cantmetcable><inspropia>'+$.instalacion.inspropia+'</inspropia><canttel>'+$.instalacion.canttel+'</canttel></updateInstalacion></soap:Body></soap:Envelope>','text/xml');
};
function InstalacionDelete($, params) {
$.instalacion = $global.instalacion;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('instalaciones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteInstalacion xmlns="http://service"><instalacionID>'+$.instalacion.cedula+'</instalacionID></deleteInstalacion></soap:Body></soap:Envelope>','text/xml');
};
