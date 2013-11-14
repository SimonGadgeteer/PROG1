import java.util.ArrayList;
import java.util.HashSet;

/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  tebe
 * @version 1.0
 */
public enum Befehlswort {

	UNBEKANNT("unbekannt"), GEHE("gehe"), HILFE("hilfe"), BEENDEN("beenden");

	private final String Befehl;
	
	Befehlswort(String Befehl){
		this.Befehl = Befehl;
	}
	
	public static Befehlswort gibBefehlsWort(String wort) {
		for (Befehlswort befehlswort : Befehlswort.values()) {
			if (wort.equals(befehlswort.toString()))
			{
				return befehlswort;
			}
		}
		return Befehlswort.UNBEKANNT;
	}
}
