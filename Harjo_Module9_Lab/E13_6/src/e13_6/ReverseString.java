package e13_6;


public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStr("Hello World!"));

    }

    public static String reverseStr(String text) {
        if (text.isEmpty()) {
            return text;
        }
        return text.charAt(text.length() - 1) + reverseStr(text.substring(0, text.length() - 1));
    }
}