//E2.8

public class HollePrinter {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String switched = original.replace("e", "x").replace("o", "e").replace("x", "o");

        System.out.println("Expected Result: Holle, Werld!");
        System.out.println("Actual Result: " + switched);
    }
}

