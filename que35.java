//QUES 35: Create abstract class Shape and implement area calculation.
package mental;
abstract class Shape
{
	abstract void calculation();
}
class Circle extends Shape
{
	double radius=6;
	void calculation()
	{
		System.out.println("Area of circle formula: PIr*r");
		double circle=31.4*radius*radius;
		System.out.println("Area of circle for radius 6: "+circle);
	}
}
class Rectangle extends Shape
{
	int length=10;
	int breadth=4;
	void calculation()
	{
		System.out.println("\nArea of Rectangle formula: length* breadth");
		double rectangle=length*breadth;
		System.out.println("Area of Rectangle for length is 10 & breadth is 4: "+rectangle);
	}
}
public class que35 {
	public static void main(String[] args) 
	{
		System.out.println("AREA CALCULATION OF CIRCLE AND RECTANGLE\n");
		Circle c =new Circle();
		c.calculation();
		
		Rectangle r = new Rectangle();
		r.calculation();
	}
}
