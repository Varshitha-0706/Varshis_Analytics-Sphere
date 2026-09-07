package Threads;
//Example to Create Java Thread Using the Thread Class: Thread(String Name)
public class Test {
    public static void main(String args[]) {
        // creating an object of the Thread class.
        Thread t1 = new Thread("Thread number 1");
        Thread t2 = new Thread("Thread number 2");

        // executing the threads using start method.
        t1.start();
        t2.start();

        // getting the name of the threads.
        String name1 = t1.getName();
        String name2 = t2.getName();

        System.out.println(name1);
        System.out.println(name2);
    }
}
