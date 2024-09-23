package polymorphism;



public class MethodOverloading {
	
public void Add()
{
	System.out.println("No argument overloading..");
}
public void Add(int a)
{
	System.out.println("one  argument overloading..");
}
public void Add(float a,int b)
{
	System.out.println("one float & second int argument  overloading..");
}
public void Add(int a,float b)
{
	System.out.println("one int & second float argument overloading..");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.Add();
		m.Add(12);
		m.Add(23.45f,7);
		m.Add(56,45.8f);

	}

}
