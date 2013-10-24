import java.util.HashMap;

/**
 * Bietet Funktionalitaeten zum Speichern von Pruefungsergebnissen von einer
 * Vielzahl von Studenten. Aus den gespeicherten Ergebnissen lassen sich
 * personalisierte Antworttext generieren.
 */
public class Pruefungsverwaltung {

  /**
   * Speichert ein Pruefungsergebnis.
   * 
   * @param ergebnis Das Pruefungsergebnis.
   */
	
	HashMap<String, String> studentenErgebnis = new HashMap<String, String>();
	HashMap<Double, String> dictionaryDoubleText = new HashMap<Double, String>();
	
	public Pruefungsverwaltung () {
		//Dictionary aufsetzen
		dictionaryDoubleText.put(1.0, "eins");
		dictionaryDoubleText.put(1.5, "eins punkt fuenf");
		dictionaryDoubleText.put(2.0, "zwei");
		dictionaryDoubleText.put(2.5, "zwei punkt fuenf");
		dictionaryDoubleText.put(3.0, "drei");
		dictionaryDoubleText.put(3.5, "drei punkt fuenf");
		dictionaryDoubleText.put(4.0, "vier");
		dictionaryDoubleText.put(4.5, "vier punkt fuenf");
		dictionaryDoubleText.put(5.0, "fuenf");
		dictionaryDoubleText.put(5.5, "fuenf punkt fuenf");
		dictionaryDoubleText.put(6.0, "sechs");
	}
	
  public void speichereErgebnis(Pruefungsergebnis ergebnis) {
	  pruefungsergebnisToHashMap(ergebnis);
  }

  /**
   * Gibt pro gespeichert Ergebnis einen Text auf die Konsole aus.
   * Je nachdem ob der Kandidate die Pruefung bestanden (>= 4.0) oder nicht
   * bestanden (< 4.0) hat, wird ein Text in folgendem Format ausgegeben:
   * 
   * Sie haben an der Pruefung eine 3.0 (drei punkt null) erzielt und 
   * sind somit durchgefallen!
   * 
   * Herzliche Gratulation Max Muster! Sie haben an der Pruefung eine 4.5
   * (vier pounkt fuenf) erzielt und somit bestanden!
   */
  	
  public void druckeAntworttexte() {
	  
  }

  private double rundeAufHalbeNote(double note) {
    return Math.round(note * 2) / 2.0;
  }
  
  private void pruefungsergebnisToHashMap(Pruefungsergebnis ergebnis) {

	  String antwortText = "";
	  
	  if (ergebnis.getNote() < 4.0)
	  {
		 antwortText = "Sie haben an der Pruefung eine " +
				 		rundeAufHalbeNote(ergebnis.getNote()) + " (" +
				 		dictionaryDoubleText.get(rundeAufHalbeNote(ergebnis.getNote())) + ")" +
				 		"erzielt und sind somit durchgefallen!";
	  }
	  else if(ergebnis.getNote() >= 4.0)
	  {
			 antwortText = "Herzliche Gratulation " + ergebnis.getStudent() +
					 	"! Sie haben an der Pruefung eine " +
				 		rundeAufHalbeNote(ergebnis.getNote()) + " (" +
				 		dictionaryDoubleText.get(rundeAufHalbeNote(ergebnis.getNote())) + ")" +
				 		" erzielt und somit bestanden!";
	  }
	  
	  studentenErgebnis.put(ergebnis.getStudent(), antwortText);
  }
}
