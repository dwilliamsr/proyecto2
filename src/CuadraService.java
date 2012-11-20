package servicio;
import java.util.*;
public class CuadraService {
private Map<String,CuadraDTO> cuadras;
private static String[][] data = {
{"1","Cuadra 001","1"}};

   /** 
   * Constructor de la clase Cuadra . 
   */
  CuadraService() {
    cuadras = new HashMap<String,CuadraDTO>();
    for (int i=0;i<data.length;i++) {
      CuadraDTO temp = new CuadraDTO();
      temp.setId(data[i][0]);
      temp.setNombre(data[i][1]);
      temp.setRegion(data[i][2]);
      cuadras.put(temp.getId(),temp);
    }
  }

   /** 
   * Obtiene la instancia específica de un objeto de la clase Cuadra.
   */
  protected CuadraDTO find(String idKEY) {
    if (cuadras.containsKey(idKEY))
      return (CuadraDTO)cuadras.get(idKEY);
    else
      return null;
  }
   /** 
   * Crea una instancia específica de un objeto de la clase Cuadra.
   */
protected CuadraDTO insert( String id, String nombre, String region) {
      CuadraDTO temp = new CuadraDTO();
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setRegion(region);
      cuadras.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Actualiza una instancia específica de un objeto de la clase Cuadra.
   */
protected CuadraDTO update(
 String id, String nombre, String region) {
      CuadraDTO temp =  (CuadraDTO) cuadras.remove(id);
      temp.setId(id);
      temp.setNombre(nombre);
      temp.setRegion(region);
      cuadras.put(temp.getId(),temp);
      return temp;
}

   /** 
   * Permite el borrado de una instancia específica de un objeto de la clase Cuadra.
   */
protected CuadraDTO delete(String id) {
      return   (CuadraDTO) cuadras.remove(id);
   }

   /** 
   * Obtiene la instancia de todos los objetos de la clase Cuadra. 
   */
  protected List<CuadraDTO> findAll() {
    List resultado = new ArrayList();
    for(Iterator<String> it = cuadras.keySet().iterator();it.hasNext();) {
      String key = it.next();
      resultado.add(cuadras.get(key));
   }
    return resultado;
  }
 }
