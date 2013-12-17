package aufgabe5;
/**
 * Diese abstracte Klasse dient als Modell für alle koffeinhaltigen Getränke
 * 
 * @author 		Dave Kramer, Simon Schwarz
 * @Version		1.0
 */
public abstract class KoffeinGetraenk implements Trinkbar {
	private String type;
	
	public KoffeinGetraenk(String type)
	{
		this.type = type;
	}
	/**
	 * Bereitet ein Getränk zu
	 */
	public final void bereiteZu() {
		kocheWasser();
		braue();
		giesseInTasse();
		fuegeZutatenHinzu();
	}
	/**
	 * Koche ein bisschen Wasser
	 */
	private void kocheWasser()
	{
		System.out.println("Koche Wasser --> "+type);
	}
	/**
	 * Giesse heisses Wasser in eine Tasse
	 */
	private void giesseInTasse()
	{
		System.out.println("GiesseInLeTass --> "+type);
	}
	/**
	 * Braut ein koffeinhaltiges Getränk
	 */
	private void braue()
	{
		System.out.println("Ich kann mit den Augen brauen --> "+type);
	}
	/**
	 * Fügt individuelle Zutat hinzu
	 */
	private void fuegeZutatenHinzu()
	{
		System.out.println("Zutat dazu --> "+type);
	}
	
	@Override
	public void trinke(KoffeinGetraenk getraenk) {
		System.out.println("Ich trinke einen "+getraenk.getClass().getSimpleName());
		
	}
}
