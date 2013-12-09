
abstract class Bankkonto {

	private String inhaber;
	private int kontoStand;
	protected int inhaberNummer;
	protected int kontostandMin;
	protected int kontostandMax;
	
	private static int inhaberNummerCounter = 1000;
	
	/**
	 * Erstellt ein Bankkonto
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 * @param kontostandMin definiert die tiefste limite der Kontosubklassen
	 * @param kontostandMax definiert die höchste limite der Kontosubklassen
	 */
	public Bankkonto(String inhaber, int kontoStand, int kontostandMin, int kontostandMax)
	{
		this.kontostandMin = kontostandMin;
		this.kontostandMax = kontostandMax;
		
		this.inhaber = inhaber;
		deponiereGeld(kontoStand);
		inhaberNummer = inhaberNummerCounter++;
	}
	
	public Bankkonto(String inhaber, int kontostandMin, int kontostandMax)
	{
		this(inhaber, 0, kontostandMin, kontostandMax);
	}
	
	public int getKontostand(){
		return kontoStand;
	}
	
	public int getInhaberNummer(){
		return inhaberNummer;
	}

	public Object getInhaber(){
		return inhaber;
	}

	/**
	 * Addiert eine Geldsumme des Kontos
	 * @param geldSumme die Geldsumme in Rappen, die dem Konto hinzugefügt wird
	 */
	public void deponiereGeld(int geldSumme)
	{
		if(kontoStand + geldSumme <= kontostandMax)
		{
			kontoStand += geldSumme;
		}
	}
	
	/**
	 * Subtrahiert eine Geldsumme vom Konto
	 * @param geldSumme die Geldsumme in Rappen, die vom Konto abgehoben wird
	 */
	public void abhebeGeld(int geldSumme)
	{
		if(kontoStand - geldSumme <= kontostandMin)
		{
			kontoStand -= geldSumme;
		}
	}	
}
