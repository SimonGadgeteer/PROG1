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
	 * Erstellt ein Goldst�ck mit den gew�nschten Koordinaten und dem gew�nschten Wert
	 * 
	 * @param goldKoordinate	Wo soll die M�nze platziert werden
	 * @param goldWert			Bestimmt um wieviel die Schlange wachsen soll
	 */
	public Goldstueck(Point goldKoordinate, int goldWert) {
		this(goldKoordinate, goldWert, '$');
	}
	
	/**
	 * Erstellt ein Goldst�ck mit den gew�nschten Koordinaten und dem Wert 1
	 * @param goldKoordinate
	 */
	public Goldstueck(Point goldKoordinate) {
		this(goldKoordinate, new Random().nextInt(5)+1, '$');
	}
	
	/* Unn�tig
	public Goldstueck() {
		;
	}*/
	
	

	/**
	 * Setzt Koordinate des Goldes
	 * @param goldKoordinate	gew�nschte Platzierung
	 */
	public void setGoldKoordinate(Point goldKoordinate) {
		this.goldKoordinate = goldKoordinate;
	}

	/**
	 * Setze Wert der M�nze
	 * @param goldWert	gew�nschter Wachstum nach Verspeisung
	 */
	public void setGoldWert(int goldWert) {
		this.goldWert = goldWert;
	}

	/**
	 * Bestimmt welches Zeichen f�r die M�nze auf dem Spielfeld dargestellt werden soll
	 * @param goldZeichen	Zeichen welches dargestellt werden soll
	 */
	public void setGoldZeichen(char goldZeichen) {
		this.goldZeichen = goldZeichen;
	}
	
	/**
	 * Gibt Koordinaten des Goldst�cks zur�ck
	 * @return	point Koordinaten
	 */
	public Point getGoldKoordinate()
	{
		return goldKoordinate;
	}
	
	/**
	 * Gibt den Wert des Goldst�cks zur�ck
	 * @return
	 */
	public int getGoldWert()
	{
		return goldWert;
	}
	
	/**
	 * Gibt das Zeichen f�r das Goldst�ck zur�ck
	 * @return
	 */
	public char getGoldZeichen()
	{
		return goldZeichen;
	}
	
	//unn�tig?
/*	public boolean istAufPunkt(Point punkt)
	{
		  return punkt.equals(goldKoordinate);
	}*/
}
