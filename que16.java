//QUES 16: Create hybrid inheritance using school management example.
package oops;
class schools
{
	void schoolname()
	{
		System.out.println("ABC School");
	}
}
class pupil extends schools
{
	void student()
	{
		System.out.println("500+ Students are Studying");
	}
}
interface teachers
{
	void teacher();
}
class workers extends pupil implements teachers
{
	public void teacher()
	{
		System.out.println("100 teachers are working");
	}
	void worker()
	{
		System.out.println("30 Helpers are working");
	}
}
public class que16 {
	public static void main(String[] args) 
	{
		workers w=new workers();
		w.schoolname();
		w.student();
		w.teacher();
		w.worker();
		}
}
