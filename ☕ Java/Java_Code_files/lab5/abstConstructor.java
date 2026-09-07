package lab5;

abstract class Vehicle{
	String type;
	Vehicle(String type)
	{
		this.type=type;
	}
	abstract void display();
}
class Bike extends Vehicle{
	Bike(String type)
	{
		super(type);
	}
	void display()
	{
		System.out.println("A bike of type :"+type);
	}
}
public class abstConstructor {
	public static void main(String args[])
	{
		 Vehicle v;
		 v=new Bike("sport");
		 v.display();
	}
}
