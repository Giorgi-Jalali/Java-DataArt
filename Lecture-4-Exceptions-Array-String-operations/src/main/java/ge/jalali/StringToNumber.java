package ge.jalali;
public class StringToNumber {
    public static void main(String[] args) {
        String text = "24";
        double number = Double.parseDouble(text);
        int number2 = 0;
        try {
            number2 = Integer.parseInt(text);
            System.out.println(number2);
        } catch (NumberFormatException ex) {
            System.out.println("Some text...");
        }
        System.out.println(number);
        System.out.println(number2);
    }
}