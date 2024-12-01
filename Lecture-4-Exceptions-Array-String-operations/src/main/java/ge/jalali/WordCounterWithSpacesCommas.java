package ge.jalali;
import java.util.Scanner;
public class WordCounterWithSpacesCommas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sentence, words must be separated with spaces or commas: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("[, ]+");
        System.out.println("In sentence \"" + sentence + "\" there are " + words.length + " words.");
    }
}