
public class Salaerkonto extends Bankkonto{
	private static final int maxUeberzug = 10000;
	private static final int minUeberzug = 0;
	private int limite;
	
	/**
	 * Erstellt ein Nummernkonto mit der Tiefstlimite -1000000 und Höchstlimite von 11000000 Rappen
	 * @param inhaber definiert den Namen des Inhabers
	 * @param kontoStand definiert den initialen Kontostand des Inhabers in Rappen
	 * @param ueberzugsLimite definiert wieviel das Konto überzogen werden darf. Range zwischen 0 und 10000
	 */
	public Salaerkonto(String inhaber, int kontoStand, int ueberzugsLimite) {
			super(inhaber, kontoStand);
			
			if(ueberzugsLimite <= 10000 || ueberzugsLimite >= 0)
			{
				this.limite = ueberzugsLimite;
			}
			else
			{
				System.out.println("Ueberzugslimit muss zwischen 0 und 10000 liegen");
			}
	}
	
	public Salaerkonto(String inhaber, int ueberzugsLimite)
	{
		super(inhaber);
		
		if(ueberzugsLimite <= 10000 || ueberzugsLimite >= 0)
		{
			this.limite = ueberzugsLimite;
		}
		else
		{
			System.out.println("Ueberzugslimit muss zwischen 0 und 10000 liegen");
		}
	}

	public int getKontostandMin() {
		return kontostandMin;
	}

	public int getKontostandMax() {
		return kontostandMax;
	}
	
	public int getLimite()
	{
		return limite;
	}
	
	public String toString()
	{
		return super.toString()+", Ueberzugslimite: "+getLimite();
	}
	
	public void abhebeGeld(int geldSumme)
	{
		if(super.getKontostand() - geldSumme >= (kontostandMin-limite))
		{
			super.abhebeGeld(geldSumme);
		}
		else
		{
			System.out.println("Es fehlen dem Konto "+(geldSumme - (super.getKontostand()+limite))+" für diese Auszahlung!");
		}
	}
}
