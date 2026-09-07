package lab4;

class Student{
	int id;
	String name;
}
class Student1 extends Student{
	String batch;
	String branch;
	String collegename;
	Student1(int id,String name,String batch,String branch,String collegename)
	{
		this.id=id;
		this.name=name;
		this.batch=batch;
		this.branch=branch;
		this.collegename=collegename;
	}
	void display()
	{
		System.out.println("Student1 Details:");
		System.out.println("Id="+id+"\nName="+name+"\nBatch="+batch+"\nBranch="+branch+"\nCollegename="+collegename);
		System.out.println("\n");
	}
}
class Student2 extends Student{
	String batch;
	String branch;
	String collegename;
	Student2(int id,String name,String batch,String branch,String collegename)
	{
		this.id=id;
		this.name=name;
		this.batch=batch;
		this.branch=branch;
		this.collegename=collegename;
		display();
	}
	void display()
	{
		System.out.println("Student2 Details:");
		System.out.println("Id="+id+"\nName="+name+"\nBatch="+batch+"\nBranch="+branch+"\nCollegename="+collegename);
	}
}
public class Hierarchial {
	public static void main(String[] args)
	{
		Student1 s1=new Student1(701,"Baalu","2023","CSE","rgukt");
		Student2 s2=new Student2(764,"Varshi","2023","CSE","rgukt");
		s1.display();
//		s2.display();
		
	}

}
