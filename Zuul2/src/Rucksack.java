import java.util.ArrayList;

public class Rucksack {

	int gewicht;
	private ArrayList<Gegenstand> rucksackInhalt;
	
	public Rucksack() {
		gewicht = 0;
		rucksackInhalt = new ArrayList<>();
	}
	
	public void packeGegenstand(Gegenstand gegenstand) {
		rucksackInhalt.add(gegenstand);
		gewicht += gegenstand.gibGewicht();
	}
	
	public void entferneInhaltsgegenstand(Gegenstand gegenstand) {
		rucksackInhalt.remove(gegenstand);
		gewicht -= gegenstand.gibGewicht();
	}
	
	public ArrayList<Gegenstand> getRucksackInhalt() {
		return rucksackInhalt;
	}
	
	public int getRucksackGewicht() {
		return gewicht;
	}
}
