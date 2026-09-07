package Threads;
//Class to implement multithreading by implementing Runnable interface
class MultithreadingTest implements Runnable {
public void run()
{
 try {
   // Displaying the running Thread
   System.out.println(
     "Thread " + Thread.currentThread().getId()
     + " is running");
   //***getting ID of thread...
 }
 catch (Exception e) {
   // exception is caught if occurred 
   System.out.println("Exception has occurred and is caught");
 }
}
}


class MultithreadMain {
public static void main(String[] args)
{
 int n = 6; 	// Number of threads
 // Creating and starting n number of threads
 for (int i = 0; i < n; i++) {
   Thread obj
     = new Thread(new MultithreadingTest());
   obj.start();
 }
}
}


