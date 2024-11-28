package ge.jalali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] scores = {10, 5, 300, 40, 350};

//        int arrLength = scores.length;
//        int sum = 0;
//        for (int i = 0; i < arrLength; i++) {
//            sum += scores[i];
//        }
//
//        double average = (double) sum / arrLength;
//
//        System.out.println("Average of this array is " + average);

        int largest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > largest) {
                largest = scores[i];
            }
        }
        System.out.println("Largest number is " + largest);
    }
}

















