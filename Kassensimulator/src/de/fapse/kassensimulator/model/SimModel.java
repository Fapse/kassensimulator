package de.fapse.kassensimulator.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class SimModel {
	private static final Logger log = Logger.getLogger("de.fapse.kassensimulator.model");

	public static List<String> getHsstellen() {
		log.setUseParentHandlers(true);
		log.setLevel(Level.SEVERE);
		List<String> hsstellen = new ArrayList<>();
		try {
			Path datei = Paths.get("." + File.separator + "resources" + File.separator + "haushaltsstellen.txt").toRealPath();
			hsstellen = Files.readAllLines(datei);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.log(Level.SEVERE, "Scheibenkleister");
		System.out.println("Test");
		log.warning("Ned so tragisch!");
		log.log(new LogRecord(Level.SEVERE, "Test"));
		return hsstellen;
	}
}