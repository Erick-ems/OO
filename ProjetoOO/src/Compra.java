
public class Compra {
  private float oferta;
  private String dataOferta;


  public Compra(float varOferta, String varDataOferta){
    oferta = varOferta;
    dataOferta = varDataOferta;
  }


  public float getOferta() {
    return oferta;
  }
  public void setOferta(float oferta) {
    this.oferta = oferta;
  }

  public String getDataOferta() {
    return dataOferta;
  }
  public void setDataOferta(String dataOferta) {
    this.dataOferta = dataOferta;
  }
  @Override
  public String toString() {
    return "Oferta: " + oferta + "Data da Oferta: " + dataOferta;
  }

}