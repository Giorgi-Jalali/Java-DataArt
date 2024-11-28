package ge.jalali;

public class StringArrays {
    public static void main(String[] args) {

        int[] scores = {100, 95, 80, 87, 60};
        String[] students = {"John", "Mary", "Bob", "Alice", "Jack"};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i] + ", score: " + scores[i]);
        }
    }
}
