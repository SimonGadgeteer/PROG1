import java.util.HashMap;
import java.util.HashSet;

/**
 * Zaehlt die Anzahl Vorkommnisse von Woertern ueber mehrere Zeichenketten.
 * Es lassen sich eine beliebige Anzahl an Zeichenketten uebergeben. Die
 * Statistik wird fortlaufend gefuehrt. Die Wortzaehlung laesst sich jederzeit
 * ausgeben. Die Satzeichen . , ? ! " : ; werden entfernt. Alle Buchstaben
 * werden in Kleinbuchstaben umgewandelt um beispielsweise das Wort 'die'
 * inmitten eines Satzes und das Wort 'Die' am Anfang eines Satzes als gleiches
 * Wort werten zu koennen.
 * 
 * @version 1.0
 * @author Dave Kramer, Simon Schwarz
 */
public class Worthaeufigkeitsanalyse {

	static private final HashSet<String> satzzeichen = new HashSet<String>();
	private HashMap<String, Integer> wortSpeicher = new HashMap<String, Integer>();
	
	static
	{
		satzzeichen.add("?");
		satzzeichen.add("!");
		satzzeichen.add(".");
		satzzeichen.add(",");
		satzzeichen.add(":");
		satzzeichen.add(";");
	}
	

	public static void main(String[] args) {
		Worthaeufigkeitsanalyse wha =new Worthaeufigkeitsanalyse();
		wha.verarbeiteText("FRITZ ist!!!!!! doof, im fall");
		wha.verarbeiteText(" !!!!!! doof, im fall");
		wha.verarbeiteText(" !!!!!! doof, im fall");
		wha.verarbeiteText(" ist!!!!!! doof, im ");
		wha.druckeStatistik();
	}


	public void verarbeiteText(String inputText)
	{
		for(String satzzeichenitem : satzzeichen)
		{
			inputText = inputText.replace(satzzeichenitem, "");
		}
		inputText = inputText.toLowerCase().trim();
		
		for(String wort : inputText.split(" +"))
		{
			if(!wortSpeicher.keySet().contains(wort))
			{
				wortSpeicher.put(wort, 0);
			}
				wortSpeicher.put(wort, wortSpeicher.get(wort) + 1);
		}
	}
	
	public void druckeStatistik()
	{	
		
		for(String wortSpeicherKey : wortSpeicher.keySet())
		{
			System.out.println(wortSpeicherKey + " " + wortSpeicher.get(wortSpeicherKey));
		}
	}
}
