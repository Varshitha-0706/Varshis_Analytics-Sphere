package Abstract_classes;
abstract class Animal{
	abstract void makeSound();
	void sleep() {
		System.out.println("Sleeping!Don't disturb...");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("DOG:bow bow...");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("CAT:meow meow...");
	}
}
public class Wild {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.makeSound();
		Dog d=new Dog();
		d.makeSound();
		c.sleep();
		d.sleep();
		
	}
}
