//QUES 7: Create a class Laptop using constructor and display laptop details.
package oops;
class laptop
{
	String lapname;
	String price;
	laptop(String l,String p)
	{
		lapname=l;
		price=p;
	}
	void dislay()
	{
		
		System.out.println("\nName of the Laptop: "+lapname);
		System.out.println("Price of the Laptop: "+price);
    }
}
public class que7 {
	public static void main(String[] args) 
	{
		laptop l=new laptop("HP","50,000/-");
		System.out
		.println("LAPTOP DETAILS");
		l.dislay();
	}
}
