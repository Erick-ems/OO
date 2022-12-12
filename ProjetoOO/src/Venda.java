
public class Venda {
  private float precoVenda;
  private String dataVenda;
  private int quantidade;


  public Venda(float varPrecoVenda, String varDataVenda, int varQuantidade) {
    precoVenda = varPrecoVenda;
    dataVenda = varDataVenda;
    quantidade = varQuantidade;
  }

  public float getPrecoVenda() {
    return precoVenda;
  }
  public void setPrecoVenda(float precoVenda) {
    this.precoVenda = precoVenda;
  }

  public String getDataVenda() {
    return dataVenda;
  }
  public void setDataVenda(String dataVenda) {
    this.dataVenda = dataVenda;
  }

  public int getquantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    return " Preco de Venda: " + this.precoVenda + " Data de venda: " + this.dataVenda + " Quantidade: " + this.quantidade;
  }
}