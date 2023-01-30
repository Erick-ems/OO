package model;

/**
 * Classe ControleCarrp faz o controle de todos os dados cadastrados.
 * @author Erick Miranda Santos
 * @since 2023
 * @version 1.0
 */

public class Carro extends Veiculo{


	private String marca;
	private String estilo;
	private String categoria;

	/**
	 * Construtor Carro.
	 * @param nome
	 * @param ano
	 * @param marca
	 * @param estilo
	 * @param categoria
	 * @param quilometragem
	 * @param preço
	 */

	public Carro(String nome, int ano, String marca, String estilo, String categoria, String quilometragem,
			String preco) {
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		this.estilo = estilo;
		this.categoria = categoria;
		this.quilometragem = quilometragem;
		this.preco = preco;

	}
	
	/**
	 * Sobrecarga do construtor Carro sem o dado de estilo, categoria, quilometragem, preco.
	 * @param nome
	 * @param ano
	 * @param marca
 */
	
	public Carro(String nome, int ano, String marca) {
		this(nome, ano, "", "", "", "", marca);
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Carro{" + "nome='" + nome + '\'' + ", ano=" + ano + ", marca='" + marca + '\'' + ", estilo='" + estilo
				+ '\'' + ", categoria='" + categoria + '\'' + ", quilometragem='" + quilometragem + '\'' + ", preco="
				+ preco + "\" " + '}';
	}
}
