//QUES 9: Create a class Movie with constructor and print movie details.
package oops;
class movie
{
	String moviename;
	String Hero;
	double rate;
	movie(String m,String h,double r)
	{
		moviename=m;
		Hero=h;
		rate=r;
	}
	void display()
	{
		System.out.println("\nMovie name: "+moviename);
		System.out.println("Hero Name: "+Hero);
		System.out.println("Star Rating: "+rate);
	}
}
public class que9 {
	public static void main(String[] args) 
	{
		movie M = new movie("Sigma","Sundeep",4.5);
		System.out.println("MOVIE DETAILS");
		M.display();
	}
}
