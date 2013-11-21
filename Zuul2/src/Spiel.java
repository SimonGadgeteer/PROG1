import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * Dies ist die Hauptklasse der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches, textbasiertes Adventure-Game. Ein
 * Spieler kann sich in einer Umgebung bewegen, die Kontrolle von anderen Personen
 * im Raum uebernehmen und Gegenstaende einpacken, sofern seine Tragkraft ausreicht.
 * Das Spiel sollte auf jeden Fall noch weiter ausgebaut werden, damit es interessanter wird!
 * 
 * 
 * Diese Instanz dieser Klasse erzeugt und initialisiert alle anderen Objekte
 * der Anwendung: Sie legt alle Raeume und einen Parser an und startet das
 * Spiel. Sie wertet auch die Befehle aus, die der Parser liefert und sorgt fuer
 * ihre Ausfuehrung.
 * 
 * @author tebe (Original: Michael Koelling und David J. Barnes), Dave Kramer, Simon Schwarz
<<<<<<< HEAD
 * @version 1.3
=======
 * @version 1.2
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
 */

public class Spiel {
	private Parser parser;
	private Raum aktuellerRaum;
	private Person spieler;

	ResourceBundle bundle = ResourceBundle.getBundle("Resources.zuul"); //$NON-NLS-1$
	ResourceBundle bundlebefehle = ResourceBundle.getBundle("Resources.zuulbefehle");
	/**
	 * Erzeuge ein Spiel und initialisiere die Spielwelt.
	 */
	public Spiel() {
		spielweltErzeugen();

		parser = new Parser();
	}
	
	public static void main(String args[])
	{
		Spiel spiel = new Spiel();
		spiel.spielen();
	}
	
	public static void main(String args[])
	{
		Spiel spiel = new Spiel();
		spiel.spielen();
	}

	/**
	 * Baut die Spielewelt auf. Erzeugt die Raeume mit Verbindungen und fuellt
	 * diese mit Personen und Gegenstaenden.
	 */
	private void spielweltErzeugen() {
		spieler = new Person(bundle.getString("1"), 20); //$NON-NLS-1$
		ArrayList<Raum> raeume = raeumeAnlegen();
		fuellenMitPersonen(raeume);
		fuellenMitGegenstaenden(raeume);
	}

	/**
	 * Erzeuge alle Raeume, verbinde ihre Ausgaenge miteinander.
	 * 
	 * @return Die angelegten Raeume
	 */
	private ArrayList<Raum> raeumeAnlegen() {
		HashMap<String, Raum> raum = new HashMap<String, Raum>();
		String draussen = bundle.getString("2");
		String draussenBeschreibung = bundle.getString("3");
		String hoersaal = bundle.getString("4");
		String hoersaalBeschreibung = bundle.getString("5");
		String cafeteria = bundle.getString("6");
		String cafeteriaBeschreibung = bundle.getString("7");
		String labor = bundle.getString("8");
		String laborBeschreibung = bundle.getString("9");
		String buero = bundle.getString("10");
		String bueroBeschreibung = bundle.getString("11");
		
		String osten = bundle.getString("13");
		String westen = bundle.getString("19");
		String norden = bundle.getString("28");
		String sueden = bundle.getString("16");
		
		// die Raeume erzeugen
		raum.put(draussen, new Raum(draussenBeschreibung)); //$NON-NLS-1$ //$NON-NLS-2$
		raum.put(hoersaal, new Raum(hoersaalBeschreibung)); //$NON-NLS-1$ //$NON-NLS-2$
		raum.put(cafeteria, new Raum(cafeteriaBeschreibung)); //$NON-NLS-1$ //$NON-NLS-2$
		raum.put(labor, new Raum(laborBeschreibung)); //$NON-NLS-1$ //$NON-NLS-2$
		raum.put(buero, new Raum(bueroBeschreibung)); //$NON-NLS-1$ //$NON-NLS-2$
		// die Ausgaenge initialisieren
		raum.get(draussen).setzeAusgang(osten, raum.get(hoersaal)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(draussen).setzeAusgang(sueden, raum.get(labor)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(draussen).setzeAusgang(westen, raum.get(cafeteria)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(hoersaal).setzeAusgang(westen, raum.get(draussen)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(cafeteria).setzeAusgang(osten, raum.get(draussen)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(labor).setzeAusgang(norden, raum.get(draussen)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(labor).setzeAusgang(osten, raum.get(buero)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		raum.get(buero).setzeAusgang(westen, raum.get(labor)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		// Startraum
		aktuellerRaum = raum.get(bundle.getString("2")); //$NON-NLS-1$
		ArrayList<Raum> raumliste = new ArrayList<Raum>();
		for (Raum r : raum.values()) {
			raumliste.add(r);
		}
		return raumliste;
	}

	/**
	 * Verteilt eine Anzahl Personen auf eine Liste von Raeumen. Die Zuteilung
	 * erfolgt auf Basis einer Zufallsstrategie.
	 * 
	 * @param raum
	 *            Liste der Raeume
	 */
	private void fuellenMitPersonen(ArrayList<Raum> raum) {
		ArrayList<Person> person = new ArrayList<Person>();
		person.add(new Person(bundle.getString("37"), 40)); //$NON-NLS-1$
		person.add(new Person(bundle.getString("38"), 80)); //$NON-NLS-1$
		person.add(new Person(bundle.getString("39"), 45)); //$NON-NLS-1$
		person.add(new Person(bundle.getString("40"), 35)); //$NON-NLS-1$
		int counter = 0;
		while (person.size() > 0) {
			if (Math.random() > 0.5) {
				raum.get(counter).betreten(person.get(0));
				person.remove(0);
			}
			counter = (counter + 1) % raum.size();
		}
	}

	/**
	 * Verteilt eine Anzahl Gegenstaende auf eine Liste von Raeumen. Die
	 * Zuteilung erfolgt auf Basis einer Zufallsstrategie.
	 * 
	 * @param raum
	 *            Liste der Raeume
	 */
	private void fuellenMitGegenstaenden(ArrayList<Raum> raum) {
		ArrayList<Gegenstand> gegenstand = new ArrayList<Gegenstand>();
		gegenstand.add(new Gegenstand(bundle.getString("41"), 1)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("42"), 12)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("43"), 10)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("44"), 250)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("45"), 9)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("46"), 5)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("47"), 11)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("48"), 8)); //$NON-NLS-1$
		gegenstand.add(new Gegenstand(bundle.getString("49"), 30)); //$NON-NLS-1$
		int counter = 0;
		while (gegenstand.size() > 0) {
			if (Math.random() > 0.5) {
				raum.get(counter).hineinlegen(gegenstand.get(0));
				gegenstand.remove(0);
			}
			counter = (counter + 1) % raum.size();
		}
	}

	/**
	 * Die Hauptmethode zum Spielen. Laeuft bis zum Ende des Spiels in einer
	 * Schleife.
	 */
	public void spielen() {
		willkommenstextAusgeben();

		// Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
		// und fuehren sie aus, bis das Spiel beendet wird.
		boolean beendet = false;
		while (!beendet) {
			Befehl befehl = parser.liefereBefehl();
			beendet = verarbeiteBefehl(befehl);
		}
		System.out.println(bundle.getString("50")); //$NON-NLS-1$
	}

	/**
	 * Einen Begruessungstext fuer den Spieler ausgeben.
	 */
	private void willkommenstextAusgeben() {
		System.out.println();
		System.out.println(bundle.getString("51")); //$NON-NLS-1$
		System.out
				.println(bundle.getString("52")); //$NON-NLS-1$
		System.out.println(bundle.getString("53") + bundlebefehle.getString("HILFE") //$NON-NLS-1$
				+ bundle.getString("54")); //$NON-NLS-1$
		System.out.println();
		System.out.println(aktuellerRaum.gibLangeBeschreibung());
	}

	/**
	 * Verarbeite einen gegebenen Befehl (fuehre ihn aus).
	 * 
	 * @param befehl
	 *            Der zu verarbeitende Befehl.
	 * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
	 */
	private boolean verarbeiteBefehl(Befehl befehl) {
		boolean moechteBeenden = false;

<<<<<<< HEAD
		Befehlswort befehlswort = Befehlswort.gibBefehlsWort(befehl.gibBefehlswort());

		switch (befehlswort) {
		case UNBEKANNT:
			System.out.println("Ich weiss nicht, was Sie meinen...");
			break;
		case UMSEHEN:
=======
		if (bundlebefehle.getString("UMSEHEN").equals(befehl.gibBefehlswort())) {
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
			umsehen();
		}
		else if (bundlebefehle.getString("HILFE").equals(befehl.gibBefehlswort())) {
			hilfstextAusgeben();
		}
		else if (bundlebefehle.getString("GEHE").equals(befehl.gibBefehlswort())) {
			wechsleRaum(befehl);
		}
		else if (bundlebefehle.getString("BEENDEN").equals(befehl.gibBefehlswort())) {
			moechteBeenden = beenden(befehl);
		}
		else if (bundlebefehle.getString("UEBERNIMM").equals(befehl.gibBefehlswort())) {
			uebernimm(befehl);
		}
		else if (bundlebefehle.getString("NIMM").equals(befehl.gibBefehlswort())) {
			nimm(befehl);
		}
		else {
			System.out.println(bundle.getString("55"));
		}

		return moechteBeenden;
	}

	/**
	 * Gib Überblick über den aktuellen Raum, wie anwesende Personen, Gegenstände, aktueller Raumname, Ausgänge, aktuelle Person
	 */
	private void umsehen() {
		System.out.println(bundle.getString("57") + spieler.gibName()); //$NON-NLS-1$
		System.out.println(aktuellerRaum.gibLangeBeschreibung());
	}

	/**
	 * Packt den spezifizierten Gegenstand in den Rucksack
	 * des Spielers und entfernt ihn aus dem aktuellen Raum.
	 * 
	 * Falls der bezeichnete Gegenstand nicht vorhanden ist, aendert sich nichts.
	 * 
	 * @param befehl Der auszufuehrende Befehl
	 */
	private void nimm(Befehl befehl) {
		if (befehl.hatZweitesWort()) {
			int kennummer = Integer.parseInt(befehl.gibZweitesWort());
			gegenstandEinpacken(kennummer);
		} else {
			System.out.println(bundle.getString("58")); //$NON-NLS-1$
		}
	}

	/**
	 * Packt den Gegenstand mit der gegebenen 
	 * Nummer, falls vorhanden, in den Rucksack 
	 * des Spielers und entfernt ihn aus dem aktuellen Raum.
	 * 
	 * @param nummer Nummer des Gegenstands
	 */
	private void gegenstandEinpacken(int nummer) {
		Gegenstand gegenstand = aktuellerRaum.herausnehmen(nummer);
		if (gegenstand == null) {
<<<<<<< HEAD
			System.out.println("Es gibt keinen Gegenstand mit dieser Nummer: " + nummer);
=======
			System.out.println(bundle.getString("59") + nummer); //$NON-NLS-1$
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
			return;
		}
<<<<<<< HEAD
		if(!spieler.gegenstandInRucksackPacken(gegenstand)) {
			System.out.println("Gegenstand konnte nicht eingepackt werden.");
			aktuellerRaum.hineinlegen(gegenstand);	
		}	
=======
		
		if(!spieler.gegenstandInRucksackPacken(gegenstand)) {
			System.out.println(bundle.getString("60")); //$NON-NLS-1$
			aktuellerRaum.hineinlegen(gegenstand);	
		}
		
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
	}

	/**
	 * Uebernimmt die Kontrolle der spezifizierten Person. Der Spieler steuert
	 * anschliessend neu diese Person.
	 * 
	 * Falls die bezeichnete Person nicht vorhanden ist, aendert sich nichts.
	 * 
	 * @param befehl
	 *            Der auszufuehrende Befehl
	 */
	private void uebernimm(Befehl befehl) {
		if (befehl.hatZweitesWort()) {
			int nummer = Integer.parseInt(befehl.gibZweitesWort());
			personUebernehmen( nummer);			
		} else
		{
			System.out.println(bundle.getString("61")); //$NON-NLS-1$
		}
	}

	/**
	 * Uebernimmt, falls vorhanden, die Kontrolle der
	 * Person mit der spezifizierten Nummer.
	 * 
	 * @param nummer Nummer der Person
	 */
	private void personUebernehmen(int nummer) {
		Person person = aktuellerRaum.verlassen(nummer);
		if (person == null) {
			System.out.println(bundle.getString("62") + nummer); //$NON-NLS-1$
		} else {
			aktuellerRaum.betreten(spieler);
			spieler = person;
			System.out.println(bundle.getString("63") + spieler.gibName()); //$NON-NLS-1$
		}
	}

	/**
	 * Gib Hilfsinformationen aus. Hier geben wir eine etwas alberne und unklare
	 * Beschreibung aus, sowie eine Liste der Befehlswoerter.
	 */
	private void hilfstextAusgeben() {
		System.out.println(bundle.getString("64")); //$NON-NLS-1$
		System.out.println(bundle.getString("65")); //$NON-NLS-1$
		System.out.println();
		befehleAusgeben();
	}

	/**
	 * Gibt eine Liste der vorhandenen Befehlswoerter aus.
	 */
	private void befehleAusgeben() {
<<<<<<< HEAD
		System.out.println("Ihnen stehen folgende Befehle zur Verfuegung:");
		System.out.println(Befehlswort.gibBefehlsWorteAlsText());
=======
		System.out.println(bundle.getString("66")); //$NON-NLS-1$
		for (String keyValue : bundlebefehle.keySet()) {
			System.out.println(bundlebefehle.getString(keyValue));
		}
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
	}

	/**
	 * Versuche, in eine Richtung zu gehen. Wenn es einen Ausgang gibt, wechsele
	 * in den neuen Raum, ansonsten gib eine Fehlermeldung aus.
	 */
	private void wechsleRaum(Befehl befehl) {
		if (!befehl.hatZweitesWort()) {
			// Gibt es kein zweites Wort, wissen wir nicht, wohin...
			System.out.println(bundle.getString("67")); //$NON-NLS-1$
			return;
		}
		String richtung = befehl.gibZweitesWort();
		// Wir versuchen, den Raum zu verlassen.
		Raum naechsterRaum = aktuellerRaum.gibAusgang(richtung);
		if (naechsterRaum == null) {
			System.out.println(bundle.getString("68")); //$NON-NLS-1$
		} else {
			aktuellerRaum = naechsterRaum;
			System.out.println(aktuellerRaum.gibLangeBeschreibung());
		}
	}

	/**
	 * Der Befehl zum Beenden wurde eingegeben. Ueberpruefe den Rest des
	 * Befehls, ob das Spiel wirklich beendet werden soll.
	 * 
	 * @return 'true', wenn der Befehl das Spiel beendet, 'false' sonst.
	 */
	private boolean beenden(Befehl befehl) {
		if (befehl.hatZweitesWort()) {
			System.out.println(bundle.getString("69")); //$NON-NLS-1$
			return false;
		} else {
			return true;
		}
	}

}
