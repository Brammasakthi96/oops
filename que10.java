//QUES 10: Create a class Hospital with doctor name and department using constructor.
package oops;
class hospital
{
	String doctorname;
	String department;
	hospital(String doc,String dep)
	{
		doctorname=doc;
		department=dep;
	}
	void display()
	{
		System.out.println("Doctor Name: "+doctorname);
		System.out.println("Department: "+department);
	}
}
public class que10 {
	public static void main(String[] args) 
	{
		hospital h =new hospital("Dr.Sharan","Pediatrician");
		System.out.println("DOCTOR DETAILS");
		h.display();

	}

}
