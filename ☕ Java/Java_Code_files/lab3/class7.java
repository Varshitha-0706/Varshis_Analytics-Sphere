package lab3;

class Aanimall{
	int legs=2;
	void eat() {
		System.out.println("Animals are eating.");
	}
}
class dogg extends Aanimall{
	int legs=4;
	void eat()
	{
		System.out.println("No.of legs:"+legs);
		System.out.println("Dogs are Eating.");
	}
}
public class class7 {
	public static void main(String args[])
	{
		dogg d=new dogg();
		d.eat();
		System.out.println(d.legs);
	}

}
