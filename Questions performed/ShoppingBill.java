import java.util.Scanner;

class ShoppingBill
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        double discount = 0;
        double finalBill;

        if(bill >= 3000)
        {
            discount = bill * 25 / 100;
        }
        else if(bill >= 2000)
        {
            discount = bill * 20 / 100;
        }
        else if(bill >= 1000)
        {
            discount = bill * 10 / 100;
        }
        else
        {
            discount = 0;
        }

        finalBill = bill - discount;

        System.out.println("Bill Amount = " + bill);
        System.out.println("Discount = " + discount);
        System.out.println("Final Bill = " + finalBill);
    }
}