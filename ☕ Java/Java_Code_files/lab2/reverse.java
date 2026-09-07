package lab2;
import java.util.*;
public class reverse {
	    public static void main(String[] args) {
	        Scanner s= new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = s.nextLine();

	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseString(String input) {
	        StringBuilder r = new StringBuilder();
	        for (int i = input.length() - 1; i >= 0; i--) {
	            r.append(input.charAt(i));
	        }
	        return r.toString();
	    }
}
