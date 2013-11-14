import java.util.ArrayList;
import java.util.HashSet;

/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  tebe
 * @version 1.0
 */
public class Befehlswort {

	// Ein HashSet mit den gueltigen Befehlswoertern als Klassenvariable
	private static final HashSet<String> gueltigeBefehle = new HashSet<String>();
	static {
		gueltigeBefehle.add("gehe");
		gueltigeBefehle.add("beenden");
		gueltigeBefehle.add("hilfe");
	}

	/**
	 * Konstruktor - initialisiere die Befehlswörter.
	 */
	public Befehlswort()
	{
		// tut momentan nichts
	}

	/**
	 * Pruefe, ob eine gegebene Zeichenkette ein gueltiger
	 * Befehl ist.
	 * 
	 * @return 'true', wenn die gegebene Zeichenkette ein gueltiger
	 *         Befehl ist, 'false' sonst.
	 */
	public static boolean istBefehl(String eingabe)
	{
		return gueltigeBefehle.contains(eingabe);
	}

	/**
	* Gibt die akzeptierten Befehlsworte als Text zurueck.
	*
	* @return Die akzeptierten Befehlsworte als Text
	*/
	public static String gibBefehlsworteAlsText() {
	              String text = "";
	              for (String befehl : gueltigeBefehle) {
	                             text = text + befehl + " ";
	              }
	              return text;
	}
}
