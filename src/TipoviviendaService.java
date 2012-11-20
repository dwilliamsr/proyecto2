package servicio;
import java.util.*;
public class TipoviviendaService {
private Map<String,TipoviviendaDTO> tiposvivienda;
private static String[][] data = {
{"1","Vivienda Estandar","1"}};

   /** 
   * Constructor de la clase Tipovivienda . 
   */
  TipoviviendaService() {
    tiposvivienda = new HashMap<String,TipoviviendaDTO>();
    for (int i=0;i<data.length;i++) {
      TipoviviendaDTO temp = new TipoviviendaDTO();
      temp.setId(data[i][0]);
      temp.setNombre (data[i][1]);
      temp.setServicio(data[i][2]);
      tiposvivienda.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Tipovivienda.
   */
  protected TipoviviendaDTO find(String idKEY) {
    if (tiposvivienda.containsKey(idKEY))
      return (TipoviviendaDTO)tiposvivienda.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Tipovivienda.
   */
protected TipoviviendaDTO insert( String id, String nombre , String servicio) {
      TipoviviendaDTO temp = new TipoviviendaDTO();
      temp.setId(id);
      temp.setNombre (nombre );
      temp.setServicio(servicio);
      tiposvivienda.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Tipovivienda.
   */
protected TipoviviendaDTO update(
 String id, String nombre , String servicio) {
      TipoviviendaDTO temp =  (TipoviviendaDTO) tiposvivienda.remove(id);
      temp.setId(id);
      temp.setNombre (nombre );
      temp.setServicio(servicio);
      tiposvivienda.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Tipovivienda.
   */
protected TipoviviendaDTO delete(String id) {
      return   (TipoviviendaDTO) tiposvivienda.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Tipovivienda. 
   */
  protected List<TipoviviendaDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = tiposvivienda.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(tiposvivienda.get(key));
   }
    return resultado;
  }
 }
