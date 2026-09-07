package lab5;
//Dynamic method Dispatch //Run-time Polymorphism..
class Mom{
	int x=5;
	void show()
	{
		System.out.println("Hai Mummy");
	}
}
class Son extends Mom{
	int x=10;
	void show()
	{
	System.out.println("x="+x);
	System.out.println("this.x="+this.x);
	System.out.println("super.x="+super.x);
	System.out.println("Hai Bro");
    }
}
class Daughter extends Mom{
	void show()
	{
		System.out.println("Hai Sis");
	}
}
public class Metoverriding {
public static void main(String args[])
{
	int i;
//	Mom m;
////	m.show();
//	m=new Son();
//	m.show();
//	m=new Daughter();
//	m.show();
	Mom m=new Mom();
	m.show();
	m=new Son();
	m.show();
	m=new Daughter();
	m.show();
	System.out.print("\n");
	for(i=0;i<args.length;i++)
	{
		System.out.println("args["+i+"]="+args[i]);
	}
}
}
