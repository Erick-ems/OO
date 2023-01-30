package controll;

import model.Carro;
import model.Dados;

public class ControleDados {
	// Instanciamos a variavel para armazenar os dados da classe
	private Dados d = new Dados();

	// Inicializa o contrutor da clase
	public ControleDados() {
		d.fillWithSomeData();

	}


	public Dados getDados() {
		return d;
	}


	public void setDados(Dados d) {
		this.d = d;
	}


	public Carro[] getCarros() {
		return this.d.getCarros();
	}


	public int getQtdCarros() {
		return this.d.getQtdCarros();
	}

	// Metodo para inserir e editar o Carro
	public boolean inserirEditarCarro(String[] dadosCarros) {
			// Cria um novo objeto carro apartir dos dados de entrada
			Carro c = new Carro(dadosCarros[1], Integer.parseInt(dadosCarros[2]), dadosCarros[3], dadosCarros[4], dadosCarros[5],
				dadosCarros[6],dadosCarros[7]);
			// Chama o metodo da instancia para inserir ou editar o carro 
			d.inserirEditarCarro(c, Integer.parseInt(dadosCarros[0]));
			// retorna como verdadeiro se der tudo certo 
			return true;

	}

	// Metodo para remover o carro
	public boolean removerCarro(int i) {

		String carroRemovido = d.getCarros()[i].getNome();

		if (i == (d.getQtdCarros() - 1)) {
			// Se o carro a ser removido estiver na ultima posição, diminua um e defina o ultimo como nulo
			d.setQtdCarros(d.getQtdCarros() - 1);
			d.getCarros()[d.getQtdCarros()] = null;
			return true;
		} else {
			int cont = 0;
			// Encontre o Indice do Carro a ser removido
			while (d.getCarros()[cont].getNome().compareTo(carroRemovido) != 0) {
				cont++;
			}

			// Mude a posição dos carros para remover a lacuna do carro removido
			for (int j = cont; j < d.getQtdCarros() - 1; j++) {
				d.getCarros()[j] = null;
				d.getCarros()[j] = d.getCarros()[j + 1];

			}// Define o ultimo item da matriz do Carro como nulo e diminui a contagem total de carros no Objeto e retorna verdadeiro
			d.getCarros()[d.getQtdCarros()] = null;
			d.setQtdCarros(d.getQtdCarros() - 1);
			return true;

		}
	}

}
