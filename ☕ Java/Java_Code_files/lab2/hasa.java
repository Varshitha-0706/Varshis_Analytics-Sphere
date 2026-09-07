package lab2;

class BC{
	 BC()
	 {
		 System.out.println("VARSHITHA");
	 }

}
class DC{
	BC b1=new BC();//has-a relation
	DC()
	{
		BC b=new BC();//has-a relation
	}
	void display()
	{
		BC b=new BC();
	}
}
public class hasa {
	public static void main(String args[])
	{
		DC d=new DC();
		d.display();
	}

}
