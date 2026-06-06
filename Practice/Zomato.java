package Practice;
import java.util.Scanner;

public class Zomato {

    static Scanner sc = new Scanner(System.in);

    // Food Order
    static double orderFood() {

        System.out.println("\n========== FOOD MENU ==========");
        System.out.println("1. Misal      - Rs.250");
        System.out.println("2. Burger     - Rs.300");
        System.out.println("3. Pizza      - Rs.500");
        System.out.println("4. Sandwich   - Rs.200");

        System.out.print("Select Food: ");
        int choice = sc.nextInt();

        double price = 0;

        switch(choice) {

            case 1:
                price = 250;
                break;

            case 2:
                price = 300;
                break;

            case 3:
                price = 500;
                break;

            case 4:
                price = 200;
                break;

            default:
                System.out.println("Invalid Food Item!");
                return 0;
        }

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        return price * qty;
    }

    // Restaurant Selection + Delivery Charges
    static double deliveryCharges(double foodPrice) {

        System.out.println("\n========== RESTAURANTS ==========");
        System.out.println("1. Hotel A (5 KM)");
        System.out.println("2. Hotel B (15 KM)");
        System.out.println("3. Hotel C (25 KM)");
        System.out.println("4. Hotel D (35 KM)");

        System.out.print("Select Restaurant: ");
        int choice = sc.nextInt();

        int distance = 0;

        switch(choice) {

            case 1:
                distance = 5;
                break;

            case 2:
                distance = 15;
                break;

            case 3:
                distance = 25;
                break;

            case 4:
                distance = 35;
                break;

            default:
                System.out.println("Invalid Restaurant!");
                return foodPrice;
        }

        System.out.println("Food is coming from " + distance + " KM");

        if(distance > 10 && distance < 20) {

            foodPrice = foodPrice + (distance * 2);
            System.out.println("Delivery Charge = Rs." + (distance * 2));
        }
        else if(distance >= 20 && distance < 30) {

            foodPrice = foodPrice + (distance * 3);
            System.out.println("Delivery Charge = Rs." + (distance * 3));
        }
        else if(distance >= 30) {

            foodPrice = foodPrice + (distance * 4);
            System.out.println("Delivery Charge = Rs." + (distance * 4));
        }
        else {

            System.out.println("Free Delivery");
        }

        return foodPrice;
    }

    // Platform Fee
    static double platformFee(double foodPrice) {

        double fee = 10;

        System.out.println("Platform Fee Added = Rs." + fee);

        return foodPrice + fee;
    }

    // Coupon Section
    static double applyCoupon(double foodPrice) {

        System.out.print("\nDo you want to apply a coupon? (Y/N): ");
        char coupon = sc.next().charAt(0);

        if(coupon == 'Y' || coupon == 'y') {

            System.out.println("\n========== COUPONS ==========");
            System.out.println("IPLRCB    -> 25% OFF");
            System.out.println("WELCOME10 -> 10% OFF (Min Bill Rs.500)");
            System.out.println("FIRST50   -> Rs.50 OFF (Min Bill Rs.300)");
            System.out.println("SAVE100   -> Rs.100 OFF (Min Bill Rs.1000)");
            System.out.println("FOODIE20  -> 20% OFF (Min Bill Rs.2000)");

            System.out.print("Enter Coupon Code: ");
            String code = sc.next();

            if(code.equalsIgnoreCase("IPLRCB")) {

                double discount = foodPrice * 0.25;

                foodPrice = foodPrice - discount;

                System.out.println("Coupon Applied Successfully!");
                System.out.println("Discount = Rs." + discount);
            }

            else if(code.equalsIgnoreCase("WELCOME10")) {

                if(foodPrice >= 500) {

                    double discount = foodPrice * 0.10;

                    foodPrice = foodPrice - discount;

                    System.out.println("Coupon Applied Successfully!");
                    System.out.println("Discount = Rs." + discount);
                }
                else {

                    System.out.println("Minimum Bill Required = Rs.500");
                }
            }

            else if(code.equalsIgnoreCase("FIRST50")) {

                if(foodPrice >= 300) {

                    foodPrice = foodPrice - 50;

                    System.out.println("Coupon Applied Successfully!");
                    System.out.println("Discount = Rs.50");
                }
                else {

                    System.out.println("Minimum Bill Required = Rs.300");
                }
            }

            else if(code.equalsIgnoreCase("SAVE100")) {

                if(foodPrice >= 1000) {

                    foodPrice = foodPrice - 100;

                    System.out.println("Coupon Applied Successfully!");
                    System.out.println("Discount = Rs.100");
                }
                else {

                    System.out.println("Minimum Bill Required = Rs.1000");
                }
            }

            else if(code.equalsIgnoreCase("FOODIE20")) {

                if(foodPrice >= 2000) {

                    double discount = foodPrice * 0.20;

                    foodPrice = foodPrice - discount;

                    System.out.println("Coupon Applied Successfully!");
                    System.out.println("Discount = Rs." + discount);
                }
                else {

                    System.out.println("Minimum Bill Required = Rs.2000");
                }
            }

            else {

                System.out.println("Invalid Coupon Code!");
            }
        }

        return foodPrice;
    }

    // GST
    static double GST(double foodPrice) {

        double gst = foodPrice * 0.07;

        System.out.println("GST (7%) = Rs." + gst);

        return foodPrice + gst;
    }

    // Estimated Delivery Time
    static void estimatedTime() {

        int time = (int)(Math.random() * 30) + 20;

        System.out.println("Estimated Delivery Time = " + time + " Minutes");
    }

    // Payment Method
    static void paymentMethod() {

        System.out.println("\n========== PAYMENT ==========");
        System.out.println("1. UPI");
        System.out.println("2. Debit/Credit Card");
        System.out.println("3. Cash On Delivery");

        System.out.print("Select Payment Method: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Payment via UPI");
                break;

            case 2:
                System.out.println("Payment via Card");
                break;

            case 3:
                System.out.println("Cash On Delivery Selected");
                break;

            default:
                System.out.println("Invalid Payment Method");
        }
    }

    // Final Bill
    static void finalBill(double originalPrice,
                          double afterDelivery,
                          double afterPlatform,
                          double afterCoupon,
                          double finalAmount) {

        int orderId = (int)(Math.random() * 100000);

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Order ID               : " + orderId);
        System.out.println("Food Price             : Rs." + originalPrice);
        System.out.println("After Delivery Charges : Rs." + afterDelivery);
        System.out.println("After Platform Fee     : Rs." + afterPlatform);
        System.out.println("After Coupon Discount  : Rs." + afterCoupon);
        System.out.println("Final Amount (GST Inc) : Rs." + finalAmount);
        System.out.println("================================");
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      WELCOME TO ZOMATO 🍕");
        System.out.println("=================================");

        double originalPrice = orderFood();

        if(originalPrice == 0) {
            return;
        }

        double afterDelivery = deliveryCharges(originalPrice);

        double afterPlatform = platformFee(afterDelivery);

        double afterCoupon = applyCoupon(afterPlatform);

        double finalAmount = GST(afterCoupon);

        estimatedTime();

        paymentMethod();

        finalBill(
                originalPrice,
                afterDelivery,
                afterPlatform,
                afterCoupon,
                finalAmount
        );

        System.out.println("\nThank You For Ordering With Zomato");
    }
}