import java.util.ArrayList;

/**
 * Die Klasse MessApp steuert einen Messablauf, um die Performance des
 * Zufallszahlengenerators zu messen.
 * 
 * @author Dave Kramer, Simon Schwarz
 * @version 0.9
 */
public class MessApp {
	private int anzahlMessungen;
	private int anzahlMessreihen;
	private int[][] messSammlung;
	private double messungDurchschnitt;
	private ArrayList<Messkonduktor> messungenList = new ArrayList<Messkonduktor>();

	/**
	 * Fuehrt eine Messung durch.
	 */
	public void messen(int anzahlMessreihen, int anzahlMessungen) {
		messSammlung = new int[anzahlMessreihen][anzahlMessungen];
		this.anzahlMessungen = anzahlMessungen;
		this.anzahlMessreihen = anzahlMessreihen;

		initialisieren();
		analyseDurchfuehren();
		berechneUndDruckeMittelwerteMessreihe();
		berechneUndDruckeMittelwerteMessung();
	}

	public static void main(String[] args) {
		new MessApp().messen(10, 20);
	}

	private void initialisieren() {
		for(int i= 0; i < anzahlMessreihen;i++)
		{
			messungenList.add(new Messkonduktor(400000));
		}
	}

	 // Fuehrt eine bestimmte Anzahl Messungen durch und speichert die Ergebnisse in ein int[][] Array
	private void analyseDurchfuehren() {

		for(int i= 0; i < anzahlMessreihen; i++)
		{
			int[] temp = new int[anzahlMessungen];
			temp = messungenList.get(i).messungenDurchfuehren(new int[anzahlMessungen]);

				for(int ii = 0; ii < anzahlMessungen;ii++)
				{
					messSammlung[i][ii] = temp[ii];
				}
		}
	}

	 // Berechnet den Mittelwert aller Zahlen in der Messreihe und druckt diesen aus.
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
	
	 // Berechnet den Mittelwert aller N-ten Messungen aller Messreihen und druckt diesen aus.
	private void berechneUndDruckeMittelwerteMessung() {
		for (int i = 0; i < messSammlung.length; i++) {
			messungDurchschnitt = 0;
			for (int ii = 0; ii < messSammlung[i].length; ii++) {
				messungDurchschnitt += messSammlung[i][ii];
				if (ii == messSammlung[i].length - 1) {
					System.out.println("Durchschnitt von allen "
									+ (i + 1)
									+ ". Messungen: "
									+ (messungDurchschnitt / messSammlung[i].length));
				}
			}
		}
	}
}