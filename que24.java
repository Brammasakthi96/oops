//QUES 24: Create real-time example for runtime polymorphism.
package mental;
class food
{
	void preparefood()
	{
		System.out.println("Preparing food");
	}
}
class pizza extends food
{
	void preparefood()
	{
		System.out.println("Preparing Pizza");
	}
}
class burger extends food
{
	void preparefood()
	{
		System.out.println("Preparing Burger");
	}
}
public class que24 {
	public static void main(String[] args) 
	{
		food f= new pizza();
		food ff=new burger();
		f.preparefood();
		ff.preparefood();
	}
}
