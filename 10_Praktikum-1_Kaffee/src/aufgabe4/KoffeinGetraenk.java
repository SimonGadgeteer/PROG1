package aufgabe4;
/**
 * Diese abstracte Klasse dient als Modell für alle koffeinhaltigen Getränke
 * 
 * @author 		Dave Kramer, Simon Schwarz
 * @Version		1.0
 */
public abstract class KoffeinGetraenk {
	private String type;
	
	public KoffeinGetraenk(String type)
	{
		this.type = type;
	}
	
	public final void bereiteZu() {
		kocheWasser();
		braue();
		giesseInTasse();
		fuegeZutatenHinzu();
	}
	private void kocheWasser()
	{
		System.out.println("Koche Wasser --> "+type);
	}
	
	private void giesseInTasse()
	{
		System.out.println("GiesseInLeTass --> "+type);
	}
	
	private void braue()
	{
		System.out.println("Ich kann mit den Augen brauen --> "+type);
	}
	
	private void fuegeZutatenHinzu()
	{
		System.out.println("Zutat dazu --> "+type);
	}
}
