//QUES 49:  Create a smart device system using abstraction and inheritance.
package mental;
abstract class SmartDevice
{
	abstract void turnon();
	void connectwifi()
	{
		 System.out.println("Wifi is connected");
	}
}
class SmartTV extends SmartDevice //child class
{
	@Override
	void turnon() 
	{
		System.out.println("Smart TV is turned on");
	}
}
class SmartAC extends SmartDevice //child class
{
	@Override
	void turnon() 
	{
		System.out.println("\nSmart AC is turned on");
	}
}
public class que49 {
	public static void main(String[] args) 
	{
		SmartTV tv=new  SmartTV();
		System.out.println("Smart Device using Abstraction and Inheritence\n");
		tv.turnon();
		tv.connectwifi();
		
		SmartAC ac = new SmartAC();
		ac.turnon();
		ac.connectwifi();
	}
}
