import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Spielklasse des Spiels Snake.
 *
 * Ziel dieses Spiels ist es alle Goldstuecke einzusammeln und 
 * die Tuer zu erreichen, ohne sich selber zu beissen oder in 
 * die Spielfeldbegrenzung reinzukriechen. 
 */
public class SnakeSpiel {
  private Schlange schlange;
  private Tuer tuer;
  private Spielfeld spielfeld;
  //private Point goldStueck;
  private ArrayList<Point> goldStuecke = new ArrayList();
  private boolean spielLaeuft = true;

  /**
   * Startet das Spiel.
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
   * Startet das Spiel.
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
    new SnakeSpiel().spielen();
   // new SnakeSpiel().spielenMitGold(100);
  }

  private void spielInitialisieren(int anzahlMuenzen) {
    tuer = new Tuer(0, 5);
    spielfeld = new Spielfeld(40, 10);
   // goldStueck = new Point(20, 2);
    setAnzahlGoldstuecke(anzahlMuenzen);
    schlange = new Schlange(30, 2);
  }

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
  
  private boolean istEinGoldstueckAufPunkt(Point punkt)
  {
	  boolean goldstueckDort = false;
	  
	  for(int i = 0; i < goldStuecke.size(); i++)
	  {
		  if(goldStuecke.get(i).equals(punkt))
		  {
			goldstueckDort = true;  
		  }
	  }
	  
	  return goldstueckDort;
   // return goldStueck != null && goldStueck.equals(punkt);
  }
  
  private void ueberpruefeSpielstatus() {
    if (istEinGoldstueckAufPunkt(schlange.gibPosition())) {
    	//iterator while remove schlange.gibPoistion
    	Iterator<Point> it = goldStuecke.iterator();
    	
    	while(it.hasNext())
    	{
    		if(it.next().equals(schlange.gibPosition()))
    		{
    			it.remove();
    		}
    	}
    	
   //   goldStueck = null;
    	
    	
      schlange.wachsen();
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
  
  private boolean istGewonnen() {
	  
	  boolean goldStueck = true;
	  
	  if(goldStuecke.size() != 0)
	  {
		   goldStueck = false;
	  }
	  
	  return goldStueck  &&  tuer.istAufPunkt(schlange.gibPosition());
  }

  private boolean istVerloren() {
    return schlange.istKopfAufKoerper() || 
         !spielfeld.istPunktInSpielfeld(schlange.gibPosition());
  }
  
  private void fuehreSpielzugAus() {
    char eingabe = liesZeichenVonTastatur();
    schlange.bewege(eingabe);
  }
  
  private void setAnzahlGoldstuecke(int anzahl)
  {
	  int anzahlGoldstuecke =  anzahl;
	
	  Point tempPoint = new Point();
	  
	  for(int i = 0; i < anzahl; i++)
	  {
		  tempPoint = spielfeld.erzeugeZufallspunktInnerhalb();
		  System.out.println("Koordinate fŸr: "+i+" --> "+tempPoint);
		  goldStuecke.add(tempPoint);
	  }
  }

  private char liesZeichenVonTastatur() {
    Scanner scanner = new Scanner(System.in);
    char konsolenEingabe = scanner.next().charAt(0);
    return konsolenEingabe;
  }
}