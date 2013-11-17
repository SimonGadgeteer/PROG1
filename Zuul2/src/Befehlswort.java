/**
 * Diese Klasse haelt eine Aufzaehlung der akzeptierten Befehlswoerter.
 * Mit ihrer Hilfe werden eingetippte Befehle erkannt.
 *
 * @author  tebe
 * @version 1.0
 */
public enum Befehlswort {

	UNBEKANNT("unbekannt"), GEHE("gehe"), HILFE("hilfe"), BEENDEN("beenden");

	private String Befehl;
	
	Befehlswort(String befehl){
		Befehl = befehl;
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
		return Befehlswort.values().toString();
	}
	
	public String getBefehlswort() {
		return Befehl;
	}
	
	public void setBefelswort(String befehl) {
		Befehl = befehl;
	}
}
