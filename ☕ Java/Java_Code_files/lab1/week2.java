package lab1;
import java.util.*;
import java.lang.Math;
public class week2 {
	public static void main(String args[])
	{
		int l=3,br=2;
		System.out.println("length=3,breadth=2");
		System.out.println("Area of a rectangle:"+l*br);
		char ch='h';
		int c=(char)ch;
		System.out.println(c);
		char chh='d';
		int d=(char)chh;
		System.out.println("ASCII value of d:"+d);
		System.out.print("Adding of 3:"+(d+3));
		double num=3.9;
		System.out.print("Number is:"+num);
		double numm=num*num;
		System.out.println("Square of the number is:"+numm);
		System.out.println("Traingle Measurements");
		System.out.println("Lengths:2,3,5units");
		System.out.println("Perimeter of the triangle is:"+(2+3+5));
		System.out.println("7^5="+Math.pow(7, 5));
		int a=6,b=8;
		System.out.println("Before Swapping:a="+a+",b="+b);
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After Swapping:a="+a+",b="+b);
//Another way of swapping
        a=a*b;
		b=a/b;
		a=a/b;
		System.out.print("After Swapping:a="+a+",b="+b);*/
		//Swapping(using third variable)
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping:a="+a+",b="+b);
		int Number=12345;
		int count=0;
		while(Number==0)
		{
			Number=Number/10;
			count++;
		}
			
		int firstdigit=Number/10000;
		System.out.println("firstdigit:"+firstdigit);
		int lastdigit=Number%10;
		System.out.println("lastdigit:"+lastdigit);
		System.out.println("Sum of first and last digit:"+(firstdigit+lastdigit));
		Scanner sc=new Scanner(System.in);
		int first,second,third,fourth;
		int no,Increased_no;
		System.out.println("Enter a number:");
		no=sc.nextInt();
		first=no/1000;
		no=no%1000;
		second=no/100;
		no=no%100;
		third=no/10;
		fourth=no%10;
		Increased_no=(first+2)*1000+(second+2)*100+(third+2)*10+(fourth+2);
		System.out.printf("Increased No.is %d",Increased_no);
		int n,rem;
		int reversed=0;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		while(n!=0) {
			rem=n%10;
			reversed=reversed*10+reversed;
			n=n/10;
		}
		System.out.println("Reversed number is:"+reversed);
		
	}

}
