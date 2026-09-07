package lab3;
class Triangle{
	int a=3;
	int b=4;
	int c=5;
	int s=(a+b+c)/2;
	void area()
	{
		System.out.println("Area of a Triangle:");
		System.out.println(Math.sqrt((s*(s-a)*(s-b)*(s-c))));
	}
	void perimeter()
	{
		System.out.println("Perimeter of a Triangle:");
		System.out.println(a+b+c);
	}
}
public class Funtion {
	public static void main(String[] args)
	{
		Triangle t=new Triangle();
		t.area();
		t.perimeter();
	}
}
