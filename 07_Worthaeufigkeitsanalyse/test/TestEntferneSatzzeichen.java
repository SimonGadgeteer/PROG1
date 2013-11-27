import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestEntferneSatzzeichen {
	
	private Worthaeufigkeitsanalyse wortAnalyse;
	
	@Test
	public void mixedText() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String wort = "Dies \\ ist ein Testsatz, mit ganz vielen Satzzeichen! Wirklich?";
		String korrektesWort = "Dies ist ein Testsatz mit ganz vielen Satzzeichen Wirklich";
		
		assertEquals(korrektesWort, wortAnalyse.entferneSatzzeichen(wort));
	}
	
	@Test
	public void reinText() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String korrektesWort = "Dies ist ein Testsatz mit ganz vielen Satzzeichen Wirklich";
		
		assertEquals(korrektesWort, wortAnalyse.entferneSatzzeichen(korrektesWort));
	}
	
	@Test
	public void nurSatzzeichen() {
		wortAnalyse = new Worthaeufigkeitsanalyse();
		String wort = ",.-!?:'\';";
		String korrektesWort = "";
		
		assertEquals(korrektesWort, wortAnalyse.entferneSatzzeichen(wort));
	}

}
