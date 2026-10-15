//QUES 32: Create abstract class Bank with abstract method interest_rate().
package mental;
abstract class ReserveBank
{
	abstract void intrest_rate();
}
class CanaraBank extends ReserveBank
{
	void intrest_rate()
	{
		System.out.println("The intrest percentage is 7%");
	}
}
public class que32 {
	public static void main(String[] args) 
	{
		CanaraBank c= new CanaraBank();
		c.intrest_rate();
	}
}
