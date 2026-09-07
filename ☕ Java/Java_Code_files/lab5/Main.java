package lab5;

import java.util.Scanner;
interface Bankk{
	void fullform();
	void deposit(double cash);
	//void withdraw(double cash);
}
class Sbi implements Bankk{
	Scanner s=new Scanner(System.in);
public void fullform()
	{
		System.out.println("State Bank Of India");
	}
	public void deposit(double cash)
	{
		Scanner s=new Scanner(System.in);
	System.out.println(cash+" deposited successfully");
	}
}
class Pnb implements Bankk{
	public void fullform()
	{
		System.out.println("Punjaab National Bank");
	}

	public void deposit(double cash)
	{
		System.out.println(cash+" Deposited successfully");
	}
}
class ICIC implements Bankk{
	public void fullform()
	{
		System.out.println("Idustrial Credit and Investment Corporation of India");
	}
	public void deposit(double cash)
	{
		System.out.println(cash+" Deposited successfly");
	}
}
public class Main {
public static void main(String args[])
{
	Bankk b;
	b=new Sbi();
	b.fullform();
	b.deposit(100);
	b=new Pnb();
	b.fullform();
	b.deposit(10);
	b=new ICIC();
	b.fullform();
	b.deposit(500);
}
}
