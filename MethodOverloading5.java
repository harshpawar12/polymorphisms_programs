package polymorphism;

class shape3
{
	double getArea()
	{
		
		return 0;
	}
	double getPerimenter()
	{
		
		return 0;
	}
}
class circle3 extends shape3
{
	double getArea()
	{
		int r=5;
		System.out.println("Area of circle");
		
		return  3.14*r*2;
	}
	double getPerimenter()
	{
		
		int r=5;
		System.out.println("perimeter of circle");
		
		return  2*(3.14)*r;
	}
}
class Recto extends shape3
{
	double getArea()
	{
		int l=5,b=6;
		System.out.println("area of Reactangle");
		
		return  l*b;
	}
	double getPerimenter()
	{
		int l=5,b=6;
		System.out.println("perimeter of Reactangle");
		
		return  2*(l*b);
	}
}
class Tri extends shape3
{
	double getArea()
	{
		int h=5,b=6;
	System.out.println("area of triangle");
	
	return  (h*b)/2;
	}
	double getPerimenter()
	{
		int a=5,b=6,c=9;
		System.out.println("perimeter of triangle");
		
		return  a+b+c;
	}
}
public class MethodOverloading5 {
	/*
	 * Write a Java program to create a
	 *  class Shape with methods getArea() 
	 *  and getPerimeter().
	 *   Create three subclasses: Circle,
	 *    Rectangle, and Triangle. Override the
	 *     getArea() and getPerimeter() methods
	 *      in each subclass to calculate and 
	 *      return the area and perimeter 
	 *      of the respective shapes.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape3 obj=new circle3();
		
		System.out.println(obj.getArea());
		System.out.println(obj.getPerimenter());
		shape3 obj1=new Recto();
	
		System.out.println(obj1.getArea());
		System.out.println(obj1.getPerimenter());
		shape3 obj2=new Tri();
		
		System.out.println(obj2.getArea());
		System.out.println(obj2.getPerimenter());
	}

}
