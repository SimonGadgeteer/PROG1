import java.util.ArrayList;

/**
 * Write a description of class Event here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setTicket(int kategorie,int preis, int anzahl)
    {
        ticket = new Ticket(kategorie, preis, anzahl);
        alleTickets.add(ticket);
    }
    
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
            System.out.println("Die gewünschte Kategorie hat noch keine Tickets");
        }
    }
    
    public void setKuenstler(String bezeichnung, int gage)
    {
        kuenstler = new Kuenstler(bezeichnung, gage);
    }
}
