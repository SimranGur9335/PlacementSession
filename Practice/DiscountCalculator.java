package Practice;
import java.util.Scanner;

public class DiscountCalculator {

    static double calculateDiscount(double amount) {

        if (amount >= 5000) {
            return amount * 0.20;
        }
        else if (amount >= 3000) {
            return amount * 0.15;
        }
        else if (amount >= 1000) {
            return amount * 0.10;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Amount: ");
        double amount = sc.nextDouble();

        double discount = calculateDiscount(amount);
        double finalAmount = amount - discount;

        System.out.println("Purchase Amount = " + amount);
        System.out.println("Discount = " + discount);
        System.out.println("Final Amount = " + finalAmount);

        sc.close();
    }
}