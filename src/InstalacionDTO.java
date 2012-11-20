package servicio;

public class InstalacionDTO {
  String id;
  String numconcent;
  String cantmetcable;
  String inspropia;
  String canttel;
  public void setId(String id){this.id=id;}
  public void setNumConcent(String numconcent){this.numconcent=numconcent;}
  public void setCantMetCable(String cantmetcable){this.cantmetcable=cantmetcable;}
  public void setInsPropia(String inspropia){this.inspropia=inspropia;}
  public void setCantTel(String canttel){this.canttel=canttel;}
  public String getId() { return id;}
  public String getNumConcent() { return numconcent;}
  public String getCantMetCable() { return cantmetcable;}
  public String getInsPropia() { return inspropia;}
  public String getCantTel() { return canttel;}
}
