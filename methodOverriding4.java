package polymorphism;

class sport
{
	void play()
	{
		System.out.println("Sports Internatonal levels...");
	}
}
class Football extends sport
{
	void play()
	{
		System.out.println("boys plays football..");
	}
}

class BasketBall extends Football
{
	void play()
	{
		System.out.println("boys play BasketBall..");
	}
}
class Rugby extends Football
{
	void play()
	{
		System.out.println("person plays Rugby..");
	}
}
public class methodOverriding4 {

		/*
		 * Write a Java program to create a
		 *  base class Sports with a method
		 *   called play(). Create three 
		 *   subclasses: Football, Basketball, 
		 *   and Rugby. Override the play() method
		 *    in each subclass to play a 
		 *    specific statement for each sport.
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sport obj=new Football(); //upcast
		obj.play();
		sport obj1=new BasketBall();
		obj1.play();
		sport obj2=new Rugby();
		obj2.play();

	}

}
