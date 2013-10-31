import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
		inputText = inputText.toLowerCase();
		
		for(String wort : inputText.split(" "))
		{
			if(!wortSpeicher.keySet().contains(wort))
			{
				wortSpeicher.put(wort, 1);
				System.out.println("bam");
			}
			else
			{
				int count = wortSpeicher.get(wort);
				wortSpeicher.put(wort, ++count);
			}
		}
		
		System.out.println("sadf: "+inputText);
	}
	
	public void druckeStatistik()
	{	
		
		for(int i =0; i < wortSpeicher.size(); i++)
		{
			System.out.println(wortSpeicher.entrySet());
		}
	}
}
