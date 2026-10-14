//QUES 29: Create hospital record system using encapsulation.
package mental;
public class que29 {
	private int patientno=10;
	private String docname="Dr.Hema";
	private int age=65;
	private String disease="Cardio arrest";
	
	public int getpatientno()//get method patientno
	{
		return this.patientno;
	}
	public int getpatientage()//get method age
	{
		return this.age;
	}
	public String getpatientdisease() //get method disease
	{
		return this.disease;
	}
	public String getdocname() //get method docname
	{
		return this.docname;
	}
	public static void main(String[] args) 
	{
		que29 q= new que29();
		System.out.println("HOSPITAL RECORD USING ENCAPSULATION\n");
		System.out.println("Patient no: "+q.getpatientno());
		System.out.println("Patient age: "+q.getpatientage());
		System.out.println("Patient disease: "+q.getpatientdisease());
		System.out.println("Doctor Name: "+q.getdocname());
	}
}
