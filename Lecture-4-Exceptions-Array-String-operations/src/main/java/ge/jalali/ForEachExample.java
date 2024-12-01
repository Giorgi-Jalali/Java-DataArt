package ge.jalali;
public class ForEachExample {
    public static void main(String[] args) {
        String[] listOfStrings = new String[]{"Java", "is", "A", "Great", "Programming", "Language"};
        for (String str : listOfStrings) {
            System.out.println(str + " ");
        }
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word + " ");
        }
    }
}