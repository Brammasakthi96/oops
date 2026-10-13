//QUES 11: Create a class Animal and child class Dog. Display both methods.
package oops;
class Animal
{
	void eat()
	{
	System.out.println("Animals are eating");
	}
}
class Dog extends Animal
{
	void dog()
	{
		System.out.println("The dogs are barking");
	}
}
public class que11 {
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		System.out.println("ANIMAL CLASS INHERITED BY DOG CLASS\n");
		d.dog();
		d.eat();
	}
}
