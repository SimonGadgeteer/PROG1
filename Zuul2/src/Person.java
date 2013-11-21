import java.util.ArrayList;

/**
 * Diese Klasse modeliert eine Person, die einen Namen
 * hat und einen Rucksack traegt. Im Rucksack kann sie 
 * Gegenstaende herumtragen. Gegenstaende sollen nur dann in den
 * Rucksack gepackt werden, wenn der Rucksack nicht schwerer wird
 * als die Tragkraft der Person. 
 * 
 * @author tebe, Dave Kramer, Simon Schwarz
 * @version 1.1
 *
 */
public class Person {
  private final String name;
  private final int tragkraft;
  private Rucksack rucksack;

 /**
   * Erzeugt eine Person mit Namen und Tragkraft.
   * @param tragkraft
   */
  public Person(String name, int tragkraft) {
	  this.tragkraft = tragkraft;
	  this.name = name;
	  this.rucksack = new Rucksack();
  }
  
 public boolean gegenstandInRucksackPacken(Gegenstand gegenstand) {
		if (checkGegenstandTragbar(gegenstand)) {
			rucksack.packeGegenstand(gegenstand);
			System.out.println("Packe "+gegenstand.gibName()+" in Rucksack");
			return true;
		}
		return false;
}
  
public boolean checkGegenstandTragbar (Gegenstand gegenstand) {
	if (tragkraft >= (getRucksackGewicht() + gegenstand.gibGewicht())) {
		return true;
	}
	else {
		return false;
	}
}
  public ArrayList<Gegenstand> getRucksackInhalt() {
	  return rucksack.getRucksackInhalt();
  }
  
  public int getRucksackGewicht() {
	  return rucksack.getRucksackGewicht();
  }
  
 /*public ArrayList<Gegenstand> getRucksack() {
	 return rucksack;
 }*/
  
  /**
   * Gibt die Tragkraft zurueck.
   * @return Die Tragkraft
   */
  public int gibTragkraft() {
		return tragkraft;
  }
  
  /**
   * @return Der Name der Person
   */
  public String gibName() {
	return name;
  }
}
