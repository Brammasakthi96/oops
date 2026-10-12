//QUES 6: Create a class Person using constructor to initialize name and age.
package oops;
class person
{
	String name;
	int age;
	person(String n,int a)
	{
		name=n;
		age=a;
	}
	void display() 
	{
		System.out.println("Name of the person: "+name);
		System.out.println("Person's Age: "+age);
	}
}
public class que6 {

	public static void main(String[] args) 
	{
		person p =new person("Aparna",29);
		p.display();
	}
}
