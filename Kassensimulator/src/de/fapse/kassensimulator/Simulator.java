package de.fapse.kassensimulator;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Simulator extends Application {

	private static final Logger log = Logger.getLogger("de.fapse.kassensimulator");
	private static Handler logFileHandler = null;
	/*
	public static void main(String[] args) {
		try {
			logFileHandler = new FileHandler("kassensimulator.log");
		} catch (IOException e){
			
		}		
		log.addHandler(logFileHandler);
		
		launch(args);
	}
	*/
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		setupLogging();
        Parent root = FXMLLoader.load(getClass().getResource("." + File.separator + "view" + File.separator + "SimGui.fxml"));        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public void setupLogging() {
		try {
			logFileHandler = new FileHandler("kassensimulator.log");
		} catch (IOException e){
			
		}		
		log.addHandler(logFileHandler);		
	}
/*
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			logFileHandler = new FileHandler("kassensimulator.log");
		} catch (IOException e){
			
		}
		log.addHandler(logFileHandler);
		List<String> hsstellen = SimModel.getHsstellen();
		hsstellen.stream().forEach(e -> System.out.println(e));
		primaryStage.setTitle("Mein Kassensimulator");
		StackPane stackPane = new StackPane();
		Label label = new Label(hsstellen.toString());
		stackPane.getChildren().add(label);
		Scene scene = new Scene(stackPane, 400, 200);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}*/
}