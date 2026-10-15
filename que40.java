//QUES 40: Create hotel booking system using abstraction and polymorphism.
package mental;
abstract class Hotel//abstract class
{
	abstract void booking();//abstract method declaration
}
class booking extends Hotel
{
	public void booking()//method override polymorphism
	{
		System.out.println("ROOM BOOKING DETAILS\n");
		System.out.println("Deluxe Room Booked for Rs.3000");
		System.out.println("Non Deluxe Room Booked for Rs.2500");
	}
}
public class que40 {
	public static void main(String[] args) 
	{
		booking b= new booking();
		b.booking();
	}
}
