import static org.junit.Assert.*;

import org.junit.Test;


public class TestVerarbeiteText {
	private Worthaeufigkeitsanalyse wortAnalyse;

	@Test
	public void korrekterText() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String wort = "Dies ist ein Testsatz, mit ganz vielen Satzzeichen! Wirklich?";
		String erwartung="";
		
		assertEquals(erwartung, wortAnalyse.entferneSatzzeichen(wort));
	}
	
	@Test
	public void wiederholenderText() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String wort = "Dies ist ein Testsatz, mit ganz vielen Satzzeichen! Wirklich? Wirklich ist ein Wort";
		String erwartung="";
		
		assertEquals(erwartung, wortAnalyse.entferneSatzzeichen(wort));
	}
	
	@Test
	public void falscherText() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String wort = "2390 89032 :;: 32434";
		String erwartung="";
		
		assertEquals(erwartung, wortAnalyse.entferneSatzzeichen(wort));
	}

}
