package arthimetic1;
public class Addition 
{
       int x=5;
       private int a=1;
       int b=2;
       protected int c=3;
       public int d=4;
       public void add()
       {
              System.out.println(x+10);
       }
       public static void main(String args[ ])
       {
              Addition ob=new Addition();
              System.out.println(ob.a);
//1
              System.out.println(ob.b);
// 2
              System.out.println(ob.c);
// 3
              System.out.println(ob.d);
              ob.add();
        }
}
