/**
 * @author Dave Kramer, Simon Schwarz
 * @version 1.0
 * 
 * Stellt einen Studenten dar.
 * @param ID eindeutige Identifikation eines Studenten
 * @param name name des Studenten
 * @param credits anzahl credits des Studenten
 *
 */

public class Student extends Person{
	int credits;
	
	public Student(String ID, String name, int credits)
	{
		super(ID, name);
		this.credits = credits;
	}
	
	public Student(String ID, String name)
	{
		super(ID, name);
	}
	
	public void erhoeheCredits (int erhoehung)
	{
		credits += erhoehung;
	}
	
	public int gibCredits()
	{
		return credits;
	}
}
