//QUES 18: Create inheritance example for online shopping system.
package oops;
class Shopping
{
	void appname1() 
	{
		System.out.println("\nMEESHO APP");
	}
	void appname2() 
	{
		System.out.println("\nFLIPKART APP");
	}
}
class product1 extends Shopping
{
	void dress()
	{
		System.out.println("Chudithar is ordered");
	}
}
class product2 extends Shopping
{
	void slipper()
	{
		System.out.println("Slipper is ordered");
	}
}
class delivery1 extends product1
{
    void deliver1()
    {
    	System.out.println("Chudithar is delivered");
    }
}
class delivery2 extends product2 
{
    void deliver2()
    {
    	System.out.println("Slipper is delivered");
    }
}
public class que18 {
	public static void main(String[] args) 
	{
		System.out.println("SHOPPING DETAILS");
		delivery1 d =new delivery1();
		d.appname1();
		d.dress();
		d.deliver1();
		
		delivery2 dd=new delivery2();
		dd.appname2();
		dd.slipper();
		dd.deliver2();
	}
}
