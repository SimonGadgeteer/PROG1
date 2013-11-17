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
		if (Befehlswort.gibBefehlsWort(befehlswort) != Befehlswort.UNBEKANNT) {

			if (befehlswort.equals(Befehlswort.GEHE.getBefehlswort())) {
				System.out.println("Befehl GEHE " + befehl.gibZweitesWort() + " wird ausgefuehrt");
			} else if (befehlswort.equals(Befehlswort.HILFE.getBefehlswort())) {
				System.out.println("Gueltige Befehle: "
						+ Befehlswort.gibBefehlsWorteAlsText());
			} else if (befehlswort.equals(Befehlswort.BEENDEN.getBefehlswort())) {
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
