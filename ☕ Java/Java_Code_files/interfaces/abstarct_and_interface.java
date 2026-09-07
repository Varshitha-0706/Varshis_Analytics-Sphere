package interfaces;
interface Electric{
	void charge();
}
abstract class Vehicle{
	abstract void start();
	abstract void stop();
	void fuelUp() {
		System.out.println("Fuel filling...🤩");
	}
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car started!come fast..");
	}
	void stop() {
		System.out.println("Car stopped!😂");
	}
}
class Motorcycle extends Vehicle{
	void start() {
		System.out.println("Cycle starting..");
	}
	void stop() {
		System.out.println("cycle stops..");
	}
}
class Electriccar extends Vehicle implements Electric{
	public void charge() {
		System.out.println("charging!please wait..no hadavidi😂");
	}
	void start() {
		System.out.println("starting..");
	}
	void stop() {
		System.out.println("stopping..");
	}
}
public class abstarct_and_interface {
	public static void main(String[] args) {
		Car c=new Car();
		Motorcycle m=new Motorcycle();
		Electriccar e=new Electriccar();
		System.out.println("Car");
		c.start();
		c.stop();
		c.fuelUp();
		System.out.println("Motorcycle");
		m.start();
		m.stop();
		m.fuelUp();
		System.out.println("ElectricCar");
		e.start();
		e.stop();
		e.fuelUp();
		e.charge();
	}

}
