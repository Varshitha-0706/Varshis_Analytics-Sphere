package lab4;

class Grandparent{
	String grandmother="Ramadevi";
	String grandfather="suryanarayana";
	int childrens;
	Grandparent()
	{
		System.out.println("grandmother="+grandmother+"\nGrandfather="+grandfather+"\n");
	}
	Grandparent(int childrens)
	{
		this.childrens=childrens;
		System.out.println("No.of Childrens:"+childrens);
	}
}
class Parent extends Grandparent
{
	int childrens;
	String mother="Veera Kumari";
    String father="Srinivasa Rao";
	Parent(int childrens)
	{
//		super();
		super(3);
		this.childrens=childrens;
		//display();
		System.out.println("No.of Childrens:"+childrens);
	}
	void display()
	{
		System.out.println("Mothername="+mother+"\nFathername="+father+"\n");
	}
	
	
}
class Children extends Parent
{
	String daughter="Varshitha";
	String son="Harinadh";
	Children()
	{
		super(2);
	}
	void display()
	{
		super.display();
		System.out.println("Daughter="+daughter+"\nSon="+son+"\n");
	}
}
public class Child{
	public static void main(String[] args)
	{	
//	Parent p=new Parent(2);
	Children c=new Children();
	c.display();
}
}
