import java.util.Scanner;

class CabBooking
{
    public static double taxi(int choice, int kms)
    {
        double fare = 0;

        if(choice == 1)
        {
            fare = kms * 10;
        }
        else if(choice == 2)
        {
            fare = kms * 25;
        }
        else if(choice == 3)
        {
            if(kms == 1)
            {
                fare = 25 * 30;
            }
            else if(kms == 2)
            {
                fare = 30 * 30;
            }
            else
            {
                fare = 40 * 30;
            }
        }

        return fare;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Rental");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Kms: ");
        int kms = sc.nextInt();

        double fare = taxi(choice, kms);

        System.out.println("Taxi Fare = " + fare);
    }
}