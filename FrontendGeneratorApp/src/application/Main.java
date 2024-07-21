package application;
	
//import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;


public class Main extends Application {
	static Parent root;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
//		try {
//			root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//			
//			load();
//			
//			dragger();
//		
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
//	public void load() {
////		Label myLabel = new Label("FrontGenApp");
////		root.getChildren().add(myLabel);
//		
//		Label label1 = new Label("Label 1");
//		Label label2 = new Label("Label 2");
//		Label label3 = new Label("Label 3");
//		
//		VBox vbox = new VBox();
//		vbox.getChildren().add(label1);
//		vbox.getChildren().add(label2);
//		vbox.getChildren().add(label3);
//		
//		root.setTop(new Label("Top"));
//		root.setLeft(vbox);
//		root.setRight(new Label("Right"));
//		root.setCenter(new Label("Center"));
//		root.setBottom(new Label("Bottom"));
//	}
	
}
