/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * 
 * Stellt eine Person dar.
 * @param ID eindeutige Identifikationsnummer einer Person
 * @param name name der Person
 *
 */
public class Person {

	private String ID;
	private String name;
	
	public Person (String ID, String name)
	{
		this.ID = ID;
		this.name = name;
	}
	
	public String gibInfo()
	{
		return name + ", ID " + ID;
	}
}
