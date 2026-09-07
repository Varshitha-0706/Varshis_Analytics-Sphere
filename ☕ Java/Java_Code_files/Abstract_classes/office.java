package Abstract_classes;
import java.util.*;
abstract class Employee{
	protected String name;
	protected String  gender;
	public Employee(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
	abstract double calculateSalary();
	abstract void displayEmployeeDetails(int age);
}
class Manager extends Employee{
	int r=1000;
	protected int bonus;
	public Manager(String n,String g,int bonus) {
		super(n,g);
		this.bonus=bonus;
	}
	double calculateSalary() {
		return bonus+r;
	}
	void displayEmployeeDetails(int a) {
		System.out.println("Manager details:\nName="+name+"\nAge="+a+"\nsalary="+calculateSalary());
	}
}
class Worker extends Employee{
	Scanner sc=new Scanner(System.in);
	protected double bonus;
	public Worker(String name,String gender,double bonus) {
		super(name,gender);
		this.bonus=bonus;
	}
	double calculateSalary() {
		System.out.println("enter salary:");
		int s=sc.nextInt();
		return bonus+s;
	}
	void displayEmployeeDetails(int a)
{
		System.out.println("Worker details:\nName="+name+"\nAge="+a+"\nsalary="+calculateSalary());
}
}
class SalesPerson extends Manager{
	protected int comission;
	public SalesPerson(String name,String gender,int bonus,int comission) {
		super(name,gender,bonus);
		this.comission=comission;
	}
	double calculateSalary() {
		return 34;
	}
}
public class office {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager("Srinivasrao", "M",43);
		Worker w=new Worker("Kumari","F",90);
		m.displayEmployeeDetails(30);
		w.displayEmployeeDetails(25);
		SalesPerson s=new SalesPerson("venky","M",23,90);
		s.calculateSalary();
	}
}

