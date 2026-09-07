package multiplepackage;
import arthimetic1.Addition;
import arthimetic2.Subtraction;
class MultiplePackage
{
   void show(){
       System.out.println("Multiplepackages");
   }
      public static void main(String args[])
      {
             //System.out.println("First packAGE IMPORTED SUCESSFULLY");
             MultiplePackage m=new MultiplePackage();
             m.show();	
             Addition a=new Addition();
             a.add();
             Subtraction s=new Subtraction();
             s.sub();
}
