//QUES 39: Create online shopping cart using OOP concepts.
package mental;
abstract class Product_Details
{
	private String productname;  //using encapsulation
	private int price;
	abstract void display();//abstract method
	Product_Details(String name, int price) //constructor
	{
		this.productname=name;
		this.price=price;
	}
	public String get_Product_Name() //get method
	{
		return productname;
	}
	public int get_Product_Price()//get method
	{
		return price;
	}
}
class onlineCart extends Product_Details //using inheritence
{
	onlineCart(String name,int price)
	{
		super(name,price);
	}
	@Override
	void display() //using polymorphism method override
	{
		System.out.println("Product Name: "+get_Product_Name());
		System.out.println("Product Price: "+get_Product_Price());
	}
}
public class que39 {
	public static void main(String[] args) 
	{
		onlineCart o = new onlineCart("Chudithar",500);
		System.out.println("ONLINE SHOPPING CART\n");
		o.display();
	}
}
