package lab4;
class student{
	int id;
	String name;
	String batch;
	String branch;
	String collegename;
	student(int id,String name,String batch,String branch,String collegename)
	{
		this.id=id;
		this.name=name;
		this.batch=batch;
		this.branch=branch;
		this.collegename=collegename;
	}
	void display()
	{
		System.out.println("Details:");
		System.out.println("ID="+id+"\nName="+name+"\nBatch="+batch+"\nBranch="+branch+"\nCollegename="+collegename+"\n");
	}
}
class mystudent extends student{
	String batch;
	String branch;
	String collegename;
	int marks;
	mystudent(int id,String name,String batch,String branch,String collegename,int marks)
	{
		super(676,"Kavya🥰️","1990","ECE","rgukt");
		this.id=id;
		this.name=name;
		this.batch=batch;
		this.branch=branch;
		this.collegename=collegename;
		this.marks=marks;
}
	void display()
	{
		System.out.println("Details:");
		System.out.println("ID="+id+"\nName="+name+"\nBatch="+batch+"\nBranch="+branch+"\nCollegename="+collegename+"\nMarks="+marks);
	}
}
public class SingleInheritance {
	public static void main(String args[])
	{
		mystudent m=new mystudent(764,"varsha","2001","CSE","rgukt",10);
		m.display();
	}
}
