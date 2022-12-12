public class Teste {
	static Catalogo varCatalogo;
	static Carro varCarro;
	static Compra varCompra;
	static Venda varVenda;
  static PessoaFisica varPessoaFisica;
  static PessoaJuridica varPessoaJuridica;


  public static void main(String[] args) {


    varPessoaFisica = new PessoaFisica("JOAOB|","000.000.000.00|", 18, "0000000", "844058600|", 6188889, "emailmail@email.com" );
    varPessoaJuridica = new PessoaJuridica("CARPLAY|", "9999999999999|", "38102383810|", 619999, "email@email.com");

    varCatalogo = new Catalogo("seda|", 8);
    varCarro = new Carro("celtinha|",2008, "|chevrolet|", "economico|", "hatch|", 19000 );

    varVenda = new Venda(1800, "14/10/1900", 1555);
    varCompra = new Compra(1500, "15/10/1900");



    System.out.println(varVenda.toString());
    System.out.println(varCatalogo.toString());
    System.out.println(varCarro.toString());
    System.out.println(varPessoaFisica.toString());
    System.out.println(varPessoaJuridica.toString());
  }
}