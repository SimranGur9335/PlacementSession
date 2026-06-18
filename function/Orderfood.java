import java.util.Scanner;

public class Orderfood {

    Scanner sc = new Scanner(System.in);
    public void orderFood() {
        System.out.println("Welcome to Food Delivery Service!");
    }

    public int price() {
        orderFood();
        System.out.println("Enter the Name of Food: ");
        sc.nextLine();      
        String foodName = sc.nextLine();   
        if(foodName.equals("Missal")){
            return 200;
        }else if(foodName.equals("Burger")){
            return 100;
        }else if(foodName.equals("Pasta")){
            return 150;
        }else if(foodName.equals("Sandwich")){
            return 80; 
        }else{
            System.out.println("Sorry, we don't have that food item.");
            return 0;
        }
    }

    public int deliveryCharge(int km) {

        if (km < 10) {
            return 20;
        } else if (km < 20) {
            return 50;
        } else {
            return 100;
        }
    }

    public boolean coupon(String code) {
        return code.equals("JERRY");
    }

    public double applyCoupon(boolean coupon, int price) {

        if (coupon) {
            return price - (0.25 * price);
        }

        return price;
    }

    public double gst(double amount) {
        return amount + (0.07 * amount);
    }

    public double totalPrice(double finalFoodPrice) {
        return finalFoodPrice;
    }

    public static void main(String[] args) {

        Orderfood obj = new Orderfood();

        int price = obj.price();

        System.out.print("Enter Delivery Distance (km): ");
        int km = obj.sc.nextInt();

        int deliveryCharge = obj.deliveryCharge(km);

        int subtotal = price + deliveryCharge;

        System.out.print("Do you have a coupon? (yes/no): ");
        String answer = obj.sc.next();

        boolean validCoupon = false;

        if (answer.equalsIgnoreCase("yes")) {

            System.out.print("Enter Coupon Code: ");
            String code = obj.sc.next();

            validCoupon = obj.coupon(code);

            if (validCoupon) {
                System.out.println("Coupon Applied Successfully!");
            } else {
                System.out.println("Invalid Coupon Code!");
            }
        } else {
            System.out.println("No Coupon Applied.");
        }

        double discountedPrice = obj.applyCoupon(validCoupon, subtotal);

        double finalFoodPrice = obj.gst(discountedPrice);

        System.out.println();
        double total = obj.totalPrice(finalFoodPrice);
        System.out.println("Food Price: " + price);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("After Coupon: " + discountedPrice);
        System.out.println("After GST: " + finalFoodPrice);
        System.out.println("Total Amount: " + total);
    }
}