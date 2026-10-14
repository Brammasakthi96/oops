//QUES 26: Create getter and setter methods for employee salary.
package mental;
public class que26 
{
	private double salary;
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double salary)
	{
		if(salary>=0)
		{
			this.salary=salary;
		}else {
			System.out.println("Salary cannont be negative");
		}
	}
	public static void main(String[] args) 
	{
		que26 q=new que26();
		System.out.println("Create getter setter methods\n");
		q.setsalary(50000);
		System.out.println("Employee salary "+q.getsalary());
	}
}
