
public class Salaerkonto extends Bankkonto{
	
	/**
	 * Erstellt ein Nummernkonto mit der Tiefstlimite -1000000 und Höchstlimite von 11000000 Rappen
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 */
	public Salaerkonto(String inhaber, int kontoStand) {
		super(inhaber, kontoStand, -1000000, 11000000);
	}
	
	public Salaerkonto(String inhaber)
	{
		this(inhaber, 0);
	}

	public int getKontostandMin() {
		return kontostandMin;
	}

	public int getKontostandMax() {
		return kontostandMax;
	}
}
