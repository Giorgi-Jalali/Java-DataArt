package ge.jalali;
import java.util.Scanner;
public class ArrayIndexBoundsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arrLength = scanner.nextInt();
        int[] numbers = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Please enter number at position " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Enter index of a value: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Value on index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index " + index + " was out of bounds.");
        }
        System.out.println("Program continues...");
    }
}