
abstract class Bankkonto {

	private String inhaber;
	private int kontoStand = 0;
	protected static final int kontostandMin = 0;
	protected static final int kontostandMax = 10000000;

	
	/**
	 * Erstellt ein Bankkonto
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 * @param kontostandMin definiert die tiefste limite der Kontosubklassen
	 */
	public Bankkonto(String inhaber, int kontoStand)
	{
		this.inhaber = inhaber;
		deponiereGeld(kontoStand);
	}
	
	public Bankkonto(String inhaber)
	{
		this(inhaber, 0);
	}
	
	public int getKontostand(){
		return rappenZuFranken(kontoStand);
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
		int summe = frankenZuRappen(geldSumme);
		if(kontoStand + summe <= kontostandMax)
		{
			kontoStand += summe;
		}
		else
		{
			System.out.println("Maximum erreicht! Es wurden nur "+(rappenZuFranken(kontostandMax - kontoStand))+" einbezahlt.");
			kontoStand = kontostandMax;
		}
	}
	
	/**
	 * Subtrahiert eine Geldsumme vom Konto
	 * @param geldSumme die Geldsumme in Rappen, die vom Konto abgehoben wird
	 */
	public void abhebeGeld(int geldSumme)
	{
		int summe = frankenZuRappen(geldSumme);
			kontoStand -= summe;
	}
	
	public String toString()
	{
		return "Inhaber: "+getInhaber()+", Kontostand: "+getKontostand();
	}
	
	public int frankenZuRappen(int betrag){
		return betrag * 100;
	}
	
	public int rappenZuFranken(int betrag){
		return betrag / 100;
	}
}
