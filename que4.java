//QUES4: Create a class Mobile with model name and price. Display mobile details.
package oops;
class mobile
{
	String name;
	String price;
	void display()
	{
		System.out.println("Mobile Model Name: "+name);
		System.out.println("Mobile price: "+price);
	}
}
public class que4 {
	public static void main(String[] args) 
	{
		mobile m =new mobile();
		m.name="NOTHING";
		m.price="rs.30,000/-";
		System.out.println("MOBILE DETAILS");
		m.display();
	}
}
