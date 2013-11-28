
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
