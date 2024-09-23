package polymorphism;

class Animall
{
	void move()
	{
	System.out.println("Animal moves..");	
	}
	void makesound()
	{
		System.out.println("Animal sounds..");	
	
	}
}
class Birdd extends Animall
{
	void move()
	{
		System.out.println("Bird flying in sky..");	
	
	}
	void makesound()
	{
		System.out.println("Bird making in sounds..");	

	}
}
class snake extends Animall
{
	void move()
	{
		System.out.println("snake are moving in landSpaces ");	
	
	}
	void makesound()
	{
		System.out.println("snake in making sounds.");	

	}
}

public class MethodOverriding {
	/*
	 * 7. Write a Java program to create a base class
	 *  Animal with methods move() and makeSound().
	 *   Create two subclasses Bird and Panthera.
	 *    Override the move() method in each subclass
	 *     to describe how each animal moves. Also,
	 *      override the makeSound() method in each
	 *       subclass to make a specific sound for
	 *        each animal.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animall obj=new Birdd();
		obj.makesound();
		obj.move();
		Animall obj1=new snake();
		obj1.move();
		obj1.makesound();

	}

}
