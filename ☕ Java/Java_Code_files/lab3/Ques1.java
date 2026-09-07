package lab3;

public class Ques1{
private int idNo;
private String name;
private String studentClass;
private String branch;
public Ques1(int idNo, String name, String studentClass, String branch) {
this.idNo = idNo;
this.name = name;
this.studentClass = studentClass;
this.branch = branch;
}
public void printDetails() {
System.out.println("Student ID: " + idNo);
System.out.println("Name: " + name);
System.out.println("Class: " + studentClass);
System.out.println("Branch: " + branch);
}
public static void main(String[] args) {
Ques1 student1 = new Ques1(210701, "ketham", "Cse-04", "CSE");
student1.printDetails();
}
}
