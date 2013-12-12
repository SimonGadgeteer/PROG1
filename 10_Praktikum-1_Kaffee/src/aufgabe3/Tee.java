package aufgabe3;
/**
 * Diese Klasse bietet die Funktionalitaet, um einen Tee
 * zu kochen.
 * 
 * @author Dave Kramer, Simon Schwarz
 */
public class Tee extends KoffeinGetraenk{

  /**
   * Bereitet einen Tee zu.
   */
  public void bereiteZu() {
    super.kocheWasser();
    taucheTeebeutel();
    super.giesseInTasse();
    fuegeZitroneHinzu();
  }

  private void fuegeZitroneHinzu() {
	System.out.println("Sprüz");
	
}
  
private void taucheTeebeutel() {
	System.out.println("Pflatsch");
	
}

}
