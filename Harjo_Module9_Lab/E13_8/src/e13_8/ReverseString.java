package e13_8;


public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseHelper("Hello World!", 4, 6));

    }

    public static String reverseSubstr(String text) {
        return reverseHelper(text, 0, text.length() - 1);
    }

    private static String reverseHelper(String text, int start, int end) {
        if (start >= end) {
            return text;
        }
        char first = text.charAt(start);
        char last = text.charAt(end);

        text = text.substring(0, start) + last + text.substring(start + 1, end) + first + text.substring(end + 1);
        return reverseHelper(text, start + 1, end - 1);
    }
}