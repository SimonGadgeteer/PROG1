
/**
 * Erstellt einen KŸnstler / eine KŸnstlergruppe.
 * 
 * @author Dave Kramer, Simon Schwarz 
 * @version 0.4
 */
public class Kuenstler
{
    String bezeichnungKuenstler;
    int gageFr;
    
    /**
     * Erstellt Ÿber die Methode setKuenstler einen KŸnstler und speichert dessen Gage
     * 
     * @param   bezeichnung   Name des KŸnstlers
     * @param   gage    Gage des KŸnstlers
     */
    public Kuenstler(String bezeichnung, int gage)
    {
        setKuenstler(bezeichnung, gage);
    }

    /**
     * Erstellt einen KŸnstler und speichert dessen Gage
     * 
     * @param   bezeichnung   Name des KŸnstlers
     * @param   gage    Gage des KŸnstlers
     */
    public void setKuenstler(String bezeichnung, int gage)
    {
        bezeichnungKuenstler = bezeichnung;
        gageFr = gage;
    }

    /**
     * Retourniert den KŸnstlernamen
     * 
     * @return  String    Name des KŸnstlers
     */
    public String getKuenstlerName()
    {
        return bezeichnungKuenstler;
    }
    
    
    /**
     * Retourniert die KŸnstlergage
     * 
     * @return  int    Gage des KŸnstlers in CHF
     */
    public int getKuenstlerGage()
    {
        return gageFr;
    }

}