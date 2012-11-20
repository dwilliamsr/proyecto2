package servicio;
import java.util.*;
public class EstadoservService {
private Map<String,EstadoservDTO> estadosserv;
private static String[][] data = {
{"1","Servicio Premium","1"}};

   /** 
   * Constructor de la clase Estadoserv . 
   */
  EstadoservService() {
    estadosserv = new HashMap<String,EstadoservDTO>();
    for (int i=0;i<data.length;i++) {
      EstadoservDTO temp = new EstadoservDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setServicio(data[i][2]);
      estadosserv.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Estadoserv.
   */
  protected EstadoservDTO find(String idKEY) {
    if (estadosserv.containsKey(idKEY))
      return (EstadoservDTO)estadosserv.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Estadoserv.
   */
protected EstadoservDTO insert( String id, String nombre, String servicio) {
      EstadoservDTO temp = new EstadoservDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setServicio(servicio);
      estadosserv.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Estadoserv.
   */
protected EstadoservDTO update(
 String id, String nombre, String servicio) {
      EstadoservDTO temp =  (EstadoservDTO) estadosserv.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setServicio(servicio);
      estadosserv.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Estadoserv.
   */
protected EstadoservDTO delete(String id) {
      return   (EstadoservDTO) estadosserv.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Estadoserv. 
   */
  protected List<EstadoservDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = estadosserv.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(estadosserv.get(key));
   }
    return resultado;
  }
 }
