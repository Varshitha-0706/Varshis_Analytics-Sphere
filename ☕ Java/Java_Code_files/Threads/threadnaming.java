package Threads;

class D extends Thread{
	public void run()
	{
		System.out.println("hello");
	}
}
public class threadnaming {
	public static void main(String args[]) {
		System.out.println("Thread name is:"+Thread.currentThread().getName());
		System.out.println("Thread is:"+Thread.currentThread());
		D d=new D();
		d.start();
		System.out.println("Thread state:"+d.getState());

		System.out.println("Thread name is:"+d.getName());
		d.setName("VARSHI");
		//System.out.println("Thread name is:"+Thread.currentThread().getName());
		System.out.println("Thread name is:"+d.getName());
		System.out.println("Thread state:"+d.getState());
		System.out.println("Thread alive:"+d.isAlive());

		


	}

}
