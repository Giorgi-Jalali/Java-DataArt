package ge.jalali;

import java.util.Scanner;

public class MaskCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber;

        while (true) {
            System.out.print("Enter a 16-digit card number: ");
            cardNumber = scanner.nextLine();

            if (cardNumber.length() < 16 || cardNumber.length() > 19) {
                System.out.println("Invalid card number. The input must be 16 digits (spaces optional).");
                continue;
            }

            String lastFourDigits = "";
            for (int i = cardNumber.length() - 4; i < cardNumber.length(); i++) {
                lastFourDigits += cardNumber.charAt(i);
            }

            System.out.println("**** **** **** " + lastFourDigits);
            break;
        }
    }
}