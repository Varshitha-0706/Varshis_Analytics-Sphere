package Abstract_classes;
import java.util.*;
abstract class Shape{
	abstract void calculateArea(double r);
	abstract double calculatePerimeter();
}
class Circle extends Shape{
	int rr=6;
	double radius;
	void calculateArea(double r) {
		radius=r;
		System.out.println("Area of smaller circle:"+(3.14f*rr*rr));
		System.out.println("Area of larger circle:"+((3.14f)*r*r));
	}
	double calculatePerimeter() {
		Scanner sc=new Scanner(System.in);
		double t;
		System.out.print("Enter radius:");
		t=sc.nextDouble();
		System.out.println("perimter of circle:");
		     return 2*3.14f*t;	}
}
class Rectangle extends Shape{
	double l,b;
	Rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	void calculateArea(double l) {
		System.out.println("Area of Rectangle is:"+(l*b));
	}
	double calculatePerimeter() {
		return (2*(l+b));
	}
}
public class Symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.calculateArea(3.6);
		c.calculatePerimeter();
		Rectangle r=new Rectangle(3,7.6);
		r.calculateArea(3);
		r.calculatePerimeter();
	}

}
