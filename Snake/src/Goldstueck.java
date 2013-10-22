import java.awt.Point;
import java.util.Random;

public class Goldstueck {

	Point goldKoordinate;
	int goldWert;
	char goldZeichen;	
	
	//Konstruktor
	/**
	 * Konstruktor benoetigt mindestens goldKoordinate und goldWert.
	 * @param("goldKoordinate")
	 * @param("goldWert")
	 * @param("goldZeichen")
	 */
	public Goldstueck(Point goldKoordinate, int goldWert, char goldZeichen) {
		this.goldKoordinate = goldKoordinate;
		this.goldWert = goldWert;
		this.goldZeichen = goldZeichen;
	}

	/**
	 * Erstellt ein Goldstück mit den gewünschten Koordinaten und dem gewünschten Wert
	 * 
	 * @param goldKoordinate	Wo soll die Münze platziert werden
	 * @param goldWert			Bestimmt um wieviel die Schlange wachsen soll
	 */
	public Goldstueck(Point goldKoordinate, int goldWert) {
		this(goldKoordinate, goldWert, '$');
	}
	
	/**
	 * Erstellt ein Goldstück mit den gewünschten Koordinaten und dem Wert 1
	 * @param goldKoordinate
	 */
	public Goldstueck(Point goldKoordinate) {
		this(goldKoordinate, new Random().nextInt(5)+1, '$');
	}
	
	/* Unnötig
	public Goldstueck() {
		;
	}*/
	
	

	/**
	 * Setzt Koordinate des Goldes
	 * @param goldKoordinate	gewünschte Platzierung
	 */
	public void setGoldKoordinate(Point goldKoordinate) {
		this.goldKoordinate = goldKoordinate;
	}

	/**
	 * Setze Wert der Münze
	 * @param goldWert	gewünschter Wachstum nach Verspeisung
	 */
	public void setGoldWert(int goldWert) {
		this.goldWert = goldWert;
	}

	/**
	 * Bestimmt welches Zeichen für die Münze auf dem Spielfeld dargestellt werden soll
	 * @param goldZeichen	Zeichen welches dargestellt werden soll
	 */
	public void setGoldZeichen(char goldZeichen) {
		this.goldZeichen = goldZeichen;
	}
	
	/**
	 * Gibt Koordinaten des Goldstücks zurück
	 * @return	point Koordinaten
	 */
	public Point getGoldKoordinate()
	{
		return goldKoordinate;
	}
	
	/**
	 * Gibt den Wert des Goldstücks zurück
	 * @return
	 */
	public int getGoldWert()
	{
		return goldWert;
	}
	
	/**
	 * Gibt das Zeichen für das Goldstück zurück
	 * @return
	 */
	public char getGoldZeichen()
	{
		return goldZeichen;
	}
	
	//unnötig?
/*	public boolean istAufPunkt(Point punkt)
	{
		  return punkt.equals(goldKoordinate);
	}*/
}
