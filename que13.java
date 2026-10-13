//QUES 13: Create multilevel inheritance using Person → Employee → Manager.
package oops;
class Person
{
	void person()
	{
		System.out.println("I am a Person");
	}
}
class Employee extends Person
{
	void emp()
	{
		System.out.println("I am a Employee");
	}
}
class Manager extends Employee
{
	void manager()
	{
		System.out.println("I am a Manager");
	}
}
public class que13 {

	public static void main(String[] args) 
	{
		Manager m=new Manager();
		System.out.println("MULTILEVEL INHERITENCE PERSON-EMPLOYEE-MANAGER\n");
		m.person();
		m.emp();
		m.manager();
	}
}
