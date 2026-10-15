//QUES 38: Create school management system using inheritance and encapsulation.
package mental;
class XySchoolteacher
{
	private String teachername;
	private int teacherage;
	private String Subject;
	
	public void set_Teacher_Details(String name,int age,String subj)//set method
	{
		this.teachername=name;
		this.teacherage=age;
		this.Subject=subj;
	}
	public String get_Teacher_name()//get method
	{
		return this.teachername;
	}
	public int get_Teacher_age()//get method
	{
		return this.teacherage;
	}
	public String get_Teacher_subject()//get method
	{
		return this.Subject;
	}
}
class XySchoolStudent extends XySchoolteacher
{
	private String Studentname;
	private int Studentrage;
	private int StudentId;
	
	public void set_Student_Details(String name,int age,int studid)//set method
	{
		this.Studentname=name;
		this.Studentrage=age;
		this.StudentId=studid;
	}
	public String get_Student_name()//get method name
	{
		return this.Studentname;
	}
	public int get_Student_age()//get method age
	{
		return this.Studentrage;
	}
	public int get_Student_Id()//get method id
	{
		return this.StudentId;
	}
}
public class que38 {
	public static void main(String[] args) 
	{
		XySchoolStudent x= new XySchoolStudent();
		System.out.println("SCHOOL MANAGEMENT USING INHERITENCE AND ENCAPSULATION\n");
		System.out.println("Teacher name: " +x.get_Teacher_name());
		System.out.println("Teacher age: "+x.get_Teacher_age());
		System.out.println("Teacher Subject: "+x.get_Teacher_subject());
		
		System.out.println("\nStudent name: "+x.get_Student_name());
		System.out.println("Student age: "+x.get_Student_age());
		System.out.println("Student Id: "+x.get_Student_Id());
	}
}
