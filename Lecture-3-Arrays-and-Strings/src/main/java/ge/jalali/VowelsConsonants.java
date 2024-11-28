package ge.jalali;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;

        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (vowels.indexOf(character) != -1) {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
