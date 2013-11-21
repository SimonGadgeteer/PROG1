import java.util.ArrayList;

/**
 * Ein Rucksack kann Gegenstände einpacken und auspacken.
 * Als Indikator wird das Gegenstandsobjekt benötigt.
 * @author Simon Schwarz, Dave Kramer
 */

public class Rucksack {

	int gewicht;
	private ArrayList<Gegenstand> rucksackInhalt;
	
	public Rucksack() {
		gewicht = 0;
		rucksackInhalt = new ArrayList<>();
	}
	
	/**
	 * @param gegenstand ist der Gegenstand, der in den Rucksack gepackt werden soll.
	 */
	public void packeGegenstand(Gegenstand gegenstand) {
		rucksackInhalt.add(gegenstand);
		gewicht += gegenstand.gibGewicht();
	}
	
	/**
	 * @param gegenstand ist der Gegenstand, der aus dem Rucksack entfernt werden soll.
	 */
	public void entferneInhaltsgegenstand(Gegenstand gegenstand) {
		rucksackInhalt.remove(gegenstand);
		gewicht -= gegenstand.gibGewicht();
	}
	
	/**
	 * @return gibt ein ArrayList<Gegenstand> mit allen Gegenständen zurück,
	 * die sich in dem Moment im Rucksack befinden.
	 */
	public ArrayList<Gegenstand> getRucksackInhalt() {
		return rucksackInhalt;
	}
	
	/**
	 * @return gibt das Gesamtgewicht des Rucksackinhalts zurück.
	 */
	public int getRucksackGewicht() {
		return gewicht;
	}
}
