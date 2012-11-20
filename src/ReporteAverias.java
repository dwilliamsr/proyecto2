package servicio;
import java.util.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService (targetNamespace ="http://service", name="reporteAverias")
public class ReporteAverias {

  private static AveriaService averia;

  @WebMethod (action="urn:findAveria", operationName="findAveria")
  public AveriaDTO findAveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkAveria();
    return averia.find(IdKEY);
  }

  @WebMethod (action="urn:findAllAveria", operationName="findAllAveria")
  public List<AveriaDTO> findAllAveria() {
    checkAveria();
    return averia.findAll();
  }

  @WebMethod (action="urn:updateAveria", operationName="updateAveria")
  public AveriaDTO updateAveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Descripcion") String Descripcion, @WebParam (partName = "Fecha") String Fecha, @WebParam (partName = "Servicio") String Servicio) {
    checkAveria();
    return averia.update( Id, Descripcion, Fecha, Servicio);
  }
  @WebMethod (action="urn:insertAveria", operationName="insertAveria")
  public AveriaDTO insertAveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Descripcion") String Descripcion, @WebParam (partName = "Fecha") String Fecha, @WebParam (partName = "Servicio") String Servicio) {
    checkAveria();
    return averia.insert( Id, Descripcion, Fecha, Servicio);
  }
  @WebMethod (action="urn:deleteAveria", operationName="deleteAveria")
  public AveriaDTO deleteAveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkAveria();
    return averia.delete(IdKEY);
  }
  private void checkAveria() {
    if (averia == null)
      averia = new AveriaService();
  }

  private static EstadoaveriaService estadoaveria;

  @WebMethod (action="urn:findEstadoaveria", operationName="findEstadoaveria")
  public EstadoaveriaDTO findEstadoaveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkEstadoaveria();
    return estadoaveria.find(IdKEY);
  }

  @WebMethod (action="urn:findAllEstadoaveria", operationName="findAllEstadoaveria")
  public List<EstadoaveriaDTO> findAllEstadoaveria() {
    checkEstadoaveria();
    return estadoaveria.findAll();
  }

  @WebMethod (action="urn:updateEstadoaveria", operationName="updateEstadoaveria")
  public EstadoaveriaDTO updateEstadoaveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Averia") String Averia) {
    checkEstadoaveria();
    return estadoaveria.update( Id, Nombre, Averia);
  }
  @WebMethod (action="urn:insertEstadoaveria", operationName="insertEstadoaveria")
  public EstadoaveriaDTO insertEstadoaveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Averia") String Averia) {
    checkEstadoaveria();
    return estadoaveria.insert( Id, Nombre, Averia);
  }
  @WebMethod (action="urn:deleteEstadoaveria", operationName="deleteEstadoaveria")
  public EstadoaveriaDTO deleteEstadoaveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkEstadoaveria();
    return estadoaveria.delete(IdKEY);
  }
  private void checkEstadoaveria() {
    if (estadoaveria == null)
      estadoaveria = new EstadoaveriaService();
  }

  private static TipoaveriaService tipoaveria;

  @WebMethod (action="urn:findTipoaveria", operationName="findTipoaveria")
  public TipoaveriaDTO findTipoaveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkTipoaveria();
    return tipoaveria.find(IdKEY);
  }

  @WebMethod (action="urn:findAllTipoaveria", operationName="findAllTipoaveria")
  public List<TipoaveriaDTO> findAllTipoaveria() {
    checkTipoaveria();
    return tipoaveria.findAll();
  }

  @WebMethod (action="urn:updateTipoaveria", operationName="updateTipoaveria")
  public TipoaveriaDTO updateTipoaveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Averia") String Averia) {
    checkTipoaveria();
    return tipoaveria.update( Id, Nombre, Averia);
  }
  @WebMethod (action="urn:insertTipoaveria", operationName="insertTipoaveria")
  public TipoaveriaDTO insertTipoaveria(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Averia") String Averia) {
    checkTipoaveria();
    return tipoaveria.insert( Id, Nombre, Averia);
  }
  @WebMethod (action="urn:deleteTipoaveria", operationName="deleteTipoaveria")
  public TipoaveriaDTO deleteTipoaveria(@WebParam (partName = "IdKEY") String IdKEY) {
    checkTipoaveria();
    return tipoaveria.delete(IdKEY);
  }
  private void checkTipoaveria() {
    if (tipoaveria == null)
      tipoaveria = new TipoaveriaService();
  }

  private static SuscriptorService suscriptor;

  @WebMethod (action="urn:findSuscriptor", operationName="findSuscriptor")
  public SuscriptorDTO findSuscriptor(@WebParam (partName = "IdKEY") String IdKEY) {
    checkSuscriptor();
    return suscriptor.find(IdKEY);
  }

  @WebMethod (action="urn:findAllSuscriptor", operationName="findAllSuscriptor")
  public List<SuscriptorDTO> findAllSuscriptor() {
    checkSuscriptor();
    return suscriptor.findAll();
  }

  @WebMethod (action="urn:updateSuscriptor", operationName="updateSuscriptor")
  public SuscriptorDTO updateSuscriptor(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Identificacion") String Identificacion, @WebParam (partName = "Telefono") String Telefono, @WebParam (partName = "Direccion") String Direccion) {
    checkSuscriptor();
    return suscriptor.update( Id, Nombre, Identificacion, Telefono, Direccion);
  }
  @WebMethod (action="urn:insertSuscriptor", operationName="insertSuscriptor")
  public SuscriptorDTO insertSuscriptor(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Identificacion") String Identificacion, @WebParam (partName = "Telefono") String Telefono, @WebParam (partName = "Direccion") String Direccion) {
    checkSuscriptor();
    return suscriptor.insert( Id, Nombre, Identificacion, Telefono, Direccion);
  }
  @WebMethod (action="urn:deleteSuscriptor", operationName="deleteSuscriptor")
  public SuscriptorDTO deleteSuscriptor(@WebParam (partName = "IdKEY") String IdKEY) {
    checkSuscriptor();
    return suscriptor.delete(IdKEY);
  }
  private void checkSuscriptor() {
    if (suscriptor == null)
      suscriptor = new SuscriptorService();
  }

  private static SucursalService sucursal;

  @WebMethod (action="urn:findSucursal", operationName="findSucursal")
  public SucursalDTO findSucursal(@WebParam (partName = "IdKEY") String IdKEY) {
    checkSucursal();
    return sucursal.find(IdKEY);
  }

  @WebMethod (action="urn:findAllSucursal", operationName="findAllSucursal")
  public List<SucursalDTO> findAllSucursal() {
    checkSucursal();
    return sucursal.findAll();
  }

  @WebMethod (action="urn:updateSucursal", operationName="updateSucursal")
  public SucursalDTO updateSucursal(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Telefono") String Telefono, @WebParam (partName = "Ciudad") String Ciudad, @WebParam (partName = "Direccion") String Direccion, @WebParam (partName = "Encargado") String Encargado) {
    checkSucursal();
    return sucursal.update( Id, Telefono, Ciudad, Direccion, Encargado);
  }
  @WebMethod (action="urn:insertSucursal", operationName="insertSucursal")
  public SucursalDTO insertSucursal(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Telefono") String Telefono, @WebParam (partName = "Ciudad") String Ciudad, @WebParam (partName = "Direccion") String Direccion, @WebParam (partName = "Encargado") String Encargado) {
    checkSucursal();
    return sucursal.insert( Id, Telefono, Ciudad, Direccion, Encargado);
  }
  @WebMethod (action="urn:deleteSucursal", operationName="deleteSucursal")
  public SucursalDTO deleteSucursal(@WebParam (partName = "IdKEY") String IdKEY) {
    checkSucursal();
    return sucursal.delete(IdKEY);
  }
  private void checkSucursal() {
    if (sucursal == null)
      sucursal = new SucursalService();
  }

  private static RegionService region;

  @WebMethod (action="urn:findRegion", operationName="findRegion")
  public RegionDTO findRegion(@WebParam (partName = "IdKEY") String IdKEY) {
    checkRegion();
    return region.find(IdKEY);
  }

  @WebMethod (action="urn:findAllRegion", operationName="findAllRegion")
  public List<RegionDTO> findAllRegion() {
    checkRegion();
    return region.findAll();
  }

  @WebMethod (action="urn:updateRegion", operationName="updateRegion")
  public RegionDTO updateRegion(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Encargado") String Encargado, @WebParam (partName = "Sucursal") String Sucursal) {
    checkRegion();
    return region.update( Id, Encargado, Sucursal);
  }
  @WebMethod (action="urn:insertRegion", operationName="insertRegion")
  public RegionDTO insertRegion(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Encargado") String Encargado, @WebParam (partName = "Sucursal") String Sucursal) {
    checkRegion();
    return region.insert( Id, Encargado, Sucursal);
  }
  @WebMethod (action="urn:deleteRegion", operationName="deleteRegion")
  public RegionDTO deleteRegion(@WebParam (partName = "IdKEY") String IdKEY) {
    checkRegion();
    return region.delete(IdKEY);
  }
  private void checkRegion() {
    if (region == null)
      region = new RegionService();
  }

  private static CuadraService cuadra;

  @WebMethod (action="urn:findCuadra", operationName="findCuadra")
  public CuadraDTO findCuadra(@WebParam (partName = "IdKEY") String IdKEY) {
    checkCuadra();
    return cuadra.find(IdKEY);
  }

  @WebMethod (action="urn:findAllCuadra", operationName="findAllCuadra")
  public List<CuadraDTO> findAllCuadra() {
    checkCuadra();
    return cuadra.findAll();
  }

  @WebMethod (action="urn:updateCuadra", operationName="updateCuadra")
  public CuadraDTO updateCuadra(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Region") String Region) {
    checkCuadra();
    return cuadra.update( Id, Nombre, Region);
  }
  @WebMethod (action="urn:insertCuadra", operationName="insertCuadra")
  public CuadraDTO insertCuadra(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Region") String Region) {
    checkCuadra();
    return cuadra.insert( Id, Nombre, Region);
  }
  @WebMethod (action="urn:deleteCuadra", operationName="deleteCuadra")
  public CuadraDTO deleteCuadra(@WebParam (partName = "IdKEY") String IdKEY) {
    checkCuadra();
    return cuadra.delete(IdKEY);
  }
  private void checkCuadra() {
    if (cuadra == null)
      cuadra = new CuadraService();
  }

  private static TipoviviendaService tipovivienda;

  @WebMethod (action="urn:findTipovivienda", operationName="findTipovivienda")
  public TipoviviendaDTO findTipovivienda(@WebParam (partName = "IdKEY") String IdKEY) {
    checkTipovivienda();
    return tipovivienda.find(IdKEY);
  }

  @WebMethod (action="urn:findAllTipovivienda", operationName="findAllTipovivienda")
  public List<TipoviviendaDTO> findAllTipovivienda() {
    checkTipovivienda();
    return tipovivienda.findAll();
  }

  @WebMethod (action="urn:updateTipovivienda", operationName="updateTipovivienda")
  public TipoviviendaDTO updateTipovivienda(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre ") String Nombre , @WebParam (partName = "Servicio") String Servicio) {
    checkTipovivienda();
    return tipovivienda.update( Id, Nombre , Servicio);
  }
  @WebMethod (action="urn:insertTipovivienda", operationName="insertTipovivienda")
  public TipoviviendaDTO insertTipovivienda(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre ") String Nombre , @WebParam (partName = "Servicio") String Servicio) {
    checkTipovivienda();
    return tipovivienda.insert( Id, Nombre , Servicio);
  }
  @WebMethod (action="urn:deleteTipovivienda", operationName="deleteTipovivienda")
  public TipoviviendaDTO deleteTipovivienda(@WebParam (partName = "IdKEY") String IdKEY) {
    checkTipovivienda();
    return tipovivienda.delete(IdKEY);
  }
  private void checkTipovivienda() {
    if (tipovivienda == null)
      tipovivienda = new TipoviviendaService();
  }

  private static InstalacionService instalacion;

  @WebMethod (action="urn:findInstalacion", operationName="findInstalacion")
  public InstalacionDTO findInstalacion(@WebParam (partName = "IdKEY") String IdKEY) {
    checkInstalacion();
    return instalacion.find(IdKEY);
  }

  @WebMethod (action="urn:findAllInstalacion", operationName="findAllInstalacion")
  public List<InstalacionDTO> findAllInstalacion() {
    checkInstalacion();
    return instalacion.findAll();
  }

  @WebMethod (action="urn:updateInstalacion", operationName="updateInstalacion")
  public InstalacionDTO updateInstalacion(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "NumConcent") String NumConcent, @WebParam (partName = "CantMetCable") String CantMetCable, @WebParam (partName = "InsPropia") String InsPropia, @WebParam (partName = "CantTel") String CantTel) {
    checkInstalacion();
    return instalacion.update( Id, NumConcent, CantMetCable, InsPropia, CantTel);
  }
  @WebMethod (action="urn:insertInstalacion", operationName="insertInstalacion")
  public InstalacionDTO insertInstalacion(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "NumConcent") String NumConcent, @WebParam (partName = "CantMetCable") String CantMetCable, @WebParam (partName = "InsPropia") String InsPropia, @WebParam (partName = "CantTel") String CantTel) {
    checkInstalacion();
    return instalacion.insert( Id, NumConcent, CantMetCable, InsPropia, CantTel);
  }
  @WebMethod (action="urn:deleteInstalacion", operationName="deleteInstalacion")
  public InstalacionDTO deleteInstalacion(@WebParam (partName = "IdKEY") String IdKEY) {
    checkInstalacion();
    return instalacion.delete(IdKEY);
  }
  private void checkInstalacion() {
    if (instalacion == null)
      instalacion = new InstalacionService();
  }

  private static EstadoservService estadoserv;

  @WebMethod (action="urn:findEstadoserv", operationName="findEstadoserv")
  public EstadoservDTO findEstadoserv(@WebParam (partName = "IdKEY") String IdKEY) {
    checkEstadoserv();
    return estadoserv.find(IdKEY);
  }

  @WebMethod (action="urn:findAllEstadoserv", operationName="findAllEstadoserv")
  public List<EstadoservDTO> findAllEstadoserv() {
    checkEstadoserv();
    return estadoserv.findAll();
  }

  @WebMethod (action="urn:updateEstadoserv", operationName="updateEstadoserv")
  public EstadoservDTO updateEstadoserv(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Servicio") String Servicio) {
    checkEstadoserv();
    return estadoserv.update( Id, Nombre, Servicio);
  }
  @WebMethod (action="urn:insertEstadoserv", operationName="insertEstadoserv")
  public EstadoservDTO insertEstadoserv(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Servicio") String Servicio) {
    checkEstadoserv();
    return estadoserv.insert( Id, Nombre, Servicio);
  }
  @WebMethod (action="urn:deleteEstadoserv", operationName="deleteEstadoserv")
  public EstadoservDTO deleteEstadoserv(@WebParam (partName = "IdKEY") String IdKEY) {
    checkEstadoserv();
    return estadoserv.delete(IdKEY);
  }
  private void checkEstadoserv() {
    if (estadoserv == null)
      estadoserv = new EstadoservService();
  }

  private static ServicioextraService servicioextra;

  @WebMethod (action="urn:findServicioextra", operationName="findServicioextra")
  public ServicioextraDTO findServicioextra(@WebParam (partName = "IdKEY") String IdKEY) {
    checkServicioextra();
    return servicioextra.find(IdKEY);
  }

  @WebMethod (action="urn:findAllServicioextra", operationName="findAllServicioextra")
  public List<ServicioextraDTO> findAllServicioextra() {
    checkServicioextra();
    return servicioextra.findAll();
  }

  @WebMethod (action="urn:updateServicioextra", operationName="updateServicioextra")
  public ServicioextraDTO updateServicioextra(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Servicio") String Servicio) {
    checkServicioextra();
    return servicioextra.update( Id, Nombre, Servicio);
  }
  @WebMethod (action="urn:insertServicioextra", operationName="insertServicioextra")
  public ServicioextraDTO insertServicioextra(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "Nombre") String Nombre, @WebParam (partName = "Servicio") String Servicio) {
    checkServicioextra();
    return servicioextra.insert( Id, Nombre, Servicio);
  }
  @WebMethod (action="urn:deleteServicioextra", operationName="deleteServicioextra")
  public ServicioextraDTO deleteServicioextra(@WebParam (partName = "IdKEY") String IdKEY) {
    checkServicioextra();
    return servicioextra.delete(IdKEY);
  }
  private void checkServicioextra() {
    if (servicioextra == null)
      servicioextra = new ServicioextraService();
  }

  private static ServicioService servicio;

  @WebMethod (action="urn:findServicio", operationName="findServicio")
  public ServicioDTO findServicio(@WebParam (partName = "IdKEY") String IdKEY) {
    checkServicio();
    return servicio.find(IdKEY);
  }

  @WebMethod (action="urn:findAllServicio", operationName="findAllServicio")
  public List<ServicioDTO> findAllServicio() {
    checkServicio();
    return servicio.findAll();
  }

  @WebMethod (action="urn:updateServicio", operationName="updateServicio")
  public ServicioDTO updateServicio(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "FechaInst") String FechaInst, @WebParam (partName = "Direccion") String Direccion, @WebParam (partName = "Region") String Region, @WebParam (partName = "Suscriptor") String Suscriptor) {
    checkServicio();
    return servicio.update( Id, FechaInst, Direccion, Region, Suscriptor);
  }
  @WebMethod (action="urn:insertServicio", operationName="insertServicio")
  public ServicioDTO insertServicio(
 @WebParam (partName = "Id") String Id, @WebParam (partName = "FechaInst") String FechaInst, @WebParam (partName = "Direccion") String Direccion, @WebParam (partName = "Region") String Region, @WebParam (partName = "Suscriptor") String Suscriptor) {
    checkServicio();
    return servicio.insert( Id, FechaInst, Direccion, Region, Suscriptor);
  }
  @WebMethod (action="urn:deleteServicio", operationName="deleteServicio")
  public ServicioDTO deleteServicio(@WebParam (partName = "IdKEY") String IdKEY) {
    checkServicio();
    return servicio.delete(IdKEY);
  }
  private void checkServicio() {
    if (servicio == null)
      servicio = new ServicioService();
  }
}
