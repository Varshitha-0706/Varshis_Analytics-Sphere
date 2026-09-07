//package lab1;
import java.util.*;
public class Calci {
	public static void main(String args[])
	{
		//ODD NUMBERS...
	System.out.println("Odd numbers:");
	for(int i=1;i<=50;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
	// EVEN NUMBERS..
	System.out.println("Even numbers:");
	for(int i=1;i<=50;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	//LARGEST OF 3 NUMBERS..
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers to check which is largest?");
	System.out.print("a=");
	a=sc.nextInt();
	System.out.print("b=");
	b=sc.nextInt();
	System.out.print("c=");
	c=sc.nextInt();
	if(a>b&&a>c)
	{
		System.out.println("a is the greatest number");
	}
	else if(b>a&&b>c)
	{
		System.out.println("b is the greatest number");
	}
	else
	{
		System.out.println("c is the greatest number");
	}
	// PRIME NUMBER OR NOT?
	int p,count=0;
	System.out.println("Enter a number to check prime or not?:");
	p=sc.nextInt();
	for(int i=2;i<p/2;i++)
	{
	if(p%i==0) {
		count++;
		break;
	}
	}
	if(count==0) {
	System.out.println("Yes it is a prime number");
	}
	else {
		System.out.println("It is not a prime number.");
	}
	// LEAP YEAR PROGRAM...
	int x;
	System.out.println("Enter a year:");
	x=sc.nextInt();
	if(x%400==0 && x%100==0){
		System.out.println(x+" is a leap year");
	}
	else if(x%4==0 && x%100!=0) {
		System.out.println(x+" is a leap year,");
	}
	else {
		System.out.println(x+" not a leap year.");
	}
	// LEAP YEAR(another method)
	int y;
	System.out.println("Enter a year:");
	y=sc.nextInt();
	if((y%400==0 && y%100==0)||(y%4==0 && y%100!=0)){
		System.out.println(y+" is a leap year");
	}
	else
	{
		System.out.println(y+" is not a leap year.");
	}
	// SUM OF NUMBERS...
	int i,sum=0;
	for(i=1;i<=100;i++) {
		sum=sum+i;
	}
	System.out.println("Sum of numbers from 1 to 100 is = "+sum);
	// PALINDROME NUMBER OR NOT?
	int numm;
	int rem,rev=0;
	System.out.println("Enter a number(to check palindrome or not?):");
	numm=sc.nextInt();
	int temp=numm;
	while(numm>0)
	{
		rem=numm%10;
		rev=(rev*10)+rem;
		numm=numm/10;
	}
	if(temp==numm) {
		System.out.println(temp+" is a palindrome number.");
	}
	else {
		System.out.println(temp+" is not a palindrome number.");
	}
	//SWAPPING OF TWO NUMBERS...
	System.out.println("For Swapping:");
	int r,s;
	System.out.print("r=");
	r=sc.nextInt();
	System.out.print("s=");
	s=sc.nextInt();
	System.out.println("Before swapping r=" +r+ " and s="+s);
	r=r+s;
	s=r-s;
	r=r-s;
	System.out.println("After swapping r=" +r+ " and s="+s);
	
	//TEMPERATURE..
	int t,T;
	System.out.println("Enter temperature in degree celsius:");
	t=sc.nextInt();
	System.out.println("Temperature in degree celsius:"+t+"°C");
	T=t;
	T=(t*(9/5)+32);
	System.out.println("Temperature in farenheit:"+T+"F");
	//SWITCH CASES(For Arthimetic Operations)
	int n;
	double k,l,m,m1;
	System.out.println("Arthimetic Operations:");
	System.out.print("k=");
	k=sc.nextDouble();
	System.out.print("l=");
	l=sc.nextDouble();
	System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
	System.out.print("Enter a choice:");
	n=sc.nextInt();
	switch(n)
	{
	case 1:
		m=k+l;
		System.out.print("Addition of numbers is:"+m);
		break;
	case 2:
		m=k-l;
		m1=l-k;
		System.out.println("Subtraction of l from k is:"+m);
		System.out.print("Subtraction of k from l is:"+m1);
		break;
	case 3:
		m=k*l;
		System.out.print("Multiplication of numbers is:"+m);
		break;
	case 4:
		m=k/l;
		m1=l/k;
		System.out.println("Division of numbers k/l is:"+m);
		System.out.print("Division of numbers l/k is:"+m1);
		break;
	case 5:
		m=k%l;
		m1=l%k;
		System.out.println("Remainder(k%l) is:"+m);
		System.out.println("Remainder(l%k) is:"+m1);
		break;
	default:
		System.out.println("NO case found..");
	}
	//SWITCH CASE(Grades)
	String w;
	int o,ss;
	System.out.println("Enter student name:");
	w=sc.nextLine();
	System.out.print("Enter marks:");
	o=sc.nextInt();
	ss=o/10;
	switch(ss)
	{	
	case 10:
	{
		System.out.println("Grade:EX");
		break;
	}
	case 9:
	{
		System.out.println("Grade:A");
		break;
	}
	case 8:
	{
		System.out.println("Grade:B");
		break;
	}
	case 7:
	{
		System.out.println("Grade:C");
		break;
	}
	case 6:
	{
		System.out.println("Grade:D");
		break;
	}
	case 5:{
		System.out.println("FAIL(rem)");
		break;
	}
	case 4:{
		System.out.println("re-rem");
		break;
	}
	
	default:
	{
		System.out.println("Re-re-rem");
		break;
	}
	
	}
	//FIBONACCI SERIES
	int v=0;
	int v1=1;
	int u;
	System.out.println("Fibonacci series:");
	for(int i1=0;i1<10;i1++)
	{
		if(i1==0||i1==1)
		{
		System.out.println(i1);
		}
		else {
		u=v+v1;
		System.out.println(u);
		v=v1;
		v1=u;
	}
	}
	//PATTERN
	        int rows = 5;
	        int num = 1;

	        for (int z= 1; z <= rows; z++) {
	            for (int j1 = 1; j1 <= rows - z; j1++) {
	                System.out.print("  ");
	            }

	            for (int z1= 1; z1 <= z; z1++) {
	                System.out.print(num + " ");
	                num++;
	            }

	            System.out.println();
	        }
	        //STAR PATTERN..
	        int rr = 5;
	        int nn = 1;

	        for (int i2 = 1; i2<= rr; i2++) {
	            for (int j = 1; j <= rr- i2; j++) {
	                System.out.print("  ");
	            }

	            for (int k2= 1; k2<= i2; k2++) {
	                System.out.print(" * ");
	                nn++;
	            }

	            System.out.println();
	        }
	    }
	}
