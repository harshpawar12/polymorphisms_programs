package polymorphism;

class Animal3
{
	void sound()
	{
		System.out.println("animal sounds...!!!");
	}
}
class Bird extends Animal3
{
	void sound()
	{
		System.out.println("Making sounds Birds...");
	}
}
class cat1 extends Animal3
{
	void sound()
	{
		System.out.println("Making sound cat...");
	}
}
public class MethodOverloading2 {
/*
 * Write a Java program to create a base class Animal 
 * (Animal Family) with a method called Sound().
 *  Create two subclasses Bird and Cat.
 *   Override the Sound() method in each subclass
 *    to make a specific sound for each animal.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3 obj=new Bird();
		Animal3 obj1=new cat1();
		obj1.sound();
		obj.sound();

	}

}
