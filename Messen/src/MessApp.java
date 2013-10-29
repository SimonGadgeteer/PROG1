import java.util.ArrayList;
import java.util.HashMap;

/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 */
public class MessApp {
	private Messkonduktor messkonduktor;
	private double[][] messSammlung;
	private double[] messungDurchschnitt;

	/**
	 * Fuehrt eine Messung durch.
	 */
	public void messen(int anzahlMessreihen, int anzahlMessungen) {
		messSammlung = new double[anzahlMessreihen][anzahlMessungen];
		messungDurchschnitt = new double[anzahlMessungen];
		initialisieren();
		analyseDurchfuehren(messkonduktor);
		berechneUndDruckeMittelwerteMessreihe();
		berechneUndDruckeMittelwerteMessung();
	}

	public static void main(String[] args) {
		new MessApp().messen(10, 20);
	}

	private void initialisieren() {
		// TODO Objektsammlung und Messkonduktor erzeugen
		messkonduktor = new Messkonduktor(400000);
	}

	private void analyseDurchfuehren(Messkonduktor messkonduktor) {
		// TODO Benutzen Sie 'messkonduktor' um die Messungen
		// durchzufuehren und in der Objektsammlung zu speichern.

		messSammlung = messkonduktor.messungenDurchfuehrenXtended(messSammlung);

	}

	private void berechneUndDruckeMittelwerteMessreihe() {

		for (int i = 0; i < messSammlung.length; i++) {
			double messreihe = 0.0;
			for (int ii = 0; ii < messSammlung[i].length; ii++) {
				messreihe += messSammlung[i][ii];
			}
			System.out.println("Durchschnitt von Messreihe " + (i + 1) + ": "
					+ (messreihe / messSammlung[i].length));
		}
	}

	private void berechneUndDruckeMittelwerteMessung() {
		double temp = 0.0;
		for (int i = 0; i < messSammlung.length; i++) {
			for (int ii = 0; ii < messSammlung[i].length; ii++) {
				messungDurchschnitt[ii] += messSammlung[i][ii];
				if (ii == messSammlung[i].length - 1) {
					System.out
							.println("Durchschnitt von allen "
									+ (i + 1)
									+ ". Messungen: "
									+ (messungDurchschnitt[ii] / messSammlung[i].length));
				}
			}

		}

	}
}