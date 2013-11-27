import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * Diese Klasse Testet, ob die zufaellig generierte Zahl von der Klasse ZufaelligeNotengebung
 * die Zahlen im erwünschten Bereich generieren.
 */
public class TestRandomNote {

	ZufaelligeNotengebung randomNote = new ZufaelligeNotengebung();
	
	@Test
	public void randomInRange()
	{
		assertTrue( 1 < randomNote.generiereZufaelligePruefungsnote() && randomNote.generiereZufaelligePruefungsnote() < 6 );
	}
	
}
