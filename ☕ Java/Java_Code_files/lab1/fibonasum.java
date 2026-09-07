package lab1;

public class fibonasum {
	public static void main(String args[])
	{
		int v=0;
		int k1=1;
		int u;
		System.out.println("Fibonacci series:");
		for(int i1=0;i1<40;i1++)
		{
			if(i1==0||i1==1)
			{
			System.out.println(i1);
			}
			else {
			u=v+k1;
			System.out.println(u);
			v=k1;
			k1=u;
		//System.out.println(u=u+k1);
		}
		}
	}

}
