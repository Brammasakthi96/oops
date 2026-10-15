//QUES 41: Create employee payroll system using inheritance.
package mental;
class ABCEmployee
{
	int id=101;
	String name="Ranjith";
	double salary=45000.00;
	void payroll()
	{
		System.out.println(" 500+ employees are worked here");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+id);
		System.out.println("Employee Salary: "+salary);
	}
}
class calculation extends ABCEmployee
{
	double bonus=3000;
	void calculationbonus()
	{
		double total=bonus+salary;
		System.out.println("Employee Salary with Bonus: "+total);
	}
}
public class que41 {
	public static void main(String[] args) 
	{
		calculation c = new calculation();
		c.payroll();
		c.calculationbonus();
	}
}
