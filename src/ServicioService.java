package servicio;
import java.util.*;
public class ServicioService {
private Map<String,ServicioDTO> servicios;
private static String[][] data = {
{"1","05/08/2012","Calle X, Avenida Y, Casa 123","1","1"},{"2","02/08/2012","Calle X, Avenida Y, Casa 222","2","2"}};

   /** 
   * Constructor de la clase Servicio . 
   */
  ServicioService() {
    servicios = new HashMap<String,ServicioDTO>();
    for (int i=0;i<data.length;i++) {
      ServicioDTO temp = new ServicioDTO();
      temp.setId(data[i][0]);
      temp.setFechaInst(data[i][1]);
      temp.setDireccion(data[i][2]);
      temp.setRegion(data[i][3]);
      temp.setSuscriptor(data[i][4]);
      servicios.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Servicio.
   */
  protected ServicioDTO find(String idKEY) {
    if (servicios.containsKey(idKEY))
      return (ServicioDTO)servicios.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Servicio.
   */
protected ServicioDTO insert( String id, String fechainst, String direccion, String region, String suscriptor) {
      ServicioDTO temp = new ServicioDTO();
      temp.setId(id);
      temp.setFechaInst(fechainst);
      temp.setDireccion(direccion);
      temp.setRegion(region);
      temp.setSuscriptor(suscriptor);
      servicios.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Servicio.
   */
protected ServicioDTO update(
 String id, String fechainst, String direccion, String region, String suscriptor) {
      ServicioDTO temp =  (ServicioDTO) servicios.remove(id);
      temp.setId(id);
      temp.setFechaInst(fechainst);
      temp.setDireccion(direccion);
      temp.setRegion(region);
      temp.setSuscriptor(suscriptor);
      servicios.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Servicio.
   */
protected ServicioDTO delete(String id) {
      return   (ServicioDTO) servicios.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Servicio. 
   */
  protected List<ServicioDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = servicios.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(servicios.get(key));
   }
    return resultado;
  }
 }