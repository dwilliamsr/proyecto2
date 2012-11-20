package servicio;
import java.util.*;
public class TipoaveriaService {
private Map<String,TipoaveriaDTO> tiposaveria;
private static String[][] data = {
{"1","Tipo de Averia de Prueba","1"}};

   /** 
   * Constructor de la clase Tipoaveria . 
   */
  TipoaveriaService() {
    tiposaveria = new HashMap<String,TipoaveriaDTO>();
    for (int i=0;i<data.length;i++) {
      TipoaveriaDTO temp = new TipoaveriaDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setAveria(data[i][2]);
      tiposaveria.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Tipoaveria.
   */
  protected TipoaveriaDTO find(String idKEY) {
    if (tiposaveria.containsKey(idKEY))
      return (TipoaveriaDTO)tiposaveria.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Tipoaveria.
   */
protected TipoaveriaDTO insert( String id, String nombre, String averia) {
      TipoaveriaDTO temp = new TipoaveriaDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setAveria(averia);
      tiposaveria.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Tipoaveria.
   */
protected TipoaveriaDTO update(
 String id, String nombre, String averia) {
      TipoaveriaDTO temp =  (TipoaveriaDTO) tiposaveria.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setAveria(averia);
      tiposaveria.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Tipoaveria.
   */
protected TipoaveriaDTO delete(String id) {
      return   (TipoaveriaDTO) tiposaveria.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Tipoaveria. 
   */
  protected List<TipoaveriaDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = tiposaveria.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(tiposaveria.get(key));
   }
    return resultado;
  }
 }
