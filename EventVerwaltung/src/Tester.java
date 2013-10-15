
public class Tester {

	public static void main (String[] args){
		Event event = new Event("Dave Tha King", 200000, 100, 1000, 200, 400, 300, 100);
		event.kaufeTickets(200, 1);
		event.kaufeTickets(100, 2);
		event.kaufeTickets(300, 2);
		event.kaufeTickets(50, 3);
		event.outputEvent();
			

		System.out.println("\nUnd jetzt parameterlos\n");
		
		Event parameterlessEvent = new Event();
		parameterlessEvent.setKuenstler("Simon Black", 4);
		parameterlessEvent.setTicket(1, 20, 10);
		parameterlessEvent.setTicket(2, 10, 5);
		parameterlessEvent.kaufeTickets(2, 1);
		parameterlessEvent.kaufeTickets(2, 2);
		parameterlessEvent.outputEvent();
	}

}
