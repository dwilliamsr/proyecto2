package servicio;

public class SucursalDTO {
  String id;
  String telefono;
  String ciudad;
  String direccion;
  String encargado;
  public void setId(String id){this.id=id;}
  public void setTelefono(String telefono){this.telefono=telefono;}
  public void setCiudad(String ciudad){this.ciudad=ciudad;}
  public void setDireccion(String direccion){this.direccion=direccion;}
  public void setEncargado(String encargado){this.encargado=encargado;}
  public String getId() { return id;}
  public String getTelefono() { return telefono;}
  public String getCiudad() { return ciudad;}
  public String getDireccion() { return direccion;}
  public String getEncargado() { return encargado;}
}
