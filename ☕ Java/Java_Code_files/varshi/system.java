package varshi;

import java.util.StringTokenizer;
import java.util.Date;

public class system {
	public static void main(String[] args) {
		String s = "hello %s!I am %d years old";
		String s0 = String.format("%d", 100);// integer
		System.out.println(s0);
		String s6 = String.format("%x", 101);// hexadecimal
		// f:float
		// %c:char
		// %o:octal
		String s7 = String.format("%b", true);
		System.out.println(s7);
		String s1 = String.format(s, "world", 18);
		System.out.println(s1);
		String s2 = String.format("welocome to %s", s);
		System.out.println(s2);
		// powerful for formatting data dynamicalling within strings.
		// throws illegalformatException:if format specifier is illegal or there are
		// insufficient arguments..
		double d = 23435.5676567;
		String s3 = String.format("this is double value %.6f,%.2f", d, d);
		System.out.println(s3);
		String s4 = String.format("price:%1$,10.3f", d);
		System.out.println(s4);
		double d1 = 1500.542;
		String ss = "kilometers";
		String s5 = String.format("This is %1$,7.1f %2$ss", d1, ss);
		// 1$:1st arguemnt
		// %2$:2nd argument
		System.out.println(s5);
		// %1$:Value OF d
		// ,:group digits with camma as a thousands operator
		// 10.2f:atleast 10 chars with 2 decimal places only
		System.out.println("varshitha");
		System.err.println("danger");
		StringTokenizer t = new StringTokenizer("I:am :v arshi", ":", true);
		while (t.hasMoreTokens()) {
			System.out.println(t.nextToken());
		}
		String[] res = "this is a test".split("\\s");
		for (String r : res)
			System.out.println(r);

		String[] result = "th:is :is :a :te:st".split("\\:");
		for (String r : result)
			System.out.println(r);

		Date cd = new Date();
		// %tA=day
		// %tB=month
		// %td=date(07)
		// %tm=month(1...12)
		// %tH=hours
		// %tM=MINUTES
		// %tS=seconds
		String s8 = String.format("Todays Date:%tA,%tB%td %tY\n Time:%tH:%tM:%tS", cd, cd, cd, cd, cd, cd, cd);
		System.out.println(s8);

	}
}
