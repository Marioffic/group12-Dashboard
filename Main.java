package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
	        AnchorPane root = loader.load();
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Farm Dashboard");
	        primaryStage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
