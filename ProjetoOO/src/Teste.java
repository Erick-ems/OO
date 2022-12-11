public class Teste {
	static Catalogo varCatalogo;
	static Carro varCarro;
	static Compra varCompra;
	static Venda varVenda;
  static PessoaFisica varPessoaFisica;
  static PessoaJuridica varPessoaJuridica;


  public static void main(String[] args) {




    varCatalogo = new Catalogo("sedã", 8);
    varCarro = new Carro("celtinha",2008, "chevrolet", "economico", "hatch", 19000 );
    varVenda = new Venda(1800, "14/10/1900", 1555);
    varCompra = new Compra(1500, "15/10/1900");



    System.out.println(varVenda.toString());
    System.out.println(varCatalogo.toString());
    System.out.println(varCarro.toString());

  }
}