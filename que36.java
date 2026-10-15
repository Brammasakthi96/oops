//QUES 36: Create abstraction example using employee management system.
package mental;
abstract class Employee_management
{
	abstract void display_details();
}
class Manager extends Employee_management
{
	String name="Raj";
	int empid=101;
	double salary=65000.00;
	void display_details()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee Id: "+empid);
		System.out.println("Employee Salary: "+salary);
	}
}
public class que36 {
	public static void main(String[] args) 
	{
		Manager m= new Manager();
		System.out.println("EMPLOYEE DETAILS\n");
		m.display_details();
	}
}
