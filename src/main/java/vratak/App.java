package vratak;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

	public void start(Stage stage) throws Exception {
//		HelloWorldController mainController = new HelloWorldController();
//		FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource(“HelloWorldMain.fxml"));
//		fxmlLoader.setController(mainController);
//		Parent rootPane = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));	
//		Button button = new Button("stlaè ma!");
//		button.setOnAction(event -> System.out.println("anonymny klik"));
//		AnchorPane rootPane = new AnchorPane();
//		rootPane.getChildren().add(button);
//		rootPane.setPrefSize(400, 300);
		MainWindowController controller = new MainWindowController();
		FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource("MainWindow.fxml"));
				fxmlLoader.setController(controller);
		Parent rootPane = fxmlLoader.load();		
		Scene scene = new Scene(rootPane);
		stage.setTitle("Hello World");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}