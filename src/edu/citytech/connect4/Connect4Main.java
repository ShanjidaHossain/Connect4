package edu.citytech.connect4;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Connect4Main extends Application {

	public static void main(String[] args) {
		Application.launch(Connect4Main.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("./GridPaneConnect4.fxml"));
		stage.setTitle("G Connect 4 ");

		Scene scene = new Scene (root);
		stage.setScene(scene);
		
		URL url = this.getClass().getResource("Connect4.css");
		if (url == null) {
			System.out.println("Resources not found. Aborting...");
			System.exit(-1);
		}
		
		String css = url.toExternalForm();
		scene.getStylesheets().add(css);
		stage.show();
	}

}
