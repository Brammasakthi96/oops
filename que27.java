//QUES 27: Create encapsulation example using ATM PIN.
package mental;
public class que27 {
	private int pin=6565;
	private int enteredpin;
	public void setpin(int enteredpin)
	{
		if(this.pin==enteredpin)
		{
			System.out.println("The entered pin is correct wait for process");
		}
		else
		{
			System.out.println("Re-enter the pin");
		}
	}
	public void getpin()
	{
		if(this.pin==this.enteredpin)
		{
		System.out.println("welcome to sb bank");
		}
	}

	public static void main(String[] args) 
	{
		que27 q= new que27();
		System.out.println("ATM PIN\n");
		q.setpin(6565);
		q.getpin();
	}
}
