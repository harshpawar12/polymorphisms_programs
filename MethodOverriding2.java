package polymorphism;

class shape2
{
	double calculateArea()
	{
		System.out.println("Calculating the area..");
		return 0;
	}
}
class circle2 extends shape2
{
	
	 double calculateArea()
	{
		int r=5;	
		System.out.println("Area of circle");
		return (3.14)*r*2;
		
	}
}
class Rectangle2 extends shape2
{
	double calculateArea()
	{
		int b=4,h=4;
		System.out.println("Area of rectangle");
		return b*h;
		
	}
}
class Tringle2 extends shape2
{
	double calculateArea()
	{
		int b=23,h=9;
		System.out.println("Area of Tringle");

		return (b*h)/2;
		
	}
}
public class MethodOverriding2 {
	/*
	 * 3. Write a Java program to create a base class Shape
	 *  with a method called calculateArea().
	 *   Create three subclasses: Circle, Rectangle, 
	 *   and Triangle.
	 *    Override the calculateArea() 
	 *    method in each subclass to calculate and 
	 *    return the shape's area.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape2 obj=new circle2();
		obj.calculateArea();
		System.out.println(obj.calculateArea());
		shape2 obj1=new Rectangle2();
		obj1.calculateArea();
		System.out.println(obj1.calculateArea());
		shape2 obj2=new Tringle2();
		obj2.calculateArea();
		System.out.println(obj2.calculateArea());
		

	}

}
