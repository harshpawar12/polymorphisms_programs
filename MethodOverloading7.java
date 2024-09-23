package polymorphism;

class shapp
{
	void draw()
	{
		System.out.println("Draw shapes...");
	}
	double CalArea()
	{
		return 0;
	}
}
class circlee extends shapp
{
	void draw()
	{
		System.out.println("Draw shape circle..");
	}
	double CalArea()
	{
		int r=5;
		System.out.println("Area of circle");
		return (3.14)*r*r;
	}
}
class Sqre extends shapp
{
	void draw()
	{
		System.out.println("Draw shape Square...");
	}
	double CalArea()
	{
		int a=5;
		System.out.println("Area of Square..");
		return a*a;
	}
}
class trio extends shapp
{
	void draw()
	{
		System.out.println("Draw shape Tringle...");
	}
	double CalArea()
	{
		int h=5,b=8;
		System.out.println("Area of Tringle..");
		return (b*h)/2;
	}
}



public class MethodOverloading7 {
	/*
	 * 8. Write a Java program to create a base class 
	 * Shape with methods draw() and calculateArea().
	 *  Create three subclasses: Circle, Square,
	 *   and Triangle. Override the draw() method in
	 *    each subclass to draw the respective shape,
	 *     and override the calculateArea() method to
	 *      calculate and return the area of each shape.

	 */
	public static void main(String[] args) {
		shapp obj=new circlee();
		obj.draw();
		System.out.println(obj.CalArea());
		shapp obj1=new Sqre();
		obj1.draw();
		System.out.println(obj1.CalArea());
		shapp obj2=new trio();
		obj2.draw();
		System.out.println(obj2.CalArea());
	}

}
