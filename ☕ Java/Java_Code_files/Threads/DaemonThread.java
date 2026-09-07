package Threads;
class Hello extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Child Thread");
}
}
}
class Hi extends Thread{
	public void run(){
		System.out.println("main thread");
	}
}
class DaemonThread
{
public static void main(String args[ ]) throws Exception
{
System.out.println(Thread.currentThread().isDaemon());
Hello h=new Hello();
Hi h1=new Hi();
System.out.println(h.isDaemon());
//false
//h.start();
h.setDaemon(true);
System.out.println(h.isDaemon());
h.start();
h1.start();
	//true
}
}