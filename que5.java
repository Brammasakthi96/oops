//QUES 5: Create a class Book with title and author name. Print the information.
package oops;
class book
{
	String title;
	String author;
	void display()
	{
		System.out.println("\nTitle of the book: "+title);
		System.out.println("Author's name of book: "+author);
	}
}
public class que5 {

	public static void main(String[] args) {
		book a=new book();
		a.title="PONNIYIN SELVAN";
		a.author="Kalki";
		
		book b= new book();
		b.title="MUSIC";
		b.author="Beetoven";
		System.out.println("BOOK DETAILS");
		a.display();
		b.display();
	}
}
