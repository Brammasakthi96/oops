//QUES 37: Create library management system using classes and objects.
package mental;
class Library
{
	String Bookname;
	String Author;
	int Bookno;
	void display_Bookdetails()
	{
		System.out.println("Bookno: "+Bookno);
		System.out.println("Bookname: "+Bookname);
		System.out.println("Author of the Book: "+Author);
	}
}
public class que37 {
	public static void main(String[] args) 
	{
		Library l= new Library();
		l.Bookno=101;
		l.Bookname="Ponniyin Selvan";
		l.Author="Kalki";
				
		Library ll= new Library();
		ll.Bookno=102;
		ll.Bookname="MR.Bean Book";
		ll.Author="MR.Bean";
		
		l.display_Bookdetails();
		ll.display_Bookdetails();
	}
}
