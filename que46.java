//QUES 46: Create a mini banking application using all OOP concepts.
package mental;
import java.util.Scanner;
abstract class Bank  //abstract class
{
	abstract void CalculateIntrest(); //Method decleration
}
class Account extends Bank  //Encapsulation
{
	private String name;
	private double balance;
	Account(String name,double balance) //constructor
	{
		this.name=name;
		this.balance=balance;
	}
	void deposit(double amount) //deposit method
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Amount Deposited: "+amount);
		}else
		{
			System.out.println("Invalid Amount");
		}
	}
	void withdraw(double amount)  //withdraw method
	{
		if(amount>0 && amount <=balance)
		{
			balance=balance-amount;
			System.out.println("Amount Withdrawn "+amount+" Successfully");
		}else
		{
			System.out.println("Invalid amount or insufficient amount");
		}
	}
	void displayBalance()    //display balance
	{
		System.out.println("Account Holder name: "+name);
		System.out.println("Your Remaining Balance "+balance);
	}
	void CalculateIntrest() //method override
	{
		System.out.println("Savings Intrest rate: 6%");
	}
}
class SavingsAccount extends Account //inheritence
{

	SavingsAccount(String name, double balance) 
	{
		super(name, balance);
	}
	void CalculateIntrest()
	{
		System.out.println("Savings Intrest rate: 6%");
	}
	
}
public class que46 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to SY Bank");
		System.out.println("Enter the Account Holder name: ");
		String name= sc.nextLine();
		System.out.println("Enter Initial Balance: ");
		double amount=sc.nextInt();
		double balance = 0;
		SavingsAccount account = new SavingsAccount(name,balance);
		
		int num;
		do
		{
			System.out.println("\n MINI BANKING APPLICATION");
			System.out.println("1.DEPOSIT");
			System.out.println("2.WITHDRAW");
			System.out.println("3.DISPLAY BALANCE");
			System.out.println("4.CALCULATE INTREST");
			System.out.println("5.EXIT");
			System.out.println("ENTER YOUR CHOICE");
			num = sc.nextInt();
			switch(num)
			{
			case 1: System.out.println("Enter your Deposit Amount");
			account.deposit(sc.nextDouble());
			break;
			case 2: System.out.println("Enter your withdrawn Amount");
			account.withdraw(sc.nextDouble());
			break;
			case 3: System.out.println("Checking Balance");
			account.displayBalance();
			break;
			case 4: System.out.println("Calculating Intrest");
			account.CalculateIntrest();
			break;
			case 5:System.out.println("Thank you for Visiting");
			break;
			default: System.out.println("Invalid choice");
			}
			
		} while(num != 5);
		sc.close();
	}

}
