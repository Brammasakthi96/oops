//QUES 14: Create hierarchical inheritance using School → Student and School → Teacher.
package oops;
class abcschool
{
	void Schoolname()
	{
		System.out.println("I am going to My ABC School");
	}
}
class students extends abcschool
{
	void study()
	{
		System.out.println("I am studying 5th\n");
	}
}
class Teacher extends abcschool
{
	void teach()
	{
		System.out.println("I am a Teacher");
	}
}
public class que14 {
	public static void main(String[] args) 
	{
		System.out.println("ABC SCHOOL");
		students s=new students();
		s.Schoolname();
		s.study();
		
		Teacher t=new Teacher();
		t.Schoolname();
		t.teach();
		}
}
