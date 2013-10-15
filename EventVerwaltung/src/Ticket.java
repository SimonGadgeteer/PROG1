
/**
 * Kreiert ein Ticket gem�ss User-Wunsch
 * 
 * @author Dave Kramer, Simon Schwarz
 * @version 0.5
 */
public class Ticket
{
    private int anzahlTicketsGesamt;
    private int anzahlVerkaufteTickets;
    private int ticketKategorie;
    private int ticketPreis;

    /**
     * Erstellt ein neues Ticket der gew�nschten Kategorie, sofern dies zu einer der drei bestimmten Kategorien geh�rt.
     * @param   kategorie   1 = VIP-Tickets, 2 = Tribuene-Tickets, 3 = Innenraum-Tickets
     */
    public Ticket(int kategorie, int preis, int anzahl)
    {
        if(kategorie > 0 && kategorie < 4)
        {
            ticketKategorie = kategorie;
        }
        else
        {
            System.out.println(anzahl+" Keine gueltige Ticketkategorie");
        }
        
        ticketPreis = preis;
        anzahlTicketsGesamt = anzahl;
    }

    /**
     * Verkauft eine gew�nschte Anzahl Tickets, sofern noch gen�gend Tickets vorhanden sind.
     * 
     * @param  anzahl   Anzahl gewuenschter Tickets
     */
    public void ticketVerkauf(int anzahl)
    {
        System.out.println("Gesamt: "+anzahlTicketsGesamt+", verk�uft: "+ anzahlVerkaufteTickets+", gew�nscht: "+anzahl);
        if((anzahlTicketsGesamt - (anzahlVerkaufteTickets + anzahl)) >= 0)
        {
            anzahlVerkaufteTickets += anzahl;
            System.out.println(anzahl+" Tickets der Kategorie "+ticketKategorie+" wurden gerade verkauft! :-)");
        }
        else
        {
            System.out.println("Es sind nur noch "+(anzahlTicketsGesamt - anzahlVerkaufteTickets)+" in der Kategorie "+ticketKategorie+" vorhanden!");
        }
    }
    
    /**
     * Gibt den aktuellen Ticket-Kategorie-Namen zur�ck
     * 
     * @return  String  Ticket-Kategorie
     */
    public String getTicketKategorieName()
    {
        if(ticketKategorie == 1)
        {
            return "VIP-Tickets";
        }
        else if(ticketKategorie == 2)
        {
            return "Tribuene-Tickets";
        }
        else if(ticketKategorie == 3)
        {
            return "Innenraum-Tickets";
        }
        else
        {
            return "keine gueltige Kategorie";
        }
    }
    
    /**
     * Gibt die TicketKategorie als Nummer zur�ck
     * 
     * @return  int TicketKategorie
     */
    public int getTicketNr()
    {
        return ticketKategorie;
    }
    
    /**
     * Gibt die gesamte Anzahl der Tickets zur�ck
     * 
     * @return  int Anzahl Tickets welche verf�gbar waren
     */
    public int getTicketAnzahl()
    {
        return anzahlTicketsGesamt;
    }
    
    /**
     * Gibt die Anzahl verkauften Tickets zur�ck
     * 
     * @return  int Anzahl Tickets verkauft
     */
    public int getTicketVerkauftAnzahl()
    {
        return anzahlVerkaufteTickets;
    }
    
    /**
     * Gibt Preis f�r die Tickets zur�ck
     * 
     * @return  int Ticketpreis
     */
    public int getTicketPreis()
    {
        return ticketPreis;
    }
}
