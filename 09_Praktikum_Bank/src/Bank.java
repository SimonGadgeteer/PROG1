
public class Bank {

	private String inhaber;
	private int kontoStand;
	
	public Bank(String inhaber, int kontoStand)
	{
		this.inhaber = inhaber;
		
		if(this.kontoStand < 100000 && (this.kontoStand + kontoStand) <= 100000)
		{
			this.kontoStand = kontoStand;
		}
	}
	

}
