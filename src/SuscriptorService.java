package servicio;
import java.util.*;
public class SuscriptorService {
private Map<String,SuscriptorDTO> suscriptores;
private static String[][] data = {
{"1","Suscriptor de Prueba","123456789","2222-2222","No Disponible"}};

   /** 
   * Constructor de la clase Suscriptor . 
   */
  SuscriptorService() {
    suscriptores = new HashMap<String,SuscriptorDTO>();
    for (int i=0;i<data.length;i++) {
      SuscriptorDTO temp = new SuscriptorDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setIdentificacion(data[i][2]);
      temp.setTelefono(data[i][3]);
      temp.setDireccion(data[i][4]);
      suscriptores.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Suscriptor.
   */
  protected SuscriptorDTO find(String idKEY) {
    if (suscriptores.containsKey(idKEY))
      return (SuscriptorDTO)suscriptores.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Suscriptor.
   */
protected SuscriptorDTO insert( String id, String nombre, String identificacion, String telefono, String direccion) {
      SuscriptorDTO temp = new SuscriptorDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setIdentificacion(identificacion);
      temp.setTelefono(telefono);
      temp.setDireccion(direccion);
      suscriptores.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Suscriptor.
   */
protected SuscriptorDTO update(
 String id, String nombre, String identificacion, String telefono, String direccion) {
      SuscriptorDTO temp =  (SuscriptorDTO) suscriptores.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setIdentificacion(identificacion);
      temp.setTelefono(telefono);
      temp.setDireccion(direccion);
      suscriptores.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Suscriptor.
   */
protected SuscriptorDTO delete(String id) {
      return   (SuscriptorDTO) suscriptores.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Suscriptor. 
   */
  protected List<SuscriptorDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = suscriptores.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(suscriptores.get(key));
   }
    return resultado;
  }
 }
