package Threads;
class x extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
		System.out.println("hello");
	}
}
}
class y extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
		System.out.println("amazing");
	}
}
}
public class joinmethod {
	public static void main(String args[]) throws Exception
	{
		x x1=new x();
		y y1=new y();
		x1.start();
		x1.join();
		y1.start();
		//y1.join();
		//check above line...difference makess..
		//***waits until ends the thread...
		for(int i=0;i<5;i++) {
			System.out.println("hi");
	}
	}
}
