//QUES 33: Create abstraction example using ATM machine.
package mental;
abstract class ATMmachine
{
	abstract void CheckBalance();
}
class Customerinfo extends ATMmachine
{
	void CheckBalance()
	{
		System.out.println("Account Holder Name: Rocky");
		System.out.println("Remaining Balance: 15,000/-");
	}
}
public class que33 {
	public static void main(String[] args) 
	{
		Customerinfo c= new Customerinfo();
		System.out.println("ABSTRACTION USING ATM MACHINE\n");
		c.CheckBalance();
	}
}
