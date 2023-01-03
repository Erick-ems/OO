package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;




public class Main extends Application {
	
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FXMLPrimeiraTela.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch(Exception event) {
			event.printStackTrace();	
		}
		
		
	}
	
	
	public static void main(String[]args) {
		launch(args);
	}

}