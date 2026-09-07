package arthimetic;
import arthimetic1.Addition;
public class C extends Addition{
       public static void main(String args[ ])
       {
              C obj=new C();
              //System.out.println(obj.a);
//a has private access in C1
             // System.out.println(obj.b);

              System.out.println(obj.c);
              //SINCE PROTECTED
              System.out.println(obj.d);
              //since has PUBLIC
              //obj.add();
         }
}
