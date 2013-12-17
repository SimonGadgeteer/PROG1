package aufgabe4;

import java.util.ArrayList;
/**
 * Diese Klasse braut ein paar Getränke
 * 
 * @author 		Dave Kramer, Simon Schwarz
 * @Version		1.0
 */
public class Getraenkezubereiter {

	private ArrayList<KoffeinGetraenk> koffeinGetraenke = new ArrayList<KoffeinGetraenk>();
	
	public static void main(String[] args) {

		Getraenkezubereiter getraenkezubereiter = new Getraenkezubereiter();
		getraenkezubereiter.erzeugeListe();
		getraenkezubereiter.bereiteZu();
	}

	public void erzeugeListe() {
		koffeinGetraenke.add(new Kaffee("Kaffe1"));
		koffeinGetraenke.add(new Tee("Tee1"));
		koffeinGetraenke.add(new Tee("Tee2"));
		koffeinGetraenke.add(new Kaffee("Kaffe2"));
	}

	private void bereiteZu()
	{
		for (KoffeinGetraenk koffeinGetraenk : koffeinGetraenke)
		{
			koffeinGetraenk.bereiteZu();
		}
	}
	
}
