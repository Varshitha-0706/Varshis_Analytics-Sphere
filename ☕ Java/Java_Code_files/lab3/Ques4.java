package lab3;

public class Ques4 {
private int empId;
private String empName;
private double salary;
public void insert(int empId, String empName, double salary) {
this.empId = empId;
this.empName = empName;
this.salary = salary;
}
public void display() {
	System.out.println("Employee ID: " + empId);
	System.out.println("Employee Name: " + empName);
	System.out.println("Salary: $" + salary);
	}
	public static void main(String[] args) {
	Ques4 emp1 = new Ques4();
	emp1.insert(210709, "prameela", 50000.0);
	emp1.display();
	}
	}
