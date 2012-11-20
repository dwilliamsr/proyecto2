package servicio;
import java.util.*;
public class SucursalService {
private Map<String,SucursalDTO> sucursales;
private static String[][] data = {
{"1","3333-3333","San Jose","Calle X, Avenida Y","Encargado de Prueba 02"}};

   /** 
   * Constructor de la clase Sucursal . 
   */
  SucursalService() {
    sucursales = new HashMap<String,SucursalDTO>();
    for (int i=0;i<data.length;i++) {
      SucursalDTO temp = new SucursalDTO();
      temp.setId(data[i][0]);
      temp.setTelefono(data[i][1]);
      temp.setCiudad(data[i][2]);
      temp.setDireccion(data[i][3]);
      temp.setEncargado(data[i][4]);
      sucursales.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Sucursal.
   */
  protected SucursalDTO find(String idKEY) {
    if (sucursales.containsKey(idKEY))
      return (SucursalDTO)sucursales.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Sucursal.
   */
protected SucursalDTO insert( String id, String telefono, String ciudad, String direccion, String encargado) {
      SucursalDTO temp = new SucursalDTO();
      temp.setId(id);
      temp.setTelefono(telefono);
      temp.setCiudad(ciudad);
      temp.setDireccion(direccion);
      temp.setEncargado(encargado);
      sucursales.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Sucursal.
   */
protected SucursalDTO update(
 String id, String telefono, String ciudad, String direccion, String encargado) {
      SucursalDTO temp =  (SucursalDTO) sucursales.remove(id);
      temp.setId(id);
      temp.setTelefono(telefono);
      temp.setCiudad(ciudad);
      temp.setDireccion(direccion);
      temp.setEncargado(encargado);
      sucursales.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Sucursal.
   */
protected SucursalDTO delete(String id) {
      return   (SucursalDTO) sucursales.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Sucursal. 
   */
  protected List<SucursalDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = sucursales.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(sucursales.get(key));
   }
    return resultado;
  }
 }
