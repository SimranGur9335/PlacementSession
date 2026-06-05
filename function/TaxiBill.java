
import java.util.Scanner;

public class TaxiBill {
    Scanner sc = new Scanner(System.in);

    public double bill(String typeOfTaxi, double km) {
        double bill = 0.0;
        if (typeOfTaxi.equals("Bike")) {
            bill = 10 * km;
        } else if (typeOfTaxi.equals("Car")) {
            bill = 25 * km;
        } else if (typeOfTaxi.equals("Rental")) {
            System.out.println("For How many Hr You want to Rental:");
            int hr = sc.nextInt();
            if (hr == 1) {
                bill = 25 * km;
            } else if (hr == 2) {
                bill = 30 * km;
            } else {
                bill = 40 * km;
            }
        }else{
            System.out.println("Chal Nikal be Nalleeee,Type of Taxi is not available");
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxiBill ob = new TaxiBill();

        System.out.print("Enter Taxi Type (Bike/Car/Rental): ");
        String typeOfTaxi = sc.next();

        System.out.print("Enter Distance (km): ");
        double km = sc.nextDouble();

        double bill = ob.bill(typeOfTaxi, km);

        System.out.println("Total Bill: " + bill);
    }
}
