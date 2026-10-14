//QUES 25: Create a class Bank with private balance variable.
package mental;
public class que25 
{
		private double balance=5000;
		public double getbalance()
		{
			return balance;
		}
		public void setbalance(double updatedamount)
		{
			this.balance=updatedamount+balance;
		}
	public static void main(String[] args) 
	{
		 que25 q= new que25();
		 System.out.println("Bank balance private variable\n");
		 System.out.println("Initial Balance: "+q.getbalance());
		 q.setbalance(500);
		 System.out.println("Updated balance: "+q.getbalance());
	}
}
