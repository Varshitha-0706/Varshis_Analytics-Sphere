package Threads;
public class Testt implements Runnable {
    public void run() {
        System.out.println("The thread is running!");
    }

    public static void main(String args[]) {
        // creating an object of the Test class
        Runnable r1 = new Testt();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread t1 = new Thread(r1, "Thread number 1");

        /*
         * // We can also specify the constructor as:
         * 
         * Thread t1 = new Thread(new Test(), "My new thread");
         */

        // executing the threads using start method.
        t1.start();

        // getting the name of the threads.
        String name = t1.getName();
        System.out.println(name);
    }
}

