package e13_7;


public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));

    }

    public static String reverse(String text) {
        String reversed = "";
        for (int i = 0; i < text.length(); i++) {
            reversed = text.charAt(i) + reversed;
        }
        return reversed;
    }
}
