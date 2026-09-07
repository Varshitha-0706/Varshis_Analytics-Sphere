package lab3;

class Demo{
public int x=0,y=1;
public int a=3,b=4;
{
System.out.println(x+" "+y);
}
}
public class Ques7{
public static void main(String[] args) {
Demo d=new Demo();
System.out.println(d.a+" "+d.b);
//here we get error private variacles have scope with in the class
System.out.println(d.x+" "+d.y);
}
}
