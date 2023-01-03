package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;




public class Main extends Application {
		
	public void start(Stage PrimaryStage)throws IOException{
		
		Pane root = (Pane) FXMLLoader.load(getClass().getResource("FXMLPrimeiraTela.fxml"));
		
		Scene scene = new Scene(root);
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}
	
	
	public static void main(String[]args) {
		launch(args);
	}

}