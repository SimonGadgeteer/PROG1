import java.util.ArrayList;

/**
 * Diese definiert ein Fahrzeug.
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 */
public class Fahrzeug {

	  private String modell;
	  private int preis;
	  private int stueckzahl;
	  ArrayList<Verkauf> verkaeufe;
	
	public Fahrzeug(String modell, int preis, int stueckzahl)
	{
		 this.modell = modell;
		    this.preis = preis;
		    this.stueckzahl = stueckzahl;
		    verkaeufe = new ArrayList<Verkauf>();
	}
	
	 public String kaufen(int stueckzahlKaufen, Kunde kunde)
	  {
	    if (stueckzahlKaufen <= stueckzahl) {
	      stueckzahl -= stueckzahlKaufen;
	      Verkauf verkauf = new Verkauf(kunde, stueckzahlKaufen, stueckzahlKaufen * preis);
	      verkaeufe.add(verkauf);
	      return kunde.gibInfo() + " hat " + stueckzahlKaufen + " Stueck des Modells " + modell +
	             " zu insgesamt CHF " + (stueckzahlKaufen * preis) + " gekauft";
	      
	    } else {
	      return "Es hat leider nur noch " + stueckzahl + " Stueck des Modells " + modell + " an Lager";
	    }
	  }
	  
	  /**
	   * Liefert das Modell des Fahrzeugs.
	   * @return Das Modell
	   */
	  public String gibModell() 
	  {
	    return modell;
	  }
	  
	  /**
	   * Setzt den Preis des Fahrzeugs.
	   * @param preis Der Preis
	   */
	  public void setzePreis(int preis) 
	  {
	    if (preis > 0) {
	      this.preis = preis;
	    }
	  }
	  
	  /**
	   * Setze die verfuegbare Stueckzahl des Fahrzeugs.
	   * @param stueckzahl Die Stueckzahl
	   */
	  public void setzeStueckzahl(int stueckzahl) 
	  {
	    if (stueckzahl >= 0) {
	      this.stueckzahl = stueckzahl;
	    }
	  }
	  
	  /**
	   * Gibt Informationen des Motorrads zurueck.
	   * @return Informationen des Verkaufs
	   */
	  public String gibInfo() {
	    String resultat = "Modell " + modell + ", " + stueckzahl + " Fahrzeuge zu je CHF " + preis + " an Lager.\n";
	    if(!verkaeufe.isEmpty())
	    {
		    resultat += "Bereits erfolgte Verkaeufe:\n";
		    for (Verkauf verkauf : verkaeufe) {
		      resultat += verkauf.gibInfo() + "\n";
		    }
	    }
	    return resultat;
	  }
}
