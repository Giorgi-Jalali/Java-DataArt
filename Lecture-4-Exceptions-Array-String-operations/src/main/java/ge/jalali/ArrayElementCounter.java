package ge.jalali;

import java.util.Scanner;

public class ArrayElementCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] numArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter number at position " + i + ": ");
            numArray[i] = scanner.nextInt();
        }
        System.out.println("Enter target number: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arrLength; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("Number " + target + " appears " + count + " times");
    }
}
