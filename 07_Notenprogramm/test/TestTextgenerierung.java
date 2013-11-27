import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * 
 * Diese Klasse testet, ob die Textgenerierung der Klasse pruefungsverwaltung wie erwartet verläuft.
 *
 */
public class TestTextgenerierung {

	Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();
	
	@Test
	public void studentDurchgefallen()
	{
		assertEquals(pruefungsverwaltung.generiereText("Max", 3.5),
				"Max, Sie haben an der Pruefung eine 3.5 (drei punkt fuenf) erzielt und sind somit durchgefallen!");
	}
	
	@Test
	public void studentBestanden()
	{
		assertEquals(pruefungsverwaltung.generiereText("Max", 4.5),
				"Herzliche Gratulation Max! Sie haben an der Pruefung eine 4.5 (vier punkt fuenf) erzielt und somit bestanden!");
	}
	
	@Test
	public void studentMinusnote()
	{
		assertEquals(pruefungsverwaltung.generiereText("Max", -9.5),
				"Max, Sie haben an der Pruefung eine -9.5 ("+null+") erzielt und sind somit durchgefallen!");
	}
}
