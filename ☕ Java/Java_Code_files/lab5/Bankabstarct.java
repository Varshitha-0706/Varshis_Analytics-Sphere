package lab5;
import java.util.*;
abstract class Bank{
	abstract void rateofInterest();
}
class SBI extends Bank{
	double rate=7.5;
	void rateofInterest(){
		System.out.println("Rate of Interest for SBI Bank:"+rate);
	}
}
class PNB extends Bank{
	double rate=8.0;
	void rateofInterest(){
	System.out.println("Rate of Interest for PNB Bank:"+rate);
}
}
public class Bankabstarct {
	public static void main(String args[]) {
		Bank b;
		b=new SBI();
		b.rateofInterest();
		b=new PNB();
		b.rateofInterest();
	}
}
