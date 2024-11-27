package ge.jalali;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number to calculate it's factorial");
        int num = scanner.nextInt();
        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("Number " + num + " factorial is: " + factorial);
    }
}
