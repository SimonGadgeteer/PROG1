/**
 * Diese Klasse speichert Informationen eines Fahrrads.
 * @author Marc Rennhard, Dave Kramer, Simon Schwarz
 * @version 1.1
 */
public class Fahrrad extends Fahrzeug
{
  private int gaenge;

  
  /**
   * Konstruktor, um ein Fahrrad zu erzeugen.
   * @param modell Das Modell 
   * @param preis Der Preis
   * @param stueckzahl Die verfuegbare Stueckzahl
   * @param gaenge Die Anzah der Gaenge
   */
  public Fahrrad(String modell, int preis, int stueckzahl, int gaenge)
  {
    super(modell, preis, stueckzahl);
    this.gaenge = gaenge;
  }
  

  /**
   * Liefert die Anzahl Gaenge des Fahrrads.
   * @return Die Anzahl Gaenge
   */
  public int gibGaenge()
  {
    return gaenge;
  }

}
