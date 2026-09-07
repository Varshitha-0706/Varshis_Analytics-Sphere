package lab3;
public class class5{
		public void display(String id, String name) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		}
		public void display(String id, String name, String branch) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Branch: " + branch);
		}
		public static void main(String[] args) {
		class5 student = new class5();
		student.display("N210701", "ketham");
		student.display("N210764", "varshi", "CSE");
		}
}

