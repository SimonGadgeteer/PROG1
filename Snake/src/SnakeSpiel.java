import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Spielklasse des Spiels Snake.
 *
 * Ziel dieses Spiels ist es alle Goldstuecke einzusammeln und 
 * die Tuer zu erreichen, ohne sich selber zu beissen oder in 
 * die Spielfeldbegrenzung reinzukriechen. 
 * 
 * @autor		Dave Kramer, Simon Schwarz
 * @version		0.75
 */
public class SnakeSpiel {
  private Schlange schlange;
  private Tuer tuer;
  private Spielfeld spielfeld;
  //private Point goldStueck;
  private ArrayList<Goldstueck> goldStuecke = new ArrayList<Goldstueck>();
  private boolean spielLaeuft = true;

  /**
   * Startet das Spiel mit 10 Goldm�nzen.
   */
  public void spielen() {
    spielInitialisieren(10);
    while (spielLaeuft) {
      zeichneSpielfeld();
      ueberpruefeSpielstatus();
      fuehreSpielzugAus();
    }   
  }
  
  /**
   * Startet das Spiel mit einer individuellen Anzahl Goldm�nzen.
   */
  public void spielenMitGold(int anzahlMuenzen) {
    spielInitialisieren(anzahlMuenzen);
    while (spielLaeuft) {
      zeichneSpielfeld();
      ueberpruefeSpielstatus();
      fuehreSpielzugAus();
    }   
  }
  
  public static void main(String[] args) {
    //new SnakeSpiel().spielen();
    new SnakeSpiel().spielenMitGold(100);
  }

  /**
   * Bereitet das Spiel vor und setzt die Variablen auf den Startwert
   * 
   * @param anzahlMuenzen	Mit wievielen M�nzen soll das Spiel gestartet werden
   */
  private void spielInitialisieren(int anzahlMuenzen) {
    tuer = new Tuer(0, 5);
    spielfeld = new Spielfeld(40, 10);
   // goldStueck = new Point(20, 2);
    setAnzahlGoldstuecke(anzahlMuenzen);
    schlange = new Schlange(30, 2);
  }

  /**
   * Zeichnet ein neues Spielfeld, die Schlange, die T�r und die Goldm�nzen
   */
  private void zeichneSpielfeld() {
    char ausgabeZeichen;
    for (int y = 0; y < spielfeld.gibHoehe(); y++) {
      for (int x = 0; x < spielfeld.gibBreite(); x++) {
        Point punkt = new Point(x, y);
        ausgabeZeichen = '.';
        if (schlange.istAufPunkt(punkt)) {
          ausgabeZeichen = '@';
        } else if (istEinGoldstueckAufPunkt(punkt)) {
          ausgabeZeichen = '$';
        } else if (tuer.istAufPunkt(punkt)) {
          ausgabeZeichen = '#';
        } 
        if(schlange.istKopfAufPunkt(punkt)) {
          ausgabeZeichen = 'S';         
        }
        System.out.print(ausgabeZeichen);
      }
      System.out.println();
    }
  }
  
  /**
   * Pr�ft ob sich ein Goldst�ck auf dem aktuellen Punkt des Spielfelds befindet. Falls dem so ist
   * wird True zur�ck gegeben.
   * 
   * @param punkt
   * @return	True falls M�nze vorhanden. false falls nicht
   */
  private boolean istEinGoldstueckAufPunkt(Point punkt)
  {
	  for(Goldstueck goldstueck : goldStuecke)
	  {
		  if(goldstueck.getGoldKoordinate().equals(punkt))
		  {
			return true;
		  }
	  }
	  
	  return false;

   // return goldStueck != null && goldStueck.equals(punkt);
  }
  
  /**
   * �berpr�ft laufend ob die Schlange gerade eine M�nze einsammelt, stirbt oder gewinnt.
   */
  private void ueberpruefeSpielstatus() {
    if (istEinGoldstueckAufPunkt(schlange.gibPosition())) {
    	
    	for(int i = 0; i < goldStuecke.size(); i++)
    	{
    /*		if(goldStuecke.get(i).getGoldKoordinate().equals(schlange.gibPosition()))
    		{*/
    		    schlange.wachsen(goldStuecke.get(i).getGoldWert());
    			goldStuecke.remove(i);
    			break;
    		//}
    	}
      System.out.println("Goldstueck eingesammelt.");
    }
    if (istVerloren()){
      System.out.println("Verloren!");
      spielLaeuft = false;
    }
    if (istGewonnen()){
      System.out.println("Gewonnen!");
      spielLaeuft = false;
    }
  }
  
  /**
   * �berpr�ft ob die Siegesbedingungen erf�llt sind.
   * Siegesbedingungen sind:
   * - Schlange auf T�r
   * - alle M�nzen gefressen
   * 
   * @return	true = gewonnen, false = noch nicht fertig
   */
  private boolean istGewonnen() {
	  
	  boolean goldStueck = true;
	  
	  if(goldStuecke.size() != 0)
	  {
		   goldStueck = false;
	  }
	  
	  return goldStueck  &&  tuer.istAufPunkt(schlange.gibPosition());
  }

  /**
   * �berpr�ft ob das Spiel verloren ist.
   * 
   * @return	true = verloren, false = weiterspielen
   */
  private boolean istVerloren() {
    return schlange.istKopfAufKoerper() || 
         !spielfeld.istPunktInSpielfeld(schlange.gibPosition());
  }
  
  /**
   * Liesst die n�chste Anweisung vom User und bewegt die Schlange.
   */
  private void fuehreSpielzugAus() {
    char eingabe = liesZeichenVonTastatur();
    schlange.bewege(eingabe);
  }
  
  /**
   * Erzeugt neue Goldst�cke-Objekte f�r die gew�nschte Anzahl Goldm�nzen
   * 
   * @param anzahl	wieviele Objekte sollen erstellt werden
   */
  private void setAnzahlGoldstuecke(int anzahl)
  {
	  Goldstueck goldStueck;
	  
	  for(int i = 0; i < anzahl; i++)
	  {
		  goldStueck = new Goldstueck(spielfeld.erzeugeZufallspunktInnerhalb());
		  System.out.println("Koordinate fuer: "+i+" --> " + goldStueck.getGoldKoordinate());
		  goldStuecke.add(goldStueck);
	  }
  }

  /**
   * Liest den User-Input von der Tastatur und gibt das gelesene Zeichen zur�ck.
   * @return
   */
  private char liesZeichenVonTastatur() {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    char konsolenEingabe = scanner.next().charAt(0);
    return konsolenEingabe;
  }
}