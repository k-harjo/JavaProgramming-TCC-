//E2.14

public class RandomPrice {
    public static void main(String[] args) {
        double randomPrice = 10.0 + Math.random() * 9.95;
        System.out.println("Random Price: $" + String.format("%.2f", randomPrice));
    }
}
