package lab3;

class Animal{
	int legs=4;
	int tails;
	void bark()
	{
		System.out.println("Animal is barking.");
	}
	void eat()
	{
		System.out.println("Animal is eating.");
	}
}
class dog extends Animal{
	dog(int legs,int tails){
		System.out.println("No.of legs for animal:"+super.legs);
		System.out.println("No.of legs for dog:"+legs);
		System.out.println("No.of Tails for dog:"+tails);
	}
	void eat()
	{
		super.eat();
		System.out.println("Dog is eating.");
	}
}
class BabyDog extends Animal{
	BabyDog(int legs,int tails)
	{
		System.out.println("No.of legs for babydog:"+legs);
		System.out.println("No.of tails:"+tails);
	}
	void bark()
	{
		System.out.println("BabyDog is slowly barking.");
	}
	
}
public class class3 {
	public static void main(String args[])
	{
		
		dog d=new dog(4,1);
		d.bark();
		d.eat();
		BabyDog b=new BabyDog(4,1);
		b.bark();
		b.eat();
		
	}

}
