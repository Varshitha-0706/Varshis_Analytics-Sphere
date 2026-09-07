package Threads;
class z extends Thread{
	public void run()
	{ 
		for(int i=0;i<3;i++) {
		System.out.println("varshitha");
	}
		 try {
		Thread.sleep(3000000);
	}
	catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Z extends Thread{
	public void run()
	{
		System.out.println("harinadh");
//		 try {
//		Thread.sleep(3000000);
//	}
//	catch(Exception e) {
//			System.out.println(e);
//		}
		}
}
public class sleep{
public static void main(String args[]) {
	z z1=new z();
	Z z2=new Z();
	z1.start();
	z2.start();
	//z1.start();
	System.out.println(z1.isAlive());
	System.out.println("state "+z2.getState());
	}
}
