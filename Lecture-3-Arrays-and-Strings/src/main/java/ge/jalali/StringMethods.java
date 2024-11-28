package ge.jalali;

public class StringMethods {
    public static void main(String[] args) {

        String text = "Hello";
        char ch = text.charAt(1);
        System.out.println("Char at 1 in word " + text + " is " + ch);

        int length = text.length();
        System.out.println("Length: " + length);

        text = "Programming";
        String sub = text.substring(0, 4);
        System.out.println("Substring is: " + sub);

        text = "Find me her";
        int index = text.indexOf("me");
        System.out.println("Index is: " + index);

        text = "Java is fun";
        String newText = text.replace('a', '@');
        System.out.println("New text: " + newText);

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        text = "     john Doe    ";
        System.out.println("Trimmed text: " + text.trim());

        text = "file.txt";
        System.out.println("Starts with file" + text.startsWith("file"));
        System.out.println("Ends with .txt: " + text.endsWith(".txt"));

        text = "Java is popular";
        System.out.println("Contains word Java: " + text.contains("Java"));

        String a = "java";
        String b = "JAVA";
        System.out.println("Are equal: " + a.equals(b));
        System.out.println("Are equal with ignore case: " + a.equalsIgnoreCase(b));

        text = "";
        System.out.println("Is empty: " + text.isEmpty());
    }
}



















