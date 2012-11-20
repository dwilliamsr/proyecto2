package servicio;
import java.util.*;
public class EstadoaveriaService {
private Map<String,EstadoaveriaDTO> estadosaveria;
private static String[][] data = {
{"1","Estado de Averia de prueba","1"}};

   /** 
   * Constructor de la clase Estadoaveria . 
   */
  EstadoaveriaService() {
    estadosaveria = new HashMap<String,EstadoaveriaDTO>();
    for (int i=0;i<data.length;i++) {
      EstadoaveriaDTO temp = new EstadoaveriaDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setAveria(data[i][2]);
      estadosaveria.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Estadoaveria.
   */
  protected EstadoaveriaDTO find(String idKEY) {
    if (estadosaveria.containsKey(idKEY))
      return (EstadoaveriaDTO)estadosaveria.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Estadoaveria.
   */
protected EstadoaveriaDTO insert( String id, String nombre, String averia) {
      EstadoaveriaDTO temp = new EstadoaveriaDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setAveria(averia);
      estadosaveria.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Estadoaveria.
   */
protected EstadoaveriaDTO update(
 String id, String nombre, String averia) {
      EstadoaveriaDTO temp =  (EstadoaveriaDTO) estadosaveria.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setAveria(averia);
      estadosaveria.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Estadoaveria.
   */
protected EstadoaveriaDTO delete(String id) {
      return   (EstadoaveriaDTO) estadosaveria.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Estadoaveria. 
   */
  protected List<EstadoaveriaDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = estadosaveria.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(estadosaveria.get(key));
   }
    return resultado;
  }
 }
