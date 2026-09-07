package lab5;
import java.util.*;
abstract class Shape{
	abstract void area();
	abstract void perimeter();
	int length;
}
class Rectangle extends Shape{
	int breadth;
	int area;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		area();
	}
	void area()
	{
		area=length*breadth;
		System.out.println("Area of a Rectangle:"+area);
	}
	void perimeter()
	{
		System.out.println("Perimeter of the Rectangle:"+2*(length+breadth));
	}
	
}
class Circle extends Shape{
	int radius;
	int area;
	Circle(int radius)
	{
		this.radius=radius;
		
	}
	void area()
	{
//		area=Math.PI *;
		System.out.println("Area of Circle:"+Math.PI*radius*radius);
	}
	void perimeter()
	{
		System.out.println("Perimeter of the Circle:"+2*Math.PI*radius);
	}
}
public class Abstract {
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle(4,5);
		s.area();
		s.perimeter();
		s=new Circle(4);
		s.area();
		s.perimeter();
	}

}
