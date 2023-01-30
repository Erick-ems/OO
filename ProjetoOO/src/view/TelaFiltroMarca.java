package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import controll.ControleCarro;
import controll.ControleDados;

public class TelaFiltroMarca implements ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private static ControleDados dados;
	private JList<String> listaCarrosCadastrados;
	private String[] listaCarros = new String[50];

	
	//Utiliza a marca como parametro de filtro
	public void mostrarDados(ControleDados d) {
		dados = d;

		listaCarros = new ControleCarro(dados).getMarcaCarro();
		listaCarrosCadastrados = new JList<String>(listaCarros);
		janela = new JFrame("MARCAS");
		titulo = new JLabel("MARCAS");

		titulo.setBounds(275, 10, 250, 30);
		listaCarrosCadastrados.setBounds(115, 50, 350, 120);
		listaCarrosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCarrosCadastrados.setVisibleRowCount(10);




		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaCarrosCadastrados);
		janela.setSize(600, 400);
		janela.setVisible(true);

		listaCarrosCadastrados.addListSelectionListener(this);
		listaCarrosCadastrados.setVisible(true);

		janela.setLocationRelativeTo(null);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaCarrosCadastrados) {
			new TelaListaCarros2().mostrarDados(2,dados, null, this, null);
		}
	}




}