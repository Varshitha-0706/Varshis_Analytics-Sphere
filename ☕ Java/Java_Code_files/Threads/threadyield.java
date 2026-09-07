package Threads;
class dd extends Thread{
	public void run()
	{
		for(int i=0;i<100;i++) {
		System.out.println("hello");
		Thread.yield();
		//must end with this...
	}
}
}
class d extends Thread{
	public void run()
	{
		for(int i=0;i<100;i++) {
		System.out.println("hi");
		//Thread.yield();
	}
}
}
public class threadyield {
	public static void main(String args[]) {
		dd d=new dd();
		d d1=new d();
		d.start();
		d1.start();
	}

}
