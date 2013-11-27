/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
<<<<<<< HEAD
 * @author  tebe, Dave Kramer, Simon Schwarz
 * @version 1.1
=======
 * @author  Dave Kramer, Simon Schwarz
 * @version 1.0
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
 */
public enum Befehlswort {

	UNBEKANNT("unbekannt"),
	GEHE("gehe"),
	UMSEHEN("umsehen"),
	UEBERNIMM("uebernimm"),
	NIMM("nimm"),
	HILFE("hilfe"),
	BEENDEN("beenden");

	private String befehl;
	
	Befehlswort(String befehl){
		this.befehl = befehl;
	}
	
	public static Befehlswort gibBefehlsWort(String wort) {
		for (Befehlswort befehlswort : Befehlswort.values()) {
			if (befehlswort.getBefehlswort().equals(wort))
			{
				return befehlswort;
			}
		}
		return Befehlswort.UNBEKANNT;
	}
	
	public static String gibBefehlsWorteAlsText() {
		String returnString = "";
		for (Befehlswort befehlswort : Befehlswort.values())
		{
			returnString += befehlswort.getBefehlswort() + " ";
		}
		return returnString;
	}
	
	public String getBefehlswort() {
		return befehl;
	}
	
	public void setBefelswort(String befehl) {
		this.befehl = befehl;
	}
}
