package de.fapse.kassensimulator.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SimModelTest {
	@Test
	public void simpleTest() {
		assertEquals("Schuhe","Schuhe");
	}
	
	public void getHssstellenTest() {
		List<String> hsStellen = SimModel.getHsstellen();
		assertTrue(hsStellen.size() > 0);
	}
}
