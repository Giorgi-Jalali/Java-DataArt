package ge.jalali;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int arrLength = scanner.nextInt();
        int[] numbers = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Please enter number at position " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Element at position " + i + " = " + numbers[i]);
        }
    }
}




























