import java.util.ArrayList;

/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen. 
 */
public class MessApp {
  private Messkonduktor messkonduktor;
  int[][] messSammlung;
  double[] messungDurchschnitt;
  
  /**
   * Fuehrt eine Messung durch.
   */
  public void messen(int anzahlMessungen, int anzahlMessreihen) {
	  messSammlung = new int[anzahlMessungen][anzahlMessreihen];
	  messungDurchschnitt = new double[anzahlMessreihen];
	  initialisieren();
   // analyseDurchfuehren();
    berechneUndDruckeMittelwerteMessreihe();
    berechneUndDruckeMittelwerteMessung();
  }

  public static void main(String[] args) {
	    new MessApp().messen( 10,  20);
	  }
  
  private void initialisieren() {
    // TODO Objektsammlung und Messkonduktor erzeugen
	  Messkonduktor messer = new Messkonduktor(400000);
	  analyseDurchfuehren(messer);
  }

  private void analyseDurchfuehren(Messkonduktor messer) {
    // TODO Benutzen Sie 'messkonduktor' um die Messungen 
    // durchzufuehren und in der Objektsammlung zu speichern.

	  messSammlung = messer.messungenDurchfuehrenXtended(messSammlung);
	  
  }

  private void berechneUndDruckeMittelwerteMessreihe() {
    	  
	  for(int i= 0; i < messSammlung.length; i++)
	  {
		  double messreihe = 0.0;
		  for(int ii = 0; ii < messSammlung[i].length;ii++)
		  {
			  messreihe += messSammlung[i][ii];
		  }
		  System.out.println("Messreihe "+(i+1)+": "+(messreihe/messSammlung[i].length));
	  }
  }

  private void berechneUndDruckeMittelwerteMessung() {
    // TODO Implementieren Sie die Methode.
	  
	  for(int i= 0; i < messSammlung[i].length; i++)
	  {
		  for(int ii = 0; ii < messSammlung.length;ii++)
		  {
			  messungDurchschnitt[ii] += messSammlung[i][ii];
			  System.out.println(messungDurchschnitt[ii]+"--> zweite stufe "+ii);
			  if(ii == (messSammlung.length-1))
			  {
				  System.out.println("bam "+(i+1)+". --> "+(messungDurchschnitt[ii]/messSammlung[i].length));
			  }
		  }
	  }
	  
	/*  for(int i = 0; i < messSammlung[i].length; i++)
	  {
		  System.out.println(messungDurchschnitt.length);
		  System.out.println("Durchschnitt von allen "+(i+1)+". Messungen: "+(messungDurchschnitt[i]/messSammlung[i].length));
	  }*/
  }
}
