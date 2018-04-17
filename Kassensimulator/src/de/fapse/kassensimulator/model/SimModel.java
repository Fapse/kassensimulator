package de.fapse.kassensimulator.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
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
			log.severe("Fehler beim Einlesen der Haushaltsstellen!");
			e.printStackTrace();
		}
		return hsstellen;
	}
}