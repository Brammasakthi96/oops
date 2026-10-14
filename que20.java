//QUES 20: Create polymorphism example using Vehicle classes with same start() method.
package oops;
class transportation
{
	void start()
	{
		System.out.println("Vehicles are ready to start");
	}
}
class Auto extends transportation
{
	void start()
	{
		System.out.println("Auto is ready to move");
	}
}
class twowheelers extends transportation
{
	void start()
	{
		System.out.println("TwoWheeler is ready to move");
	}
}
public class que20 {
	public static void main(String[] args) 
	{
		transportation t1 =new Auto();
		transportation t2=new twowheelers();
		System.out.println("Polymorphism example using runtime polymorphism\n");
		t1.start();
		t2.start();
		}
}
