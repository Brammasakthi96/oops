//1.Create a class Student with student name and marks. Display the details.
package oops;
class student
{
	String name;
	int mark;
	void display(String name,int mark)
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student's Mark: "+mark);
	}
}
public class que1 {

	public static void main(String[] args) 
	{
		student s =new student();
		s.display("Arun",96);
	}
}
