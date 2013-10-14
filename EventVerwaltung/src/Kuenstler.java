
/**
 * Write a description of class Kuenstler here.
 * 
 * @author Dave Kramer, Simon Schwarz 
 * @version 0.3a
 */
public class Kuenstler
{
    String bezeichnungKuenstler;
    int gageFr;

    public Kuenstler(String bezeichnung, int gage)
    {
        bezeichnungKuenstler = bezeichnung;
        gageFr = gage;
    }

    public void setKuenstler(String bezeichnung, int gage)
    {
        bezeichnungKuenstler = bezeichnung;
        gageFr = gage;
    }

    public String getKuenstlerName()
    {
        return bezeichnungKuenstler;
    }
    
    public int getKuenstlerGage()
    {
    	return gageFr;
    }

}