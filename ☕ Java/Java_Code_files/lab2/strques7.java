package lab2;

import java.util.Scanner;

public class strques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email ID: ");
        String email = scanner.nextLine();

        String specialCharacters = getSpecialCharacters(email);
        System.out.println("Special characters in email ID: " + specialCharacters);
    }

    public static String getSpecialCharacters(String email) {
        // Using regular expression to extract special characters
        return email.replaceAll("[a-zA-Z0-9]", "");
    }
    
}

