
/**
 * Write a description of class Kuenstler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    public void setzeKuenstler(String bezeichnung, int gage)
    {
        bezeichnungKuenstler = bezeichnung;
        gageFr = gage;
    }

    public void ausgabeKuenstlerInfo()
    {
        System.out.println("Kuenstler: " + bezeichnungKuenstler + ", Gage: CHF " + gageFr);
    }

}