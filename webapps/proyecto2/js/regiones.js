var parser = new X2JS();
function RegionList($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
var json = parser.xml_str2json(data);
$.regiones = json.Envelope.Body.findAllRegionResponse.return;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findAllRegion xmlns="http://service"></findAllRegion></soap:Body></soap:Envelope>','text/xml');
};
function RegionDetail($, params) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
var json = parser.xml_str2json(data);
$global.region = json.Envelope.Body.findRegionResponse.return;
$.region = $global.region;
framux.render();
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><findRegion xmlns="http://service"><regionID>'+params[0]+'</regionID></findRegion></soap:Body></soap:Envelope>','text/xml');
};
function RegionNew($) {
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function (data) {
framux.render();
});
};
function RegionInsert($, params) {
$.region = $global.region;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('regiones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><insertRegion xmlns="http://service"><regionID>'+id.value+'</regionID><id>'+id.value+'</id><encargado>'+encargado.value+'</encargado><sucursal>'+sucursal.value+'</sucursal></insertRegion></soap:Body></soap:Envelope>','text/xml');
};
function RegionUpdate($, params) {
$.region = $global.region;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('regiones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><updateRegion xmlns="http://service"><regionID>'+$.region.id+'</regionID><id>'+$.region.id+'</id><encargado>'+$.region.encargado+'</encargado><sucursal>'+$.region.sucursal+'</sucursal></updateRegion></soap:Body></soap:Envelope>','text/xml');
};
function RegionDelete($, params) {
$.region = $global.region;
xhr('http://localhost:8089/axis2/services/ReporteAveriasService',function(data) {
framux.go('regiones');
},'POST','<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><deleteRegion xmlns="http://service"><regionID>'+$.region.cedula+'</regionID></deleteRegion></soap:Body></soap:Envelope>','text/xml');
};
