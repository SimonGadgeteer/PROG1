import java.util.ArrayList;

/**
 * Java Applikation zur Verwaltung eines Events, welcher einen spezifischen Künstler, bzw. Künstlergruppe
 * enthält. Zusätzlich können verschiedene Ticketkategorien mit einer individuellen Anzahl und Preis
 * definiert werden.
 * 
 * @author David Kramer, Simon Schwarz 
 * @version 0.3a
 */
public class Event
{
   Kuenstler kuenstler;
   Ticket ticket;
   ArrayList<Ticket> alleTickets = new ArrayList<Ticket>();

    /**
     * Constructor for objects of class Event
     */
    public Event()
    {
        // initialise instance variables
    }


    /**
     * Erstellt einen neue Ticketkategorie
     * 
     * @param kategorie	Ticketkategorie
     * @param preis		Preis der Tickets in dieser Kategorie
     * @param anzahl	Anzahl vorhanden Tickets in der Kategorie
     */
    public void setTicket(int kategorie,int preis, int anzahl)
    {
        ticket = new Ticket(kategorie, preis, anzahl);
        alleTickets.add(ticket);
    }
    
    /**
     * Methode um Tickets zu verkaufen, bzw. kaufen.
     * 
     * @param anzahl	Die gewünschte Anzhal Tickets welche gekauft werden sollten
     * @param kategorie	Die gewünschte Ticketkategorie
     */
    public void kaufeTickets(int anzahl, int kategorie)
    {
        boolean verkauft = false;
        
        for(int i = 0; i < alleTickets.size(); i++)
        {
            Ticket tempTicket = alleTickets.get(i);
            
            if(tempTicket.getTicketNr() == kategorie)
            {
                alleTickets.get(i).ticketVerkauf(anzahl);
                verkauft = true;
            }
        }
        
        if(!verkauft)
        {
            System.out.println("Die gewünschte Kategorie hat noch keine Tickets verkauft");
        }
    }
    
    /**
     * Erstellt einen neuen Künstler oder Gruppe.
     * 
     * @param bezeichnung	Name der Gruppe, des Künstlers
     * @param gage			Verdienst des / der Künstler
     */
    public void setKuenstler(String bezeichnung, int gage)
    {
        kuenstler = new Kuenstler(bezeichnung, gage);
    }
}
