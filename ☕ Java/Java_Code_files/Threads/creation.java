package Threads;
public class creation {
	public static void main(String[] args) {
//main method itself is a thread by default...
          ew e=new ew();
          System.out.println("BEFORE CALLING START\nthread name:"+Thread.currentThread().getName()+"->"+Thread.currentThread().getId());
          System.out.println(Thread.currentThread().getState());
          System.out.println("PRIORITY: "+Thread.currentThread().getPriority());
          Thread.currentThread().setPriority(9);
          System.out.println("setted priority: "+Thread.currentThread().getPriority());
          e.start();
          System.out.println("AFTER CALLING START\nthread name:"+Thread.currentThread().getName());
          System.out.println(Thread.currentThread().getState());
          System.out.println("priority"+Thread.currentThread().getPriority());
          ew1 e1=new ew1();
          e1.start();
          System.out.println("AFTER CALLING START\nthread name:"+Thread.currentThread().getName());
          System.out.println(Thread.currentThread().getState());
	}
}
class ew extends Thread{
	int i=0;
	public void run() {
	for(i=1;i<3;i++) {
		System.out.println(i);
	}
}
}
class ew1 extends Thread{
	int i=0;
	public void run() {
	for(i=1;i<3;i++) {
		System.out.println(i);
	}
}
}