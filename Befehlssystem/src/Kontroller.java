/**
 * Diese Klasse verarbeitet Befehle vom Typ
 * {@link Befehl Befehl} und lösst die dazu 
 * passenden Aktionen aus.
 * 
 * @author tebe
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
		boolean macheWeiter = true;
		String befehlswort = befehl.gibBefehlswort();
		if (Befehlswort.istBefehl(befehlswort)) {

			if (befehlswort.equals("laufe")) {
				System.out.println("Befehl LAUFE " + befehl.gibZweitesWort() + " wird ausgefuehrt");
			} else if (befehlswort.equals("hilfe")) {
				System.out.println("Gueltige Befehle: "
						+ Befehlswort.gibBefehlsworteAlsText());
			} else if (befehlswort.equals("beenden")) {
				System.out.println("Befehl BEENDEN wird ausgefuehrt.");
				macheWeiter = false;
			} else {
				System.out.println("Befehlswort ohne zugehoerige Aktion: Abbruch.");
				macheWeiter = false;
			}
		} else {
			System.out.println("Ich weiss nicht, was Sie meinen...");
		}
		return macheWeiter;
	}
}
