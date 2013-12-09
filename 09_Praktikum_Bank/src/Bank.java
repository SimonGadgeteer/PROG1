
public class Bank {

	public static void main(String[] args) {
		Salaerkonto salaerkonto = new Salaerkonto("Dave", 11000000);
		System.out.println(salaerkonto.getKontostand());
		System.out.println(salaerkonto.getInhaber());
		
		Nummernkonto nummernkonto = new Nummernkonto("Simon", -10000);
		System.out.println(nummernkonto.getKontostand());
		System.out.println(nummernkonto.getInhaber());
	}

}
