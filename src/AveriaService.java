package servicio;
import java.util.*;
public class AveriaService {
private Map<String,AveriaDTO> averias;
private static String[][] data = {
{"1","Averia  de prueba","01/09/2012","1"}};

   /** 
   * Constructor de la clase Averia . 
   */
  AveriaService() {
    averias = new HashMap<String,AveriaDTO>();
    for (int i=0;i<data.length;i++) {
      AveriaDTO temp = new AveriaDTO();
      temp.setId(data[i][0]);
      temp.setDescripcion(data[i][1]);
      temp.setFecha(data[i][2]);
      temp.setServicio(data[i][3]);
      averias.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Averia.
   */
  protected AveriaDTO find(String idKEY) {
    if (averias.containsKey(idKEY))
      return (AveriaDTO)averias.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Averia.
   */
protected AveriaDTO insert( String id, String descripcion, String fecha, String servicio) {
      AveriaDTO temp = new AveriaDTO();
      temp.setId(id);
      temp.setDescripcion(descripcion);
      temp.setFecha(fecha);
      temp.setServicio(servicio);
      averias.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Averia.
   */
protected AveriaDTO update(
 String id, String descripcion, String fecha, String servicio) {
      AveriaDTO temp =  (AveriaDTO) averias.remove(id);
      temp.setId(id);
      temp.setDescripcion(descripcion);
      temp.setFecha(fecha);
      temp.setServicio(servicio);
      averias.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Averia.
   */
protected AveriaDTO delete(String id) {
      return   (AveriaDTO) averias.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Averia. 
   */
  protected List<AveriaDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = averias.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(averias.get(key));
   }
    return resultado;
  }
 }
