package ge.jalali;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add minimum number");
        int minNum = scanner.nextInt();
        System.out.println("Add maximum number");
        int maxNum = scanner.nextInt();

        int sum = 0;

        for (int i = minNum; i <= maxNum; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum is: " + sum);

    }
}
























