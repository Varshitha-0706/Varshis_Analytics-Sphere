package lab3;

class Trianglee{
	int a,b,c;
	Trianglee(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show()
	{
		System.out.println(a+" "+b+" "+c);
	}
	void area()
	{
		int s=(a+b+c)/2;
		System.out.println("Area of a Triangle:");
		System.out.println(Math.sqrt((s*(s-a)*(s-b)*(s-c))));
		
	}
	void perimeter()
	{
		System.out.println("Perimeter of a Triangle:");
		System.out.println(a+b+c);
	}
}
public class angle {
	public static void main(String[] args)
	{
		Trianglee tt=new Trianglee(3,4,5);
		tt.show();
		tt.area();
		tt.perimeter();
	}

}
    