package servicio;

public class SuscriptorDTO {
  String id;
  String nombre;
  String identificacion;
  String telefono;
  String direccion;
  public void setId(String id){this.id=id;}
  public void setNombre(String nombre){this.nombre=nombre;}
  public void setIdentificacion(String identificacion){this.identificacion=identificacion;}
  public void setTelefono(String telefono){this.telefono=telefono;}
  public void setDireccion(String direccion){this.direccion=direccion;}
  public String getId() { return id;}
  public String getNombre() { return nombre;}
  public String getIdentificacion() { return identificacion;}
  public String getTelefono() { return telefono;}
  public String getDireccion() { return direccion;}
}
