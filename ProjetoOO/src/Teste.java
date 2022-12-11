public class Teste {
	static Catalogo varCatalogo;
	static Carro varCarro;
	static Compra varCompra;
	static Venda varVenda;
  static PessoaFisica varPessoaFisica;
  static PessoaJuridica varPessoaJuridica;


  public static void main(String[] args) {

    varCatalogo = new Catalogo("celtinha", 8);



    System.out.println(varCatalogo.toString());
  }
}