//QUES 50:  Create an online examination system using complete OOP concepts.
package mental;
abstract class OnlineExam
{
	private String name;
	private int Examno;
	private int marks;
	public OnlineExam(String name, int examno) 
	{
		this.Examno=examno;
		this.name=name;
	}
	public void set_Marks(int marks)
	{
		this.marks=marks;
	}
	abstract void StartExam(); //method declare
	void showresult()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student Examno: "+Examno);
		System.out.println("Student marks: "+marks);
	}
}
class StudentExam extends OnlineExam
{
	StudentExam(String name, int examno) 
	{
		super(name, examno);
	}
	@Override
	void StartExam() 
	{
		System.out.println("Online Exam is finished and Results out");
	}
}
public class que50 {
	public static void main(String[] args) 
	{
		StudentExam se= new StudentExam("Rama",2356);
		se.StartExam();
		se.set_Marks(76);
		se.showresult();
	}
}
