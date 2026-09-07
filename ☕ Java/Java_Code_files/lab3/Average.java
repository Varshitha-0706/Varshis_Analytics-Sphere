package lab3;

import java.util.Scanner;
class average{
	 static void calculate(double n1,double n2,double n3)
	{
		double num=(n1+n2+n3)/3;
		System.out.println("Average of the Numbers:"+num);
	}
}
public class Average {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		double first=sc.nextDouble();
		double second=sc.nextDouble();
		double third=sc.nextDouble();
		average.calculate(first,second,third);
		
	}

}
