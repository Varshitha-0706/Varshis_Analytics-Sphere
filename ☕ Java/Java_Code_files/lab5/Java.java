package lab5;
import java.util.*;
import java.lang.Math.*;
interface Shapee{
	void getArea();
	//int l,b,area;
	//int r,h;
	//int area;
}
class Rectanglle implements Shapee{
	public void getArea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth for rectangle:");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double area=l*b;
		System.out.println("Area of rectangle:"+area);
		
	}
}
class Circlle implements Shapee{
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius for circle:");
		double r=sc.nextDouble();
		double area=r*r*Math.PI;
		System.out.println("Area of Circle:"+area);
		
	}
}

class Triangle implements Shapee{
	public void getArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height of the triangle:");
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		double area=0.5*b*h;
		System.out.println("Area of Triangle:"+area);
		
	}
}

public class Java{

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Shapee s;
		s=new Rectanglle();
		s.getArea();
		s=new Circlle();
		s.getArea();
		s=new Triangle();
		s.getArea();


		
	}

}
