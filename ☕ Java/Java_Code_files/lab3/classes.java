package lab3;
import java.util.*;
class Ssstudent{	
	String name;
	String id_no;
}
	public class classes{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int n;
			Ssstudent s=new Ssstudent();
			System.out.println("Enter no.of students:");
			n=sc.nextInt();
			for(int i=0;i<n;i++) {
			System.out.println("Enter Student name:");
			s.name=sc.next();
			System.out.println("Enter student id no:");
			s.id_no=sc.next();
			}
			System.out.println("STUDENT NAMES:");
			for(int i=0;i<n;i++)
			{
				System.out.println(s.name);
			}
			System.out.println("STUDENT ID NO.:");
			for(int i=0;i<n;i++)
			{
				System.out.println(s.id_no);
			}

		}
			
	}

