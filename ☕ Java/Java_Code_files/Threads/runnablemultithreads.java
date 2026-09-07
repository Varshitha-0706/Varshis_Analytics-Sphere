package Threads;
class Cc implements Runnable{
	public void run() {
		//System.out.println("THread:"+Thread.currentThread());
		System.out.println("THread name is:"+Thread.currentThread().getName());
	}
}
public class runnablemultithreads {
	public static void main(String args[])
	{
		Cc c1=new Cc();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c1);
		Thread t3=new Thread(c1);
		Thread t4=new Thread(c1);
		Thread t5=new Thread(c1);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();



	}

}

