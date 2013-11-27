import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * 
 * Diese Klasse testet, ob Zahlen korrekt auf 0.5 gerundet werden.
 */
public class TestRundeNote {
	private Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();
	
	@Test
	public void volleZahl()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(3.0), 3.0, 0.000001);
	}
	
	@Test public void kommaZahlAufrunden()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(3.25), 3.5, 0.000001);
	}
	@Test public void kommaZahlAbrunden()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(3.24), 3.0, 0.000001);
	}
	@Test public void nullZahl()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(0), 0, 0.000001);
	}
	@Test public void kommaZahlHalb()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(3.5), 3.5, 0.000001);
	}
	@Test public void minusZahl()
	{
		assertEquals(pruefungsverwaltung.rundeAufHalbeNote(-3.2), -3.0, 0.00001);
	}
}
