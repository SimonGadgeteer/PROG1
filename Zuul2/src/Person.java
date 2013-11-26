import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.ResourceBundle;
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git

/**
 * Diese Klasse modeliert eine Person, die einen Namen
 * hat und einen Rucksack traegt. Im Rucksack kann sie 
 * Gegenstaende herumtragen. Gegenstaende sollen nur dann in den
 * Rucksack gepackt werden, wenn der Rucksack nicht schwerer wird
 * als die Tragkraft der Person. 
 * 
<<<<<<< HEAD
 * @author tebe, Dave Kramer, Simon Schwarz
 * @version 1.1
=======
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
 *
 */
public class Person {
  private final String name;
  private final int tragkraft;
  private Rucksack rucksack;

	ResourceBundle bundle = ResourceBundle.getBundle("Resources.zuul"); //$NON-NLS-1$
  
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
<<<<<<< HEAD
			System.out.println("Packe "+gegenstand.gibName()+" in Rucksack");
=======
			System.out.println(bundle.getString("98") + gegenstand.gibName() + bundle.getString("99"));
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
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
