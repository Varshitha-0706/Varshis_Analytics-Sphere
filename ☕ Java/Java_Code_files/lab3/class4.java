package lab3;
class Sstudent{
	String ID;
	String Name,Class,Branch,College;
}
class student1 extends Sstudent{
	student1(String ID,String Name,String Class,String Branch,String
	College){
		System.out.println("*Student 1 details*");
		System.out.println("-----------------");
		System.out.println("ID: " + ID);
		System.out.println("Name: " + Name);
		System.out.println("Class: " + Class);
		System.out.println("Branch: " + Branch);
		System.out.println("College: " + College);
}
}
class student2 extends Sstudent{
	student2(String ID,String Name,String Class,String Branch,String
	College){
		System.out.println("*Student 2 details*");
		System.out.println("-----------------");
		System.out.println("ID: " + ID);
		System.out.println("Name: " + Name);
		System.out.println("Class: " + Class);
		System.out.println("Branch: " + Branch);
		System.out.println("College: " + College);
}
}
public class class4 {
	public static void main(String args[])
	{
		Sstudent s;
		s=new student1("N210764","Varshitha","CSE-04","CSE","RGUKT");
		s=new student2("N210701","Sneha","CSE-05","ECE","RGUKT");
	}

}
