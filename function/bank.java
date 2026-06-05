import java.util.Scanner;

import Basic.bank;

public class bank {

    public int withdrawn(int amt,int balance){
         if (balance > amt) {
                    balance = balance - amt;
                }
        return balance;
    }
    public int deposite(int amt,int balance){
        balance=balance+amt;
        return balance;
    }
    public int checkBalance(int balance){
        return balance;
    }
    public int interest(int balance,int rate,int year){
        int intrest=(balance*rate*year)/100;
        return intrest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Choice 1.Withdrawn 2.Deposite 3.Check Balance 4.Interest");
        int balance = 500000;
        int choice = sc.nextInt();
        bank ob=new bank();

        switch (choice) {
            case 1:
                System.out.println("Enter amount to Withdrawn");
                int withdrawn = sc.nextInt();
                int result=ob.withdrawn(withdrawn,balance);
                System.out.println("Ac" + withdrawn + "Debited from account" + "Remaining Balance is" + result);
                break;

            case 2:
                System.out.println("Enter Amount to Deposite:");
                int deposite = sc.nextInt();
                balance = ob.deposite(deposite, balance);
                System.out.println("Available Balance is:" + balance);
                break;

            case 3:
                balance = ob.checkBalance(balance);
                System.out.println("Available Balance is:" + balance);
                break;

            case 4:
                int rate = 7;
                System.out.println("Enter Year :");
                int year = sc.nextInt();
                int intrest = ob.interest(balance, rate, year);
                System.out.println("Intrest for" + year + "on" + balance + "is:" + intrest);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
