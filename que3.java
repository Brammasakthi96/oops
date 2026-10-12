//QUE3: Create a class Employee with employee ID, name, and salary.
package oops;
class employee
{
	int employeeId;
	String name;
	String salary;
	void display()
	{
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee name: "+name);
		System.out.println("Employee Salary: "+salary);
	}
}

public class que3 {
	public static void main(String[] args) 
	{
		employee e =new employee();
		e.employeeId=10;
		e.name="Aravind";
		e.salary="40,000/-";
		System.out.println("EMPLOYEE DETATILS\n");
		e.display();
	}
}
