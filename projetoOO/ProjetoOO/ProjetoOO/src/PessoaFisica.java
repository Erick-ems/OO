
public class PessoaFisica extends Pessoa {
  private String cpf;
  private int idade;
  private String rg;

  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getRg() {
    return rg;
  }
  public void setRg(String rg) {
    this.rg = rg;
  }

}