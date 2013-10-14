import java.util.ArrayList;

/**
 * Java Applikation zur Verwaltung eines Events, welcher einen spezifischen Kuenstler, bzw. Kuenstlergruppe
 * enthaelt. Zusaetzlich koennen verschiedene Ticketkategorien mit einer individuellen Anzahl und Preis
 * definiert werden.
 * 
 * @author Dave Kramer, Simon Schwarz 
 * @version 0.3a
 */

public class Event
{
   Kuenstler kuenstler;
   Ticket ticket;
   ArrayList<Ticket> alleTickets = new ArrayList<Ticket>();
   int ticketKategorien[];

    public Event(String kuenstlerBezeichnung, int kuenstlerGage,
    		int ticketAnzahlKategorie1, int ticketPreisKategorie1,
    		int ticketAnzahlKategorie2, int ticketPreisKategorie2,
    		int ticketAnzahlKategorie3, int ticketPreisKategorie3)
    {  
    	int ticketKategorien[] = {1, 2, 3};
    	int ticketAnzahl[] = {ticketAnzahlKategorie3, ticketAnzahlKategorie3, ticketAnzahlKategorie3};
    	int ticketPreise[] = {ticketPreisKategorie3, ticketPreisKategorie3, ticketPreisKategorie3};
    	
    	kuenstler = new Kuenstler(kuenstlerBezeichnung, kuenstlerGage);
    	for(int i = 0; i < ticketKategorien.length; i++)
    	{
    		setTicket(ticketKategorien[i], ticketAnzahl[i], ticketPreise[i]);
    	}
    }
    
    /**
     * Erstellt einen neuen Event ohne Parameter. Tickets und Kuenstler koennen im Nachhinen mittels setter-Methoden gesetzt werden.
     */
    public Event()
    {
        //Ich mache nichts
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
    	if (alleTickets.size() < 3)
    	{
    		ticket = new Ticket(kategorie, preis, anzahl);
        	alleTickets.add(ticket);
    	}
    	else
    	{
    		System.out.println("Keine Ticketkategorien mehr einzurichten.(Max. 3)");
    	}
    }
    
    /**
     * Methode um Tickets zu verkaufen, bzw. kaufen.
     * 
     * @param anzahl	Die gew�nschte Anzhal Tickets welche gekauft werden sollten
     * @param kategorie	Die gew�nschte Ticketkategorie
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
            System.out.println("Die gewuenschte Kategorie hat noch keine Tickets verkauft");
        }
    }
    
    /**
     * Erstellt einen neuen Kuenstler oder Gruppe.
     * 
     * @param bezeichnung	Name der Gruppe, des Kuenstlers
     * @param gage			Verdienst des / der Kuenstler
     */
    public void setKuenstler(String bezeichnung, int gage)
    {
        kuenstler = new Kuenstler(bezeichnung, gage);
    }
    
    public void outputEvent()
    {
    	int ticketGesamtEinnahmen = 0;
    	String outputString = "Kuenstler: " + kuenstler.getKuenstlerName() + ", Gage CHF " + kuenstler.getKuenstlerGage() + "\n";
    	
    	for(Ticket ticket: alleTickets)
    	{
    		outputString += ticket.getTicketKategorieName() + ": " +
    				ticket.getTicketVerkauftAnzahl() + " von " + ticket.getTicketAnzahl() + " verkauft" +
    				", Einnahmen: CHF " + (ticket.getTicketVerkauftAnzahl() * ticket.getTicketAnzahl()) + "\n";
    		ticketGesamtEinnahmen += ticket.getTicketVerkauftAnzahl() * ticket.getTicketPreis();
    	}
    	outputString += "Gesamteinnahmen: " + ticketGesamtEinnahmen;
    	outputString += "\nGewinn: " + (ticketGesamtEinnahmen - kuenstler.getKuenstlerGage());
    	System.out.println(outputString);
    }
}
