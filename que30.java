//QUES 30: Create login system using private username and password.
package mental;
public class que30 {
	private String username="Gowri";
	private String Password="1234@s";
	public void setlogin(String name,String pin)
	{
		if(this.username.equals(name)&&this.Password.equals(pin))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("Entered login is incorrect");
		}
	}
	public static void main(String[] args) {
		que30 q= new que30();
		System.out.println("LOGIN SYSTEM USING PRIVATE USERNAME AND PASSWORD\n");
		q.setlogin("Gowri", "1234@s");
		q.setlogin("Raj", "9090");
	}
}
