//QUES 45:  Create movie ticket booking system using encapsulation.
package mental;
class MovieTicket
{
	private String moviename="Bigil";
	private int ticketprice=250;
	private boolean paymentdone=false;
	
	public String get_Moviename() //get method for movie name 
	{
		return moviename;
	}
	public int get_TicketPrice() //get method for ticket price
	{
		return ticketprice;
	}
	public boolean get_PaymentStatus() //get method for status
	{
		return paymentdone;
	}
	public void set_Paymentdone(boolean status)  //set method
	{
		paymentdone=status;
	}
}
public class que45 {
	public static void main(String[] args) 
	{
		MovieTicket m = new MovieTicket();
		m.set_Paymentdone(true);
		System.out.println("MOVIE TICKET BOOKING\n");
		System.out.println("Movie Name: "+m.get_Moviename());
		System.out.println("Ticket Price: "+m.get_TicketPrice());
		System.out.println("Payment done: "+m.get_PaymentStatus());
	}
}
