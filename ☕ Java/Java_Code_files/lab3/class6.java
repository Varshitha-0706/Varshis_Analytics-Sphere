package lab3;

class Aanimal{
int legs=2;
void eat() {
	System.out.println("Animals are eating");
	}
}
class Ddog extends Aanimal{
	int legs=4;
	void eat() {
	System.out.println("Dogs have "+legs+" legs ");
	System.out.println("Dogs are eating");
	}
	}
	public class class6{
	public static void main(String[] args) {
	Ddog a=new Ddog();
	a.eat();
	}
	}
