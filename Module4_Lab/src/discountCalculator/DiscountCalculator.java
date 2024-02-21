package discountCalculator;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: ");
        double cost = scanner.nextDouble();
        double couponPercentage = 0.0;

        if (cost < 10) {
            couponPercentage = 0.0;
        } else if (cost >= 10 && cost <= 60) {
            couponPercentage = 0.08;
        } else if (cost > 60 && cost <= 150) {
            couponPercentage = 0.10;
        } else if (cost > 150 && cost <= 210) {
            couponPercentage = 0.12;
        } else if (cost > 210) {
            couponPercentage = 0.14;
        }

        double couponValue = cost * couponPercentage;

        System.out.printf("You win a discount coupon of $ %.2f. (%d%% of your purchase)%n", couponValue, (int) (couponPercentage * 100));

        scanner.close();
    }
}
