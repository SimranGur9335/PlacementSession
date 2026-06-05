import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000; // Initial Balance
        int choice;

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Fixed Deposit (SI @ 7%)");
        System.out.print("Enter Your Choice: ");

        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter Amount to Withdraw: ");
                double withdraw = sc.nextDouble();

                if(withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining Balance = " + balance);
                }
                else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 2:
                System.out.print("Enter Amount to Deposit: ");
                double deposit = sc.nextDouble();

                balance = balance + deposit;

                System.out.println("Deposit Successful");
                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                System.out.println("Current Balance = " + balance);
                break;

            case 4:
                double rate = 7;

                System.out.print("Enter FD Amount: ");
                double principal = sc.nextDouble();

                System.out.print("Enter Time (Years): ");
                double time = sc.nextDouble();

                double si = (principal * rate * time) / 100;
                double maturityAmount = principal + si;

                System.out.println("Simple Interest = " + si);
                System.out.println("Maturity Amount = " + maturityAmount);
                break;

            default:
                System.out.println("Invalid Choice! Please enter a number between 1 and 4.");
        }

        sc.close();
    }
}