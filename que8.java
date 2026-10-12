//QUES 8: Create a class BankAccount with constructor for account holder and balance.
package oops;
class BankAccount
{
	String accountholder;
    double balance;
	BankAccount(String a,double b)
	{
		accountholder=a;
		balance=b;
	}
	void display()
	{
		System.out.println("Name of Account Holder: "+accountholder);
		System.out.println("Account Balance: "+balance);
	}
}
public class que8 {
	public static void main(String[] args) 
	{
		BankAccount ba=new BankAccount("Amar",450000.00);
		System.out.println("BANK ACCOUNT DETAILS");
		ba.display();
	}
}
