package lab3;
public class Ques3{
	private int id;
	private String name;
	private String studentClass;
	private String branch;
	public void insert(int id, String name, String studentClass, String
	branch) {
	this.id = id;
	this.name = name;
	this.studentClass = studentClass;
	this.branch = branch;
	}
	public void display() {
	System.out.println("Student ID: " + id);
	System.out.println("Name: " + name);
	System.out.println("Class: " + studentClass);
	System.out.println("Branch: " + branch);
	}
	public static void main(String[] args) {
	Ques3 student1 = new Ques3();
	student1.insert(210701, "ketham", "Cse-04", "CSE");
	student1.display();
	}
	}