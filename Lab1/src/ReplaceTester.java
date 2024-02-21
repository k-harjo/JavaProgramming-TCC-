
public class ReplaceTester {
    public static void main(String[] args) {
        String original = "Mississippi";
        String replaced = original.replace("i", "!").replace("s", "$");
        System.out.println("Original String: " + original);
        System.out.println("Actual Result: " + replaced);
    }
}