package lab3;
class Employee{
	String Name;
	int Year_of_Joining;
	String salary;
	String address;
	int i,n;
	public Employee(String Name,int Year_of_Joining,String salary,String address) {
		this.Name=Name;
		this.Year_of_Joining=Year_of_Joining;
		this.salary=salary;
		this.address=address;
	}
public void display() {
	System.out.println(Name + "\t" + Year_of_Joining + "\t\t" + salary + "\t" +
				address);
			}
}
public class Emp {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Robert", 1994,"64C", "-WallsStreat");
		Employee employee2 = new Employee("Sam", 2000, "68D", "- WallsStreat");
		Employee employee3 = new Employee("John", 1999, "26B", "- WallsStreat");
		System.out.println("Name\tYear of Joining\tsalary\tAddress");
		employee1.display();
		employee2.display();
		employee3.display();
	}
}