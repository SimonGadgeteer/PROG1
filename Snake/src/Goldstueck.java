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

	
	public Goldstueck(Point goldKoordinate, int goldWert) {
		this(goldKoordinate, goldWert, '$');
	}
	
	public Goldstueck(Point goldKoordinate) {
		this(goldKoordinate, new Random().nextInt(5)+1, '$');
	}
	
	public Goldstueck() {
		;
	}

	//Setter
	public void setGoldKoordinate(Point goldKoordinate) {
		this.goldKoordinate = goldKoordinate;
	}


	public void setGoldWert(int goldWert) {
		this.goldWert = goldWert;
	}


	public void setGoldZeichen(char goldZeichen) {
		this.goldZeichen = goldZeichen;
	}
	
	//Getter
	public Point getGoldKoordinate()
	{
		return goldKoordinate;
	}
	
	public int getGoldWert()
	{
		return goldWert;
	}
	
	public char getGoldZeichen()
	{
		return goldZeichen;
	}
	
	//Methoden
	public boolean istAufPunkt(Point punkt)
	{
		  return punkt.equals(goldKoordinate);
	}
}
