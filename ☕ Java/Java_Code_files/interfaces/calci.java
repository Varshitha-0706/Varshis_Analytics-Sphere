package interfaces;
interface MathOperation{
	void calculate(int a,int b);
}
class Addition implements MathOperation{
	public void calculate(int x,int y) {
		System.out.println(x+ y);
	}
}
class Subtraction implements MathOperation{
	public void calculate(int a,int b) {
	System.out.println(a-b);
	}
}
class Multiplication implements MathOperation{
	public void calculate(int a,int b) {
	System.out.println(a*b);
	}
}
class Division implements MathOperation{
	public void calculate(int a,int b) {
	System.out.println(a/b);
}
}
public class calci {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.calculate(3, 3);
		Subtraction s=new Subtraction();
		s.calculate(10, 5);
		Multiplication m=new Multiplication();
		m.calculate(5, 5);
		Division d=new Division();
		d.calculate(20, 2);
	}

}
