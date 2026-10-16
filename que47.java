//QUES 47:  Create a student result processing system using polymorphism.
package mental;
import java.util.Scanner;
class GHSchoolStudents
{
	String name;
	int mark1,mark2,mark3;
	GHSchoolStudents(String name,int mark1,int mark2,int mark3)
	{
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void ResultCalculation()
	{
		System.out.println("Student Result: ");
	}
}
class Result extends GHSchoolStudents
{
	Result(String name, int mark1, int mark2,int mark3) 
	{
		super(name, mark1,mark2,mark3);
	}
	void ResultCalculation()
	{
		int total=mark1+mark2+mark3;
		double average=total/3;
		System.out.println("STUDENT RESULT");
		System.out.println("Name: "+name);
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
		if(mark1>=35 && mark2>=35 && mark3>=35)
		{
			System.out.println("Result: PASS");
		}else
		{
			System.out.println("Result: FAIL");
		}
	}
}
public class que47 {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Enter Mark1: ");
		int mark1=sc.nextInt();
		System.out.println("Enter Mark2: ");
		int mark2=sc.nextInt();
		System.out.println("Enter Mark3: ");
		int mark3=sc.nextInt();		
		GHSchoolStudents g= new Result(name,mark1,mark2,mark3);
		g.ResultCalculation();
		sc.close();
	}
}
