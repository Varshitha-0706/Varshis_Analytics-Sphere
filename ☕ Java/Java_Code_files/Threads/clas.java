package Threads;
import java.lang.*;
class A extends Thread{
	public void run() {
	for(int i=0;i<20;i++) {
		System.out.println("hi");
	}
	}
}
class B extends Thread{
	public void run()
	{
		for(int i=0;i<20;i++) {
		System.out.println("hello");
	}
	}
}
public class clas {
	public static void main(String args[]) {
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}

}
