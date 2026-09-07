package lab3;

class Rectangle
{
	int l;
	int b;
	int c;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void area()
	{
		c=l*b;
		System.out.println(c);
	}
}
public class Rect {
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(4,5);
		System.out.println("Area of a Rectangle1:");
		r.area();
		Rectangle r1=new Rectangle(5,8);
		System.out.println("Area of a Rectangle2:");
		r1.area();

	}

}
