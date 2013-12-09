
public class Nummernkonto extends Bankkonto{

	/**
	 * Erstellt ein Nummernkonto mit der Tiefstlimite 0 und Höchstlimite von 10000000 Rappen
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 */
	public Nummernkonto(String inhaber, int kontoStand) {
		super(inhaber, kontoStand, 0, 10000000);
	}
	
	public Nummernkonto(String inhaber)
	{
		this(inhaber, 0);
	}
	
	@Override
	public Object getInhaber(){
		return inhaberNummer;
	}
}
