package lab5;

interface Drawable{
	int radius=10;
	int l=5,b=9;
	void draw();
}
class circle implements Drawable{
	public void draw()
	{
	System.out.println("Draw circle");
	}
}
class rectangle implements Drawable{
	 public void draw()
	{
		System.out.println("Draw Rectangle");
	}
}
public class Interface {
	public static void main(String args[])
	{
		circle c=new circle();
		rectangle r=new rectangle();
		c.draw();
		r.draw();
	}
}
/* In Java, methods in interfaces are implicitly public and abstract.
 *  When you implement an interface,
  you must provide a public implementation of all methods declared in the interface.
 
  So, in the Drawable interface, the draw() method is implicitly public.


If you omit the public modifier in the implementing class,
 it would result in a compilation error 
 because you're attempting to reduce the visibility of the method, which is not allowed. 

Therefore, you cannot declare the draw() method as void without an access modifier, as it wouldn't conform to the interface contract in Java.*/
