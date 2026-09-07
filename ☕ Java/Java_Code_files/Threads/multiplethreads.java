package Threads;

class C extends Thread{
	public void run() {
		System.out.println("THread:"+Thread.currentThread());
		System.out.println("THread name is:"+Thread.currentThread().getName());
	}
}
public class multiplethreads {
	public static void main(String args[])
	{
		C c1=new C();
		C c2=new C();
		C c3=new C();
		C c4=new C();
		C c5=new C();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();



	}

}
