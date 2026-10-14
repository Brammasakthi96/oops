//QUES 19: Create method overriding example using Payment classes.
package oops;
class payment
{
	void pay()
	{
		System.out.println("Payment is Processing");
	}
}
class gpay extends payment
{
	void pay()
	{
		System.out.println("Payment through Gpay");
	}
}
class netbanking extends payment
{
	void pay()
	{
		System.out.println("Payment through NetBanking");
	}
}
public class que19 {
	public static void main(String[] args) 
	{
		payment p1=new gpay();
		payment p2= new netbanking();
		System.out.println("Method Overriding using payment class\n");
		p1.pay();
		p2.pay();
	}
}
