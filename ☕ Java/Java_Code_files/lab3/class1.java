package lab3;
class animal{
	int legs;
	int tails;
	void bark() {
		System.out.println("Dog is barking");
	}
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends animal{
	Dog(int legs,int tails){
		System.out.println("No.of legs:"+legs);
		System.out.println("No.of Tails:"+tails);
	}
	void eat()
	{
		super.eat();
		System.out.println("Dog is eating");
	}
}
public class class1 {
	public static void main(String[] args)
	{
		Dog d=new Dog(2,1);
		d.bark();
		d.eat();
	}
	

}