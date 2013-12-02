
/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * 
 * Stellt einen Dozenten dar.
 * @param ID eindeutige Identifikationsnummer aller Dozenten
 * @param name name des Dozenten
 * @param bueronummer bueronummer des Dozenten
 * @param telefonnummer telefonnummer des Dozenten 
 *
 */
public class Dozent extends Person{
	String bueronummer;
	String telefonnummer;
	
	public Dozent(String ID, String name, String bueronummer, String telefonnummer)
	{
		super(ID, name);
		this.bueronummer = bueronummer;
		this.telefonnummer = telefonnummer;
	}
	
	public String gibBuero()
	{
		return bueronummer; 
	}
	
	public String gibTelefonnummer()
	{
		return telefonnummer;
	}
}
