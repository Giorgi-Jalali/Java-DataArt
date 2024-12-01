package ge.jalali;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word to check whether it is a palindrome: ");
        String pal = scanner.next();
        String palLowerCase = pal.toLowerCase();
        String reversed = "";
        for (int i = palLowerCase.length() - 1; i >= 0; i--) {
            reversed += palLowerCase.charAt(i);
        }
        if (palLowerCase.equals(reversed)) {
            System.out.println("Word " + pal + " is palindrome.");
        } else {
            System.out.println("Word " + pal + " is not palindrome.");
        }
    }
}