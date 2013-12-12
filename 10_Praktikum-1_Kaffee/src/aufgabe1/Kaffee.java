package aufgabe1;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Kaffee
 * zu kochen.
 * 
 * @author tebe
 */
public class Kaffee {

  /**
   * Bereitet einen Kaffee zu.
   */
  public void bereiteZu() {
    kocheWasser();
    braueFilterKaffee();
    giesseInTasse();
    fuegeZuckerUndMilchHinzu();
  }

  private void fuegeZuckerUndMilchHinzu() {
	System.out.println("Plätscher");
	
}

private void giesseInTasse() {
	System.out.println("Glugg glugg glugg");
	
}

private void braueFilterKaffee() {
	System.out.println("Blubber Blubber");
	
}

private void kocheWasser() {
	  System.out.println("Wasser kocht! blub blub");
  }
}
