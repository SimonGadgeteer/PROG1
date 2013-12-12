package aufgabe3;

import java.util.ArrayList;

public class Getraenkezubereiter {

	private ArrayList<KoffeinGetraenk> koffeinGetraenke = new ArrayList<>();
	
	public static void main(String[] args) {

		Getraenkezubereiter getraenkezubereiter = new Getraenkezubereiter();
		getraenkezubereiter.erzeugeListe();
		getraenkezubereiter.bereiteZu();
	}

	public void erzeugeListe() {
		koffeinGetraenke.add(new Kaffee());
		koffeinGetraenke.add(new Tee());
		koffeinGetraenke.add(new Tee());
		koffeinGetraenke.add(new Kaffee());
	}

	private void bereiteZu()
	{
		for (KoffeinGetraenk koffeinGetraenk : koffeinGetraenke)
		{
			koffeinGetraenk.bereiteZu();
		}
	}
	
}
