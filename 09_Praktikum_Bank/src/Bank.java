
public class Bank {

	public static void main(String[] args) {
		Salaerkonto salaerkonto = new Salaerkonto("Dave", 11000000, 1337);
		System.out.println(salaerkonto);
		salaerkonto.abhebeGeld(1200);
		System.out.println("Stand nach Abhebung: "+salaerkonto.getKontostand());
		salaerkonto.abhebeGeld(1200);
		System.out.println("Stand nach Abhebung: "+salaerkonto.getKontostand());
		salaerkonto.abhebeGeld(120000);
		System.out.println("Stand nach Abhebung: "+salaerkonto.getKontostand());
		
		Nummernkonto nummernkonto = new Nummernkonto("Simon", 10000);
		System.out.println(nummernkonto);
		nummernkonto.deponiereGeld(100000);
		System.out.println(nummernkonto.getKontostand());
		nummernkonto.abhebeGeld(50000);
		System.out.println(nummernkonto.getKontostand());
		
		/*Nummernkonto nummernkonto2 = new Nummernkonto("Simon der Erste", -10000);
		System.out.println(nummernkonto2);*/
	}

}
