//QUES 17: Create a parent class Shape and child classes Circle and Rectangle.
package oops;
class Shape
{
	void shape()
	{
		
		System.out.println("\nShapes example: \nRectangle\nTriangle\nCircle\npyramid");
	}
}
class Circle extends Shape
{
	void circ()
	{
		System.out.println("I am circle");
	}
}
class Rectangle extends Shape
{
	void rect()
	{
		System.out.println("I am Rectangle");
	}
}
public class que17 {
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.shape();
		c.circ();
		
		Rectangle r=new Rectangle();
		r.shape();
		r.rect();
	}
}
