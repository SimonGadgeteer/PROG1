
public class Nummernkonto extends Bankkonto{
	
	private static int inhaberNummerCounter = 1000;
	private int inhaberNummer;

	/**
	 * Erstellt ein Nummernkonto mit der Tiefstlimite 0 und Höchstlimite von 10000000 Rappen
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 */
	public Nummernkonto(String inhaber, int kontoStand) {
		super(inhaber, kontoStand);
		inhaberNummer = inhaberNummerCounter++;
	}
	
	public Nummernkonto(String inhaber)
	{
		this(inhaber, 0);
		inhaberNummer = inhaberNummerCounter++;
	}
	
	@Override
	public Object getInhaber(){
		return inhaberNummer;
	}
	
	public void abhebeGeld(int geldSumme)
	{
		if(super.getKontostand() - geldSumme >= kontostandMin)
		{
			super.abhebeGeld(geldSumme);
		}
		else
		{
			System.out.println("Es fehlen "+((geldSumme - super.getKontostand()))+" für diese Auszahlung!");
		}
	}

}
