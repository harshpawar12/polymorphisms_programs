package polymorphism;

class A
{
	void disp()
	{
		System.out.println("Its Base class method...");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("Its Child class method...");
	}
	
}

public class MothodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A k=new B(); // its the UpCast base class to Child.
	
		k.disp();
		
	}

}

// if sub class has same method,name as a  super class.
