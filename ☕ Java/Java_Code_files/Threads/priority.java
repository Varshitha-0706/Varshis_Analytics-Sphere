//package Threads;

class X extends Thread{
	public void run() {
	for(int i=0;i<3;i++){
		System.out.println("X:child thread");
		}
	}
}
class Y extends Thread{
	public void run() {
	for(int i=0;i<3;i++){
		System.out.println("Y:main child");
		}
	}
}
public class priority extends Thread{
	public static void main(String args[]){
		System.out.println("priority is "+Thread.currentThread().getPriority());
		X x=new X();
		x.setPriority(8);
		System.out.println("priority of X "+x.getPriority());
		Y y=new Y();
		y.setPriority(1);
		System.out.println("priority of Y "+y.getPriority());
		y.start();
		x.start();
		
		
	}

}
