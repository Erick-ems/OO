package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FXMLPrimeiraTelaController{

    @FXML
    private TextField varNome;

    @FXML
    private TextField varCpf;

    @FXML
    private TextField varIdade;

    @FXML
    private TextField varRg;

    @FXML
    private TextField varTelefone;

    @FXML
    private TextField varEmail;

    @FXML
    public void botaoCadastrarClicado() {
    	System.out.println("botao clicado");
    	System.out.println("Nome:" + varNome.getText());

    }
    @FXML
    void botaoCancelarClicado() {
    	System.out.println("Botao cancelado clicado");
    }

}
