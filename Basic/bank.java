package Basic;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Choice 1.Withdrawn 2.Deposite 3.Check Balance 4.Interest");
        int balance=500000;
        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount to Withdrawn");
                int withdrawn=sc.nextInt();
                if(balance>withdrawn){
                    balance=balance-withdrawn;
                    System.out.println("Ac"+withdrawn+"Debited from account"+"Remaining Balance is"+balance);
                }
                break;

            case 2:
                System.out.println("Enter Amount to Deposite:");
                int deposite=sc.nextInt();

                balance=balance+deposite;
                System.out.println("Available Balance is:"+balance);
                break;

            case 3:
                System.out.println("Available Balance is:"+balance);
                break;
            
            case 4:
                int rate=7;
                System.out.println("Enter Year :");
                int year=sc.nextInt();
                int intrest=(balance*rate*year)/100;
                System.out.println("Intrest for"+year+"on"+balance+"is:"+intrest);
                break;
            default:
                throw new AssertionError();
        }
    }
}
