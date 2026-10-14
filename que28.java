//QUES 28: Create student management system using private variables.
package mental;
public class que28 {
	private String studentname;
	private int rollno;
	private char grade;
	public void setstudentname(String name)//set name
	{
		this.studentname=name;
	}
	public String getstudentname()//getname
	{
		return this.studentname;
	}
	public void setrollno(int roll) //set rollno
	{
		this.rollno=roll;
	}
	public int getrollno() //get rollno
	{
		return this.rollno;
	}
	public void setgrade(char grade)//set grade
	{
		this.grade=grade;
	}
	public char getgrade()//get grade
	{
		return this.grade;
	}

	public static void main(String[] args) 
	{
		que28 q= new que28();
		System.out.println("STUDENT INFORMATION USING PRIVATE VARIABLES\n");
		q.setstudentname("Malar");
		q.setrollno(101);
		q.setgrade('A');
		System.out.println("Student name: "+q.getstudentname()+"\nRollno: "+q.getrollno()+"\nGrade: "+q.getgrade());
	}
}
