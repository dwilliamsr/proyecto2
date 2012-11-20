var parser = new X2JS();
function SucursalList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.sucursales = json.Envelope.Body.findAllSucursalResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllSucursal xmlns="http://service"></findAllSucursal></soap:Body></soap:Envelope>','text/xml');
};
function SucursalDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.sucursal = json.Envelope.Body.findSucursalResponse.return;
$.sucursal = $global.sucursal;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findSucursal xmlns="http://service"><sucursalID>'+params[0]+'</sucursalID></findSucursal></soap:Body></soap:Envelope>','text/xml');
};
function SucursalNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function SucursalInsert($, params) {
$.sucursal = $global.sucursal;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('sucursales');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertSucursal xmlns="http://service"><sucursalID>'+id.value+'</sucursalID><id>'+id.value+'</id><telefono>'+telefono.value+'</telefono><ciudad>'+ciudad.value+'</ciudad><direccion>'+direccion.value+'</direccion><encargado>'+encargado.value+'</encargado></insertSucursal></soap:Body></soap:Envelope>','text/xml');
};
function SucursalUpdate($, params) {
$.sucursal = $global.sucursal;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('sucursales');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateSucursal xmlns="http://service"><sucursalID>'+$.sucursal.id+'</sucursalID><id>'+$.sucursal.id+'</id><telefono>'+$.sucursal.telefono+'</telefono><ciudad>'+$.sucursal.ciudad+'</ciudad><direccion>'+$.sucursal.direccion+'</direccion><encargado>'+$.sucursal.encargado+'</encargado></updateSucursal></soap:Body></soap:Envelope>','text/xml');
};
function SucursalDelete($, params) {
$.sucursal = $global.sucursal;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('sucursales');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteSucursal xmlns="http://service"><sucursalID>'+$.sucursal.cedula+'</sucursalID></deleteSucursal></soap:Body></soap:Envelope>','text/xml');
};
