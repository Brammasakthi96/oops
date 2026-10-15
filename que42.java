//QUES 42: Create cab booking application using OOP concepts.
package mental;
abstract class ABcab_Service //abstract 
{
	abstract void bookcab(); //abstract method declaration
	private String drivername; //using private
	private double amount;
	
	ABcab_Service(String name,double amount)//using constructor
	{
		this.drivername=name;
		this.amount=amount;
	}
	public String get_DriverName() //get method for name private variables
	{
		return drivername;
	}
	public double get_DriverAmount() //get method for amount
	{
		return amount;
	}
}
class minicab extends ABcab_Service
{
	minicab(String name, double amount) 
	{
		super(name, amount);
	}
	void bookcab() //abstract method override
	{
		System.out.println("Cab Type: Minicab");
		System.out.println("Driver Name: "+get_DriverName());
		System.out.println("Driver Amount: "+get_DriverAmount());
	}
}
public class que42 {
	public static void main(String[] args) 
	{
		minicab m = new minicab("Ram",4500);
		System.out.println("CAB DETAILS\n");
		m.bookcab();
	}
}
