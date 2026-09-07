package lab5;
class varshi{
	int date;
	int month;
	int year;
	void varsham(int date,int month,int year)
	{
		System.out.println("Date of Birth:"+date+"/"+month+"/"+year+"\n");
	}
	void varsham(int year)
	{
		System.out.println("Year of Birth:"+year);
	}
}
public class Metoverloading {
	public static void main(String args[])
	{
		varshi v=new varshi();
		v.varsham(7,11,2006);
		v.varsham(2006);
	}
}
