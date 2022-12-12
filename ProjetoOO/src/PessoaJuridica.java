
public class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String nomeFantasia;


  public PessoaJuridica(String varNomeFantasia, String varCnpj) {
    cnpj = varCnpj;
    nomeFantasia = varNomeFantasia;
  }

  @Override
  public String toString(){
    return "Nome Fantasia: " + nomeFantasia + " Cnpj: " + cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }


  public String getNomefantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String NomeFantasia) {
    this.nomeFantasia = NomeFantasia;
  }

}