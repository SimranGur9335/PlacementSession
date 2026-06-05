import java.util.Scanner;

public class Zomato {

    Scanner sc = new Scanner(System.in);

    public void orderFood() {
        System.out.println("Welcome to Food Delivery Service!");
    }

    public int price() {

        System.out.print("Enter Food Name (Missal/Burger/Pasta/Sandwich): ");
        String foodName = sc.nextLine();

        if (foodName.equalsIgnoreCase("Missal")){
            return 200;
        }
        else if (foodName.equalsIgnoreCase("Burger")){
            return 100;
        }
        else if (foodName.equalsIgnoreCase("Pasta")){
             return 150;
        }
           
        else if (foodName.equalsIgnoreCase("Sandwich")){
             return 80;
        }
        System.out.println("Food Item Not Available!");
        return 0;
    }

    public int branchDistance() {

        System.out.println("\nAvailable Branches:");
        System.out.println("1. Pune Station");
        System.out.println("2. Pimpri");
        System.out.println("3. Chinchwad");
        System.out.println("4. Hinjewadi");

        System.out.print("Select Branch: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                return 5;
            case 2:
                return 12;
            case 3:
                return 18;
            case 4:
                return 25;
            default:
                return 0;
        }
    }

    public int deliveryCharge(int km) {

        if (km < 10)
            return 20;
        else if (km < 20)
            return 50;
        else
            return 100;
    }

    public boolean coupon() {

        sc.nextLine();

        System.out.print("Do you have a coupon? (yes/no): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            System.out.print("Enter Coupon Code: ");
            String code = sc.nextLine();

            return code.equalsIgnoreCase("JERRY");
        }

        return false;
    }

    public double applyCoupon(boolean coupon, int amount) {

        if (coupon)
            return amount - (0.25 * amount);

        return amount;
    }

    public double gst(double amount) {
        return amount + (0.07 * amount);
    }

    public void processOrder() {

        orderFood();

        int foodPrice = price();

        int distance = branchDistance();

        int delivery = deliveryCharge(distance);

        int subtotal = foodPrice + delivery;

        boolean validCoupon = coupon();

        double discountedAmount = applyCoupon(validCoupon, subtotal);

        double finalAmount = gst(discountedAmount);

        System.out.println("Food Price      : " + foodPrice);
        System.out.println("Delivery Charge : " + delivery);
        System.out.println("Subtotal        : " + subtotal);
        System.out.println("After Coupon    : " + discountedAmount);
        System.out.println("After GST       : " + finalAmount);
        System.out.println("Total Amount    : " + finalAmount);
    }

    public static void main(String[] args) {

        Zomato obj = new Zomato();

        obj.processOrder();
    }
}