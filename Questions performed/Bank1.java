import java.util.Scanner;

public class Bank1
{
    static double balance = 10000;

    public static void withdraw(Scanner sc)
    {
        System.out.print("Enter Amount to Withdraw: ");
        double withdraw = sc.nextDouble();

        if(withdraw <= balance)
        {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public static void deposit(Scanner sc)
    {
        System.out.print("Enter Amount to Deposit: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        System.out.println("Deposit Successful");
        System.out.println("Updated Balance = " + balance);
    }

    public static void checkBalance()
    {
        System.out.println("Current Balance = " + balance);
    }

    public static void fixedDeposit(Scanner sc)
    {
        double rate = 7;

        System.out.print("Enter FD Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;
        double maturityAmount = principal + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Maturity Amount = " + maturityAmount);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM MENU =====");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Fixed Deposit (SI @ 7%)");
        System.out.print("Enter Your Choice: ");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                withdraw(sc);
                break;

            case 2:
                deposit(sc);
                break;

            case 3:
                checkBalance();
                break;

            case 4:
                fixedDeposit(sc);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}