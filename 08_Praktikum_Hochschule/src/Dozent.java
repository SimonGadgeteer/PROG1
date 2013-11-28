
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
