//QUES 31: Create abstract class Vehicle with abstract method start().
package mental;
abstract class vehicle //abstract class
{
	abstract void start(); //abstract method without body
}
class car extends vehicle //inherits
{
	void start()
	{
		System.out.println("Car starts with big sound");	
	}
}
public class que31 {
	public static void main(String[] args) 
	{
		car c=new car();
		c.start();
	}
}
