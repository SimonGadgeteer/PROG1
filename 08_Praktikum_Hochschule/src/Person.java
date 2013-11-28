
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
