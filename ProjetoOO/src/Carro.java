
public class Carro {


  private String nome;
  private int ano;
  private String marca;
  private String estilo;
  private String categoria;
  private float quilometragem;

  public Carro(String varNomeCar, int varAno, String varMarca, String varEstilo, String varCategoria, float varQuilometragem) {

    nome = varNomeCar;
    ano = varAno;
    marca = varMarca;
    estilo = varEstilo;
    categoria = varCategoria;
    quilometragem = varQuilometragem;
  }

  public String toString(){
    return "Nome do carro: " + nome;
  }


  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }


  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;

  }

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getEstilo() {
    return estilo;
  }
  public void setEstilo(String estilo) {
    this.estilo = estilo;
  }

  public String getCategoia() {
    return categoria;
  }
  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public float getQuilometragem() {
    return quilometragem;
  }
  public void setQuilometragem(float quilometragem) {
    this.quilometragem = quilometragem;
  }


}
