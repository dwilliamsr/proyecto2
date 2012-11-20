package servicio;

public class ServicioDTO {
  String id;
  String fechainst;
  String direccion;
  String region;
  String suscriptor;
  public void setId(String id){this.id=id;}
  public void setFechaInst(String fechainst){this.fechainst=fechainst;}
  public void setDireccion(String direccion){this.direccion=direccion;}
  public void setRegion(String region){this.region=region;}
  public void setSuscriptor(String suscriptor){this.suscriptor=suscriptor;}
  public String getId() { return id;}
  public String getFechaInst() { return fechainst;}
  public String getDireccion() { return direccion;}
  public String getRegion() { return region;}
  public String getSuscriptor() { return suscriptor;}
}
