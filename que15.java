//QUES 15: Create multiple inheritance using Father, Mother, and Child.
package oops;
interface Father
{
	void father();
	
}
interface Mother
{
	void mother();
}
class Child implements Father,Mother
{
	public void father() 
	{
		System.out.println("I am a father");
	}
	public void mother()
	{
		System.out.println("I am a Mother");
	}
	public void child()
	{
		System.out.println("I am a Child");
	}
}
public class que15 {
	public static void main(String[] args) 
	{
		Child c =new Child();
		System.out.println("MULTIPLE INHERITENCE USING INTERFACE\n");
		c.father();
		c.mother();
		c.child();
	}
}
