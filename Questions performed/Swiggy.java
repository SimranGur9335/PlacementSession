import java.util.Scanner;

class Swiggy
{
    public static double deliveryCharge(double distance)
    {
        if(distance < 10)
        {
            return 20;
        }
        else if(distance <= 20)
        {
            return 30;
        }
        else
        {
            return 50;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Food Amount: ");
        double amount = sc.nextDouble();

        if(amount < 250)
        {
            System.out.println("Minimum Order Amount Should Be Rs.250");
            return;
        }

        System.out.print("Enter Distance (KM): ");
        double distance = sc.nextDouble();

        double delivery = deliveryCharge(distance);

        double discount = 0;

        System.out.print("Do You Have a Coupon? (Y/N): ");
        char choice = sc.next().charAt(0);

        if(choice == 'Y' || choice == 'y')
        {
            System.out.print("Enter Coupon Code: ");
            String coupon = sc.next();

            if(coupon.equalsIgnoreCase("IPLRCB"))
            {
                discount = amount * 25 / 100;
                System.out.println("Coupon Applied Successfully!");
            }
            else
            {
                System.out.println("Invalid Coupon Code!");
            }
        }
        else
        {
            System.out.println("No Coupon Applied.");
        }

        double subtotal = amount - discount + delivery;
        double gst = subtotal * 7 / 100;
        double finalAmount = subtotal + gst;

        System.out.println("\n========== BILL ==========");
        System.out.println("Food Amount      : " + amount);
        System.out.println("Distance         : " + distance + " KM");
        System.out.println("Discount         : " + discount);
        System.out.println("Delivery Charge  : " + delivery);
        System.out.println("GST (7%)         : " + gst);
        System.out.println("Final Amount     : " + finalAmount);

        sc.close();
    }
}