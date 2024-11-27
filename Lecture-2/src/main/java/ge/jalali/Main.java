package ge.jalali;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the width of rectangle?");
        double width = scanner.nextDouble();
        System.out.println("What is the length of rectangle?");
        double length = scanner.nextDouble();

        System.out.println("Rectangle perimeter is " + (width + length) * 2);
        System.out.println("Rectangle area is " + width * length);

    }
}



