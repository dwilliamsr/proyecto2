package servicio;
import java.util.*;
public class RegionService {
private Map<String,RegionDTO> regiones;
private static String[][] data = {
{"1","Encargado de Region 01","1"}};

   /** 
   * Constructor de la clase Region . 
   */
  RegionService() {
    regiones = new HashMap<String,RegionDTO>();
    for (int i=0;i<data.length;i++) {
      RegionDTO temp = new RegionDTO();
      temp.setId(data[i][0]);
      temp.setEncargado(data[i][1]);
      temp.setSucursal(data[i][2]);
      regiones.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Region.
   */
  protected RegionDTO find(String idKEY) {
    if (regiones.containsKey(idKEY))
      return (RegionDTO)regiones.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Region.
   */
protected RegionDTO insert( String id, String encargado, String sucursal) {
      RegionDTO temp = new RegionDTO();
      temp.setId(id);
      temp.setEncargado(encargado);
      temp.setSucursal(sucursal);
      regiones.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Region.
   */
protected RegionDTO update(
 String id, String encargado, String sucursal) {
      RegionDTO temp =  (RegionDTO) regiones.remove(id);
      temp.setId(id);
      temp.setEncargado(encargado);
      temp.setSucursal(sucursal);
      regiones.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Region.
   */
protected RegionDTO delete(String id) {
      return   (RegionDTO) regiones.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Region. 
   */
  protected List<RegionDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = regiones.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(regiones.get(key));
   }
    return resultado;
  }
 }
