
public class Catalogo {
  private String modelo;
  private long preco;


  public Catalogo(String varModelo, long varPreco) {
    modelo = varModelo;
    preco = varPreco;
  }
    @Override
    public String toString(){
      return "Modelo:" + this.modelo + ", Preco:" + this.preco;
    }

  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public long getPreco() {
    return preco;
  }
  public void setPreco(long preco) {
    this.preco = preco;
  }
}
