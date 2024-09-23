package polymorphism;

class vehicle2
{
	void speedup()
	{
	System.out.println("vehicles.....");	
	}
}
class car2 extends vehicle2
{
	void speedup()
	{
		System.out.println("Car is going to mumbai city in 22km/hr");
	}
}
class Bicycle extends vehicle2
{
	void speedup()
	{
		System.out.println("Bicycle going  city in 4km/hr");
	
	}
}
public class MethodOverriding1 {
	/*
	 * 2. Write a Java program to create a class Vehicle 
	 * with a method called speedUp().
	 *  Create two subclasses Car and  Bicycle.
	 *   Override the speedUp() method in each
	 *    subclass to increase the vehicle's speed
	 *     differently.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle2 obj=new car2();
		vehicle2 obj1=new Bicycle();
		obj.speedup();
		obj1.speedup();
		

	}

}
