import java.util.Scanner;

public class Discount {

    public int discountRate(int amount) {
        int discount = 0;

        if (amount >500 && amount <= 1000) {
            discount = 10;
        } else if (amount <= 500) {
            discount = 5;
        }else if (amount >1000 && amount <=2000){
            discount=15;
        }else if (amount >20000 && amount <= 3000){
            discount=20;
        }else{
            discount=25;
        }
        return discount;
    }
    public double discountprice(int amount,int discount){
        double discountamount=(amount *discount)/100;
        double finalamount=amount-discountamount;
        return finalamount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        Discount obj = new Discount();
        int discountRate=obj.discountRate(amount);
        double finalamount=obj.discountprice(amount, discountRate);

        System.out.println("Final Amount is: "+finalamount);

    }
}