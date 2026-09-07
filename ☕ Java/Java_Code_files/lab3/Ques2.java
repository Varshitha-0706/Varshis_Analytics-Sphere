package lab3;
public class Ques2 {
private int empId;
private String empName;
private double salary;
public Ques2(int empId, String empName, double salary) {
this.empId = empId;
this.empName = empName;
this.salary = salary;
}
public void displayDetails() {
System.out.println("Employee ID: " + empId);
System.out.println("Employee Name: " + empName);
System.out.println("Salary: $" + salary);
}
public static void main(String[] args) {
Ques2 emp1 = new Ques2(1001, "Abhisri", 50000.0);
emp1.displayDetails();
}
}
