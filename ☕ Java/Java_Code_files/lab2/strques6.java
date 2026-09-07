package lab2;
import java.util.Scanner;

public class strques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email ID: ");
        String email = scanner.nextLine();

        String alphabetsOnly = getAlphabetsOnly(email);
        int totalCharacters = email.length();

        System.out.println("Alphabets only: " + alphabetsOnly);
        System.out.println("Total characters: " + totalCharacters);
    }

    public static String getAlphabetsOnly(String email) {
        // Using regular expression to extract alphabetic characters
        return email.replaceAll("[^a-zA-Z]", "");
    }
}
