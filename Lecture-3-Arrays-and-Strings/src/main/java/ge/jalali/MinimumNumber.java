package ge.jalali;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int arrLength = scanner.nextInt();
        int[] numbers = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Please enter number at position " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int minimum = numbers[0];
        for (int i = 1; i < arrLength; i++) {
            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }

        System.out.println("Minimum number is: " + minimum);
    }
}
