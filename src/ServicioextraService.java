package servicio;
import java.util.*;
public class ServicioextraService {
private Map<String,ServicioextraDTO> serviciosextra;
private static String[][] data = {
{"1","Servicio Extra Cliente 1","1"},{"2","Servicio Extra Cliente 2","2"}};

   /** 
   * Constructor de la clase Servicioextra . 
   */
  ServicioextraService() {
    serviciosextra = new HashMap<String,ServicioextraDTO>();
    for (int i=0;i<data.length;i++) {
      ServicioextraDTO temp = new ServicioextraDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setServicio(data[i][2]);
      serviciosextra.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Servicioextra.
   */
  protected ServicioextraDTO find(String idKEY) {
    if (serviciosextra.containsKey(idKEY))
      return (ServicioextraDTO)serviciosextra.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Servicioextra.
   */
protected ServicioextraDTO insert( String id, String nombre, String servicio) {
      ServicioextraDTO temp = new ServicioextraDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setServicio(servicio);
      serviciosextra.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Servicioextra.
   */
protected ServicioextraDTO update(
 String id, String nombre, String servicio) {
      ServicioextraDTO temp =  (ServicioextraDTO) serviciosextra.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setServicio(servicio);
      serviciosextra.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Servicioextra.
   */
protected ServicioextraDTO delete(String id) {
      return   (ServicioextraDTO) serviciosextra.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Servicioextra. 
   */
  protected List<ServicioextraDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = serviciosextra.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(serviciosextra.get(key));
   }
    return resultado;
  }
 }
