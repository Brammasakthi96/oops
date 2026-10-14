//QUES 22: Create polymorphism example using Employee salary calculation.
package oops;
class tcsemployee
{
	void salarycalc()
	{
		System.out.println("Salary calculation is done");
	}
}
class developers extends Employee
{
	void salarycalc()
	{
		int salary=35000;
		System.out.println("Developers salary: "+salary);
	}
}
class Tester extends Employee
{
	void salarycalc() 
	{
		int salary=30000;
		System.out.println("Tester Salary: "+salary);
	}
}
public class que22 {

	public static void main(String[] args) 
	{
		tcsemployee t= new developers();
		

	}

}
