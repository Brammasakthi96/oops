//QUES 43: Create food delivery system using classes and inheritance.
package mental;
class onlinefoodservice
{
	String foodname="Pizza";
	int price=150;
	void display_Items()
	{
		System.out.println("Food Name: "+foodname);
		System.out.println("Food Price: "+price);
	}
}
class delivery extends onlinefoodservice
{
	String customername="Lakshmi";
	String location="Avadi";
	int Deliverycharge=50;
	void display_delivery()
	{
		System.out.println("\nCustomer Name: "+customername);
		System.out.println("Customer Location: "+location);
		System.out.println("Delivery Charges: "+Deliverycharge);
		System.out.println("Total amount: "+(Deliverycharge+price));
	}
}
public class que43 {
	public static void main(String[] args) 
	{
		delivery d =new delivery();
		System.out.println("FOOD DELIVERY \n");
		d.display_Items();
		d.display_delivery();
	}
}
