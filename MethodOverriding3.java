package polymorphism;

class Employ
{
	double calculateSalary()
	{
		System.out.println("Salary of employee");
		return 0;
	}
}
class manager extends Employ
{
	double calculateSalary()
	{
		int sal=50000,b=5000;
		System.out.println("Salary of manager is:");
		
		return sal+b;
	}
}
class programmer1 extends Employ
{
	double calculateSalary()
	{
		int sal=30000,b=2500;
		System.out.println("Salary of programmer is:");
		return sal+b;
	}
}
public class MethodOverriding3 {
	/*
	 * 4. Write a Java program to create a
	 *  class Employee with a method called
	 *   calculateSalary(). Create two
	 *    subclasses Manager and Programmer.
	 *     In each subclass, override the
	 *      calculateSalary() method to
	 *       calculate and return the salary based
	 *        on their specific roles.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ obj=new manager();
		obj.calculateSalary();
		System.out.println(obj.calculateSalary());
		Employ obj1=new programmer1();
		obj1.calculateSalary();
		System.out.println(obj1.calculateSalary());
		

		

	}

}
