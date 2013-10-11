
/**
 * Write a description of class Ticket here.
 * 
 * @author Dave Kramer, Simon Schwarz
 * @version 03.pre Alpha
 */
public class Ticket
{
    private int anzahlTicketsGesamt;
    private int anzahlVerkaufteTickets;
    private int ticketKategorie;
    private int ticketPreis;

    /**
     * Constructor for objects of class Ticket
     * @param   kategorie   1 = VIP-Tickets, 2 = Tribünen-Tickets, 3 = Innenraum-Tickets
     */
    public Ticket(int kategorie, int preis, int anzahl)
    {
        if(kategorie > 0 && kategorie < 4)
        {
            ticketKategorie = kategorie;
        }
        else
        {
            System.out.println(anzahl+" Keine gültige Ticketkategorie");
        }
        
        ticketPreis = preis;
        anzahlTicketsGesamt = anzahl;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  anzahl   Anzahl gewünschter Tickets
     */
    public void ticketVerkauf(int anzahl)
    {
        if((anzahlTicketsGesamt - (anzahlVerkaufteTickets + anzahl) >= 0))
        {
            anzahlVerkaufteTickets = anzahlVerkaufteTickets + anzahl;
            System.out.println(anzahl+" Tickets der Kategorie "+ticketKategorie+" wurden gerade verkauft! :-)");
        }
        else
        {
            System.out.println("Es sind nur noch "+(anzahlTicketsGesamt - anzahlVerkaufteTickets)+" in der Kategorie "+ticketKategorie+" vorhanden!");
        }
    }
    
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
            return "keine gültige Kategorie";
        }
    }
    
    public int getTicketNr()
    {
        return ticketKategorie;
    }
}
