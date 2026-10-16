//QUES 48: Create a college management system using hierarchical inheritance.
package mental;
class DonCollege//Parent class
{
	void CollegeDetails()
	{
		System.out.println("\nDon College Autonomus");
	}
}
class DonStudent extends DonCollege //Child Class1 inherit parent class
{
	void StudentDetails()
	{
		System.out.println("Student name: Lakshmi");
		System.out.println("Department: EEE");
		System.out.println("Year: 3rd year");
	}
}
class DonTeacher extends DonCollege //Child class 2 inherit parent class
{
	void TeacherDetails()
	{
		System.out.println("Teacher name: Rocky");
		System.out.println("Department: EEE");
		System.out.println("Year of Experience: 7years");
	}
}
public class que48 {
	public static void main(String[] args) 
	{
		DonStudent ds= new DonStudent();
		System.out.println("Student Details of DonCollege");
		ds.CollegeDetails();
		ds.StudentDetails();
		
		DonTeacher dt= new DonTeacher();
		System.out.println("\nTeacher Details of DonCollege");
		dt.CollegeDetails();
		dt.TeacherDetails();
	}
}
