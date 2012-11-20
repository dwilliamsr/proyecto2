package servicio;
import java.util.*;
public class InstalacionService {
private Map<String,InstalacionDTO> instalaciones;
private static String[][] data = {
{"1","1","10","S","2"}};

   /** 
   * Constructor de la clase Instalacion . 
   */
  InstalacionService() {
    instalaciones = new HashMap<String,InstalacionDTO>();
    for (int i=0;i<data.length;i++) {
      InstalacionDTO temp = new InstalacionDTO();
      temp.setId(data[i][0]);
      temp.setNumConcent(data[i][1]);
      temp.setCantMetCable(data[i][2]);
      temp.setInsPropia(data[i][3]);
      temp.setCantTel(data[i][4]);
      instalaciones.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Instalacion.
   */
  protected InstalacionDTO find(String idKEY) {
    if (instalaciones.containsKey(idKEY))
      return (InstalacionDTO)instalaciones.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Instalacion.
   */
protected InstalacionDTO insert( String id, String numconcent, String cantmetcable, String inspropia, String canttel) {
      InstalacionDTO temp = new InstalacionDTO();
      temp.setId(id);
      temp.setNumConcent(numconcent);
      temp.setCantMetCable(cantmetcable);
      temp.setInsPropia(inspropia);
      temp.setCantTel(canttel);
      instalaciones.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Instalacion.
   */
protected InstalacionDTO update(
 String id, String numconcent, String cantmetcable, String inspropia, String canttel) {
      InstalacionDTO temp =  (InstalacionDTO) instalaciones.remove(id);
      temp.setId(id);
      temp.setNumConcent(numconcent);
      temp.setCantMetCable(cantmetcable);
      temp.setInsPropia(inspropia);
      temp.setCantTel(canttel);
      instalaciones.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Instalacion.
   */
protected InstalacionDTO delete(String id) {
      return   (InstalacionDTO) instalaciones.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Instalacion. 
   */
  protected List<InstalacionDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = instalaciones.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(instalaciones.get(key));
   }
    return resultado;
  }
 }
