package de.fapse.kassensimulator;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import de.fapse.kassensimulator.model.SimModel;
import javafx.application.Application;
import javafx.stage.Stage;

public class Simulator extends Application {

	private static final Logger log = Logger.getLogger("de.fapse.kassensimulator");
	private static Handler logFileHandler = null;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			System.out.println("Test2");
			logFileHandler = new FileHandler("kassensimulator.log");
		} catch (IOException e){
			
		}
		log.addHandler(logFileHandler);
		List<String> hsstellen = SimModel.getHsstellen();
		hsstellen.stream().forEach(e -> System.out.println(e));
		primaryStage.setTitle("Mein Kassensimulator");
		primaryStage.show();
	}
}