
/**
 * Erstellt einen K�nstler / eine K�nstlergruppe.
 * 
 * @author Dave Kramer, Simon Schwarz 
 * @version 0.4
 */
public class Kuenstler
{
    String bezeichnungKuenstler;
    int gageFr;
    
    /**
     * Erstellt �ber die Methode setKuenstler einen K�nstler und speichert dessen Gage
     * 
     * @param   bezeichnung   Name des K�nstlers
     * @param   gage    Gage des K�nstlers
     */
    public Kuenstler(String bezeichnung, int gage)
    {
        setKuenstler(bezeichnung, gage);
    }

    /**
     * Erstellt einen K�nstler und speichert dessen Gage
     * 
     * @param   bezeichnung   Name des K�nstlers
     * @param   gage    Gage des K�nstlers
     */
    public void setKuenstler(String bezeichnung, int gage)
    {
        bezeichnungKuenstler = bezeichnung;
        gageFr = gage;
    }

    /**
     * Retourniert den K�nstlernamen
     * 
     * @return  String    Name des K�nstlers
     */
    public String getKuenstlerName()
    {
        return bezeichnungKuenstler;
    }
    
    
    /**
     * Retourniert die K�nstlergage
     * 
     * @return  int    Gage des K�nstlers in CHF
     */
    public int getKuenstlerGage()
    {
        return gageFr;
    }

}