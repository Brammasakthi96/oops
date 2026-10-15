//QUES 44: Create e-commerce payment system using polymorphism.
package mental;
class ecommerce
{
	void makepayment()
	{
		System.out.println("Select payment Method");
	}
}
class CashonDelivery extends ecommerce
{
	void makepayment()
	{
		System.out.println("Payment Method: Cash on Delivery");
		System.out.println("Pay Rs.1000 when the product arrives");
	}
}
class Netbanking extends ecommerce
{
	void makepayment()
	{
		System.out.println("\nPayment Method: NetBanking");
		System.out.println("Rs.1000 paid Successfully");
	}
}
public class ques44 {
	public static void main(String[] args) 
	{
		System.out.println("E-COMMERCE PAYMENT SYSTEM USING POLYMORPHISM\n");
		ecommerce e= new CashonDelivery();
		e.makepayment();
		
		ecommerce ee= new Netbanking();
		ee.makepayment();
	}
}
