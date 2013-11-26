/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und lÃ¶sst die dazu 
 * passenden Aktionen aus.
 * 
 * @author tebe, Dave Kramer, Simon Schwarz
 * @version 1.0
 *
 */
public class Kontroller {
	/**
	 * Verarbeite einen gegebenen Befehl
	 * 
	 * @param befehl
	 *            Der zu verarbeitende Befehl.
	 * @return 'false', wenn ein Abbruchbefehl verarbeitet wurde
	 */
	public boolean verarbeiteBefehl(Befehl befehl) {

		
		switch(Befehlswort.gibBefehlsWort(befehl.gibBefehlswort()))
		{
		case GEHE:
			System.out.println("Befehl GEHE " + befehl.gibZweitesWort() + " wird ausgefuehrt");
			break;
		case HILFE:
			System.out.println("Gueltige Befehle: "	+ Befehlswort.gibBefehlsWorteAlsText());
			break;
		case BEENDEN:
			System.out.println("Befehl BEENDEN wird ausgefuehrt.");
			return false;
		case UNBEKANNT:
			System.out.println("Ich weiss nicht, was Sie meinen...");
			break;
		default:
			System.out.println("Befehlswort ohne zugehoerige Aktion: Abbruch.");
			return false;
		}
		
		return true;
	}
	
}
