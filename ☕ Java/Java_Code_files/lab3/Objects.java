package lab3;
import java.util.*;
class Student1{
	int roll_no;
	long phone_no;
	String address;
	String name;
}
public class Objects {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student1 sam=new Student1();
		Student1 john=new Student1();
		System.out.println("Enter SAM's Details:");
		sam.name="SAM";
		System.out.println("Enter roll number:");
		sam.roll_no=sc.nextInt();
		System.out.println("Enter phone number:");
        sam.phone_no=sc.nextLong();
		System.out.println("Enter address:");
        sam.address=sc.next();
		System.out.println("Enter JOHN's Details:");
		john.name="John";
		System.out.println("Enter roll number:");
		john.roll_no=sc.nextInt();
		System.out.println("Enter phone number:");
        john.phone_no=sc.nextLong();
		System.out.println("Enter address:");
        john.address=sc.next();
		System.out.println("SAM's Information:");
		System.out.println("roll_no:"+sam.roll_no+"\t"+"phone_no:"+sam.phone_no+"\t"+"Address:"+sam.address);
		System.out.println("JOHN's Information:");
		System.out.println("Name:"+john.name+"\t"+"roll_no:"+john.roll_no+"\t"+"phone_no:"+john.phone_no+"\t"+"Address:"+john.address);
	}
}
