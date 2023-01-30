package model;

public abstract class Veiculo {
	
	/**
	 * Classe ControleCarrp faz o controle de todos os dados cadastrados.
	 * @author Erick Miranda Santos 
	 * @since 2023
	 * @version 1.0
	 */

	
	protected String nome;
	protected int ano;
	protected String quilometragem;
	protected String preco;
	
	
	
	public Veiculo() {
		super();
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

}
