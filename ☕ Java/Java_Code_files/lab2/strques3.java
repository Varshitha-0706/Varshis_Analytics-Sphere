package lab2;
import java.util.Scanner;

public class strques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = removeNonAlphabets(sentence);
        System.out.println("Result: " + result);
    }

    public static String removeNonAlphabets(String sentence) {
        // Using regular expression to remove non-alphabetic characters
        return sentence.replaceAll("[^a-zA-Z]", "");
    }
}
