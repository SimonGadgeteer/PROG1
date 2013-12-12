package aufgabe1;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author Dave Kramer, Simon Schwarz
 */
public class Tee {

  /**
   * Bereitet einen Tee zu.
   */
  public void bereiteZu() {
    kocheWasser();
    taucheTeebeutel();
    giesseInTasse();
    fuegeZitroneHinzu();
  }

  private void fuegeZitroneHinzu() {
	System.out.println("Sprüz");
	
}

private void giesseInTasse() {
	System.out.println("Glugg glugg glugg");
	
}

private void taucheTeebeutel() {
	System.out.println("Pflatsch");
	
}

private void kocheWasser() {
	  System.out.println("Wasser kocht! blub blub");
  }


}
