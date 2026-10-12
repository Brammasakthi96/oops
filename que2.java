//QUES 2: Create a class Car with brand and price. Print car details using object.
package oops;
class car
{
	
	void display(String brand,String price)
	{
		System.out.println("Car Brand: "+brand);
		System.out.println("Price of car: "+price);
	}
}
public class que2 {

	public static void main(String[] args) 
	{
		car c =new car();
		
		c.display("BMW","10,00,000/-");
	}

}
