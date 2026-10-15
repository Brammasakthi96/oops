//QUES 34: Create abstraction example using online payment system.
package mental;
abstract class online_payment
{
	abstract void Payment();
}
class UPI extends online_payment
{
	void Payment()
	{
		System.out.println("Payment through UPI");
		System.out.println("Payment Successful");
	}
}
public class que34 {
	public static void main(String[] args) 
	{
		UPI u = new UPI();
		u.Payment();
	}
}
