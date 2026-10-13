//QUES 12: Create a class Vehicle and child class Bike. Show inheritance.
package oops;
class vehicle
{
	void car()
	{
		System.out.println("The car is ready");
	}
}
class bike extends vehicle
{
	void bikes()
	{
		System.out.println("The bike is ready");
	}
}
public class que12 {
	public static void main(String[] args) 
	{
		bike b=new bike();
		System.out.println("VEHICLE CLASS INHERITED BY CHILD CLASS\n");
		b.bikes();
		b.car();
	}
}
